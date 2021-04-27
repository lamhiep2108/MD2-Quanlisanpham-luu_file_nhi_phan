import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner=new Scanner(System.in);
    List<Product>products=new ArrayList<>();
    public void add(Product product){
        products.add(product);
    }
    public void showAll(){
        for (Product p:products) {
            System.out.println(p);
        }
    }
    public void search(){
        System.out.println("enter product code");
        int productCode=Integer.parseInt(scanner.nextLine());
        for (Product product:products) {
            if (productCode==product.getProductCode()){
                System.out.println(product);
            }
        }
    }
    public void writeToFile(String path){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Product> readDateFormFile(String path){
        List<Product>products=new ArrayList<>();
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
            products=(List<Product>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public Product getProduct(){
        System.out.println("enter product code");
        int productCode=Integer.parseInt(scanner.nextLine());
        System.out.println("enter ten sp");
        String productName=scanner.nextLine();
        System.out.println(" enter productionDelay");
        String productionDelay=scanner.nextLine();
        System.out.println("enter price");
        double price=Double.parseDouble(scanner.nextLine());
        return new Product(productCode,productName,productionDelay,price);
    }
}
