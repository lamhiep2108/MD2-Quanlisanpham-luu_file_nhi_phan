import java.io.Serializable;

public class Product implements Serializable {
    private  int productCode;
    private String productName;
    private String productionDelay;
    private double price;

    public Product() {
    }

    public Product(int productCode, String productName, String productionDelay, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productionDelay = productionDelay;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductionDelay() {
        return productionDelay;
    }

    public void setProductionDelay(String productionDelay) {
        this.productionDelay = productionDelay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productionDelay='" + productionDelay + '\'' +
                ", price=" + price +
                '}';
    }
}
