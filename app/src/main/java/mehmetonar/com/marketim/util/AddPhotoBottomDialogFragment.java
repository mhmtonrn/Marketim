package mehmetonar.com.marketim.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.maps.model.Marker;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.fragments.ShoppingActivity;

@SuppressLint("ValidFragment")
public class AddPhotoBottomDialogFragment extends BottomSheetDialogFragment {
    public static final String MARKET_ID = "market";
    public static final String MARKET_NAME = "market_name";

    //Component Declaration
    private Button goMarketPage;
    private TextView marketTitle;
    private TextView marketAdress;
    private SeekBar seekBar;
    private Marker marker;
    private Context context;

    public AddPhotoBottomDialogFragment(@Nullable Context context, @Nullable Marker marker) {
        this.context = context;
        this.marker = marker;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);

        marketTitle = view.findViewById(R.id.bttm_sheet_market_name);
        marketAdress = view.findViewById(R.id.txt_market_adress);
        seekBar=view.findViewById(R.id.seekBar);

        marketTitle.setText(marker.getTitle());
        marketAdress.setText(marker.getSnippet());

        goMarketPage = view.findViewById(R.id.go_market);
        goMarketPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent shoppingIntent = new Intent(context, ShoppingActivity.class);
                shoppingIntent.putExtra(MARKET_ID,marker.getTitle());//marketın id buradan çekilecek
                shoppingIntent.putExtra(MARKET_NAME,marker.getTitle());//marketın id buradan çekilecek
                startActivity(shoppingIntent);

            }
        });

        return view;

    }

}