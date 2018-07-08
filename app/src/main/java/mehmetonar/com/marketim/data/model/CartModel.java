package mehmetonar.com.marketim.data.model;

import java.util.ArrayList;
import java.util.Map;

public class CartModel {
    private int cartId;
    private Map<Integer, ProductModel> products;

    public CartModel(int cartId, Map<Integer, ProductModel> products) {
        this.cartId = cartId;
        this.products = products;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Map<Integer, ProductModel> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, ProductModel> products) {
        this.products = products;
    }
}
