package mehmetonar.com.marketim.data;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import mehmetonar.com.marketim.data.model.MarketModel;

public class MarketHelper {

    public List<MarketModel> getMarkerLocation(){


        List<MarketModel> markerList = new ArrayList<>();
        markerList.add(new MarketModel("1","Mehmet Market","konya",5,new LatLng(40.929202720341294,29.301394854743183)));
        markerList.add(new MarketModel("1","Erdal Bakkal","leyla mecnun",7,new LatLng(40.70939739873268,29.2216827539186)));
        markerList.add(new MarketModel("1","Durdu Bakkal","düzce",10,new LatLng(40.71939739873268,29.2296827539186)));
        markerList.add(new MarketModel("1","Ali Bakkal","istanbul",1,new LatLng(40.72739739873268,29.2011827539186)));
        markerList.add(new MarketModel("1","Veli Bakkal","ankara",1,new LatLng(40.72139739873268,29.2096827539186)));
        markerList.add(new MarketModel("1","Veli Bakkal","ankara",1,new LatLng(39.96247933794853,32.70779774988111)));



        return markerList;
    }
}
