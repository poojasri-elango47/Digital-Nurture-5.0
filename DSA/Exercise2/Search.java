package DSA.Exercise2;

public class Search {
    
    public  Product LinSearch (Product[] Products,int id){
       for(Product product:Products){
           if(product.ProductId==id){
            return product;
           }
       }
     return null;
    }

    public  Product BinSearch (Product[] Products, int id){
        int low=0;
        int high=Products.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(Products[mid].ProductId==id)
                return Products[mid];
            else if(Products[mid].ProductId>id)
                
                  high=mid-1;  
            else if (Products[mid].ProductId<id)
                 low=mid+1;
            }
            return null;
    }
        }
        

