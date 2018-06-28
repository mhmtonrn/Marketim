package mehmetonar.com.marketim.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.data.ProductHelper;
import mehmetonar.com.marketim.data.model.Data;
import mehmetonar.com.marketim.data.model.ProductModel;
import mehmetonar.com.marketim.util.Category;
import mehmetonar.com.marketim.util.CategoryListener;


public class TopListAdapter extends RecyclerView.Adapter<TopListAdapter.MyViewHolder> {


    List<Data> horizontalList = Collections.emptyList();
    Context context;
    List<ProductModel> productModels;
    CategoryListener categoryListener;


    public TopListAdapter(List<Data> horizontalList, Context context, CategoryListener categoryListener) {
        this.horizontalList = horizontalList;
        this.context = context;
        this.categoryListener = categoryListener;
        /**
         * load top list on shoppingproductActivity load all products
         */
        categoryListener.onSuccessGettingProductsForCategory((ArrayList<ProductModel>) new ProductHelper().getAllProducts());

    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtview;

        public MyViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.top_list_image);
            txtview = (TextView) view.findViewById(R.id.top_list_text);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.imageView.setImageResource(horizontalList.get(position).imageId);
        holder.txtview.setText(horizontalList.get(position).txt);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String category = horizontalList.get(position).txt.toString();
                Toast.makeText(context, category, Toast.LENGTH_SHORT).show();


                ///gelenn kategori adına göre

                ProductHelper productHelper = new ProductHelper();
                switch (category) {
                    case Category.sebze:
                        productModels=productHelper.getProductForCategory(Category.sebze);
                        categoryListener.onSuccessGettingProductsForCategory((ArrayList<ProductModel>) productModels);
                        break;

                    case Category.meyve:
                        productModels=productHelper.getProductForCategory(Category.meyve);
                        categoryListener.onSuccessGettingProductsForCategory((ArrayList<ProductModel>) productModels);
                        break;

                    case Category.bakliyat:
                        productModels=productHelper.getAllProducts();
                        categoryListener.onSuccessGettingProductsForCategory((ArrayList<ProductModel>) productModels);
                        break;

                        default:
                            break;


                }
            }

        });

    }


    @Override
    public int getItemCount() {
        return horizontalList.size();
    }
}