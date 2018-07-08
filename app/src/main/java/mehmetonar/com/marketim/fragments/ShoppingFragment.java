package mehmetonar.com.marketim.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.adapter.BodyListAdapter;
import mehmetonar.com.marketim.adapter.TopListAdapter;
import mehmetonar.com.marketim.data.model.CartModel;
import mehmetonar.com.marketim.data.model.Data;
import mehmetonar.com.marketim.data.model.ProductModel;
import mehmetonar.com.marketim.util.Category;
import mehmetonar.com.marketim.util.listeners.CategoryListener;
import mehmetonar.com.marketim.util.listeners.ProductSelectListener;


@SuppressLint("ValidFragment")
public class ShoppingFragment extends Fragment implements View.OnClickListener {
    private RecyclerView horizontal_recycler_view;
    private TopListAdapter topListAdapter;
    private List<Data> data;
    //body list
    private RecyclerView bodyRecycleView;
    private BodyListAdapter bodyListAdapter;
    private Map<Integer, ProductModel> productList = new HashMap<>();
    CartModel cartModel;
    Context context;
    Marker marker;


    public ShoppingFragment(Context context, Marker marker) {
        // Required empty public constructor
        this.context = context;
        this.marker = marker;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basicInit();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(this);


        //top list
        horizontal_recycler_view = view.findViewById(R.id.top_list_list);
        data = fill_with_data();
        topListAdapter = new TopListAdapter(data, context, new CategoryListener() {
            @Override
            public void onSuccessGettingProductsForCategory(ArrayList<ProductModel> productsForCategory) {
                //body list
                bodyRecycleView = view.findViewById(R.id.body_list_list);
                bodyListAdapter = new BodyListAdapter(productsForCategory, context, new ProductSelectListener() {
                    @Override
                    public void onProductAdd(int quentity, ProductModel product) {
                        productList.put(quentity,product);
                    }
                });
                LinearLayoutManager horizontalLayoutManagerBody = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL, false);
                bodyRecycleView.setLayoutManager(new GridLayoutManager(context,2));
                bodyRecycleView.setAdapter(bodyListAdapter);


            }
        });

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(topListAdapter);


        return view;

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.fab:

                if (!productList.isEmpty()) {
                    Snackbar.make(view, "Ürünle Seçildi Sepete Git" , Snackbar.LENGTH_LONG)
                            .setAction("Sepete Git", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    cartModel = new CartModel(11111111,productList);
                                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                                    ft.replace(R.id.map_fragment, new CartFragment(context,cartModel)).commit();
                                }
                            }).show();
                }else{
                    Snackbar.make(view, "Lütfen Sepete Ürün Ekleyin", Snackbar.LENGTH_LONG).show();
                }
                break;
        }
    }


    @SuppressLint("NewApi")
    private void basicInit() {
        Window window = getActivity().getWindow();
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }



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


}
