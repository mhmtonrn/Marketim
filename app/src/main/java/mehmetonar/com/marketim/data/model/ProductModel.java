package mehmetonar.com.marketim.data.model;

public class ProductModel {
    private String productTitle;
    private String productDesc;
    private String productAmount;
    private String imageUrl;


    public ProductModel(String productTitle, String productDesc, String productAmount, String imageUrl) {
        this.productTitle = productTitle;
        this.productDesc = productDesc;
        this.productAmount = productAmount;
        this.imageUrl = imageUrl;
    }

    public ProductModel() {
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
