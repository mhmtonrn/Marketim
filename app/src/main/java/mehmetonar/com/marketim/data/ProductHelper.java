package mehmetonar.com.marketim.data;

import java.util.ArrayList;
import java.util.List;

import mehmetonar.com.marketim.data.model.ProductModel;
import mehmetonar.com.marketim.util.Category;

public class ProductHelper {

    public List<ProductModel> getProductForCategory(String category) {

        List<ProductModel> getProduct = new ArrayList<>();

        switch (category) {
            case Category.sebze:
                getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
                getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
                break;
            case Category.meyve:
                getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
                break;

            case Category.bakliyat:
                getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
                break;

            default:
                getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
                break;


        }
        return getProduct;
    }

    public List<ProductModel> getAllProducts() {
        List<ProductModel> getProduct = new ArrayList<>();
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));
        getProduct.add(new ProductModel("Domates", "domates", "25,00", "http://www.fidefabrikasi.com/image/cache/data/fide/android-f1-domates-fidesi-182x175_0_0.jpg"));
        getProduct.add(new ProductModel("Salatalık", "salatalık", "45,00", "http://www.kalbimdekipatiler.com/wp-content/uploads/2017/02/salatalik-1-1068x712.jpg"));


        return getProduct;
    }
}
