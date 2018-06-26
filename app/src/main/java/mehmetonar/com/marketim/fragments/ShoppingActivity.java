package mehmetonar.com.marketim.fragments;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.adapter.HorizontalAdapter;
import mehmetonar.com.marketim.data.model.Data;
import mehmetonar.com.marketim.util.AddPhotoBottomDialogFragment;

public class ShoppingActivity extends AppCompatActivity {

    private RecyclerView horizontal_recycler_view;
    private HorizontalAdapter horizontalAdapter;
    private List<Data> data;

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
        horizontalAdapter = new HorizontalAdapter(data, getApplication());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(ShoppingActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(horizontalAdapter);

        //body list


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
