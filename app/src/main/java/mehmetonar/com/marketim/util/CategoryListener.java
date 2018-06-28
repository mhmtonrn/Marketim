package mehmetonar.com.marketim.util;

import java.util.ArrayList;

import mehmetonar.com.marketim.data.model.ProductModel;


public interface CategoryListener {

    void onSuccessGettingProductsForCategory(ArrayList<ProductModel> productsForCategory);

}
