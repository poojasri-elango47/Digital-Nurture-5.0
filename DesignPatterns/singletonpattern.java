class singletonObj {
   private static singletonObj obj=new singletonObj();

   private singletonObj(){
    System.out.println("Object Created");
   }

   public static singletonObj getObj(){
    return obj;
   }

    public void display() {
        System.out.println("Hello from Singleton Pattern!");
    }
}
public class singletonpattern{
    public static void main(String[] args ){
        singletonObj o1=singletonObj.getObj();
        singletonObj o2=singletonObj.getObj();

        o1.display();
        if(o1==o2){
            System.out.println("Both objects refer to same");
        }
        else {
            System.out.println("Both are different");
        }
    }
}
