import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        do {
            System.out.println("1.nhap");
            System.out.println("2.hien thi");
            System.out.println("3. tim kiem");
            System.out.println("4.ghi vao file");
            System.out.println("5.doc file");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Product product= productManagement.getProduct();
                    productManagement.add(product);
                    break;
                case 2:
                    productManagement.showAll();
                    break;
                case 3:
                    productManagement.search();
                    break;
                case 4:
                    productManagement.writeToFile("product.txt");
                    break;
                case 5:
                    System.out.println(productManagement.readDateFormFile("product.txt"));
                    break;
            }
        }while (true);

    }
}
