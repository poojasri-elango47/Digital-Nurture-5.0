package DSA.Exercise2;

public class Product {
    int ProductId;
    String ProductName;
    
    public Product (int ProductId,String ProductName){
        this.ProductId=ProductId;
        this.ProductName=ProductName;
    }
    public void display(){
        System.out.println("Product Id: "+ProductId);
        System.out.println("Product Name: "+ProductName);
    }
}
