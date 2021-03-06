package mehmetonar.com.marketim.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import mehmetonar.com.marketim.R;
import java.util.Collections;
import java.util.List;
import mehmetonar.com.marketim.data.model.ProductModel;
import mehmetonar.com.marketim.util.listeners.ProductSelectListener;

public class BodyListAdapter extends RecyclerView.Adapter<BodyListAdapter.MyViewHolder> {


        List<ProductModel> horizontalList = Collections.emptyList();
        Context context;
        ProductSelectListener productSelectListener;


        public BodyListAdapter(List<ProductModel> horizontalList, Context context, @Nullable ProductSelectListener productSelectListener) {
            this.horizontalList = horizontalList;
            this.context = context;
            this.productSelectListener= productSelectListener;

        }


        public class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView productImage;
            TextView productTitle;
            TextView productDesc;
            TextView productAmount;
            FloatingActionButton fab;

            public MyViewHolder(View view) {
                super(view);
                productImage=(ImageView) view.findViewById(R.id.img_product_image);
                productTitle=(TextView) view.findViewById(R.id.txt_product_title);
                productDesc=(TextView) view.findViewById(R.id.txt_product_desc);
                productAmount=(TextView) view.findViewById(R.id.txt_product_money);
                fab=view.findViewById(R.id.btn_product_add);

            }
        }



        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_row, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {

            Picasso.get().load(horizontalList.get(position).getImageUrl()).into(holder.productImage);
            holder.productTitle.setText(horizontalList.get(position).getProductTitle());
            holder.productDesc.setText(horizontalList.get(position).getProductDesc());
            holder.productAmount.setText(horizontalList.get(position).getProductAmount());


            holder.fab.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).getProductTitle().toString();
                    //getting quentity

                    productSelectListener.onProductAdd(2,horizontalList.get(position));
                    Toast.makeText(context, list+R.string.product_added_to_cart, Toast.LENGTH_SHORT).show();
                }

            });

        }


        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }