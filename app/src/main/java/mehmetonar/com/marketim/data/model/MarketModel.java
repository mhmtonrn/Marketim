package mehmetonar.com.marketim.data.model;

import com.google.android.gms.maps.model.LatLng;

public class MarketModel {
    private String marketId;
    private String marketName;
    private String marketAdress;
    private int marketRate;
    private LatLng location;

    public MarketModel(String marketId,String marketName, String marketAdress, int marketRate, LatLng location) {
        this.marketName = marketName;
        this.marketAdress = marketAdress;
        this.marketRate = marketRate;
        this.location = location;
        this.marketId=marketId;
    }

    public MarketModel() {
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketAdress() {
        return marketAdress;
    }

    public void setMarketAdress(String marketAdress) {
        this.marketAdress = marketAdress;
    }

    public int getMarketRate() {
        return marketRate;
    }

    public void setMarketRate(int marketRate) {
        this.marketRate = marketRate;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }
}
