package mehmetonar.com.marketim.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.data.model.CartModel;


@SuppressLint("ValidFragment")
public class CartFragment extends Fragment {
    Context context;
    CartModel cartModel;


    public CartFragment(Context context, @Nullable CartModel cartModel) {
        this.context = context;
        this.cartModel = cartModel;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_card, container, false);


        return view;
    }


}
