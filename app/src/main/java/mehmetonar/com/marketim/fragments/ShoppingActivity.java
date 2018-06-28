package mehmetonar.com.marketim.fragments;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.adapter.BodyListAdapter;
import mehmetonar.com.marketim.adapter.TopListAdapter;
import mehmetonar.com.marketim.data.ProductHelper;
import mehmetonar.com.marketim.data.model.Data;
import mehmetonar.com.marketim.data.model.ProductModel;
import mehmetonar.com.marketim.util.AddPhotoBottomDialogFragment;
import mehmetonar.com.marketim.util.Category;
import mehmetonar.com.marketim.util.CategoryListener;

public class ShoppingActivity extends AppCompatActivity {

    //top list
    private RecyclerView horizontal_recycler_view;
    private TopListAdapter topListAdapter;
    private List<Data> data;
    //body list
    private RecyclerView bodyRecycleView;
    private BodyListAdapter bodyListAdapter;
    private List<ProductModel> productModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        basicInıt();

        Bundle extras = getIntent().getExtras();
        String value = extras.getString(AddPhotoBottomDialogFragment.MARKET_NAME);
        toolbar.setTitle(value);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });






        //top list
        horizontal_recycler_view = findViewById(R.id.top_list_list);
        data = fill_with_data();
        topListAdapter = new TopListAdapter(data, getApplication(), new CategoryListener() {
            @Override
            public void onSuccessGettingProductsForCategory(ArrayList<ProductModel> productsForCategory) {
                //body list
                bodyRecycleView = findViewById(R.id.body_list_list);
                bodyListAdapter = new BodyListAdapter(productsForCategory, getApplication());
                LinearLayoutManager horizontalLayoutManagerBody = new LinearLayoutManager(ShoppingActivity.this,LinearLayoutManager.VERTICAL, false);
                bodyRecycleView.setLayoutManager(new GridLayoutManager(getApplication(),2));
                bodyRecycleView.setAdapter(bodyListAdapter);

            }
        });

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(ShoppingActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(topListAdapter);













    }


    /**
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * @return
     */

    private List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();

        data.add(new Data(android.R.mipmap.sym_def_app_icon, Category.sebze));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, Category.meyve));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, Category.bakliyat));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));
        data.add(new Data(android.R.mipmap.sym_def_app_icon, "Image 2"));


        return data;

    }


    @SuppressLint("NewApi")
    private void basicInıt() {
        Window window = getWindow();
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

}
