package mehmetonar.com.marketim.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.model.Marker;

import mehmetonar.com.marketim.R;

@SuppressLint("ValidFragment")
public class AddPhotoBottomDialogFragment extends BottomSheetDialogFragment {
    //Component Declaration
    private Button goMarketPage;
    private TextView marketTitle;
    private TextView marketAdress;

    public AddPhotoBottomDialogFragment(@Nullable Context context, @Nullable Marker marker) {

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
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_sheet, container,false);


       goMarketPage=view.findViewById(R.id.go_market);
       goMarketPage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

        return view;

    }

}