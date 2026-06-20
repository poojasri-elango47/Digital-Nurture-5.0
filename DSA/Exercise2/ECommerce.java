package DSA.Exercise2;

public class ECommerce {
    public static void main(String[] args) {
        Product[] LinProduct={
            new Product(1,"Pen"),
            new Product(5,"NoteBook"),
            new Product(3,"Scissors"),
            new Product(2,"Pencil"),
            new Product(6,"SketchPens")
        };

         Product[] BinProduct={
            new Product(1,"Apple"),
            new Product(2,"Orange"),
            new Product(3,"Guava"),
            new Product(4,"Kiwi"),
            new Product(5,"Melon")
        };
        int id=5;
        System.out.println("LinearSearch--->Stationary");
        Search s1=new Search();
        Product Res1=s1.LinSearch(LinProduct,id);
        if(Res1!=null)
            Res1.display();
        else 
            System.out.println("Not Found");

        System.out.println("BinarySearch--->Fruits");

        Search s2=new Search();
       Product Res2=s2.BinSearch(BinProduct,id);
        if(Res2!=null)
            Res2.display();
        else 
            System.out.println("Not Found");
    


    }
    
}
