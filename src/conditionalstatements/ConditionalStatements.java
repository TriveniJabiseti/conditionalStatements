package conditionalstatements;
import java.util.*;

public class ConditionalStatements {

   
    public static void main(String[] args) {
        
        double purchaseAmount,discountPercentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the purchase amount");
        purchaseAmount=sc.nextDouble();
        
        if(purchaseAmount>1000)
        {
            discountPercentage=10;
        }
        else if(purchaseAmount>=500 && purchaseAmount<1000)
        {
            discountPercentage=5;
        }
        else 
            discountPercentage=0;
        
        double discountAmount=(purchaseAmount * discountPercentage)/100;
        double discountedPrice=purchaseAmount-discountAmount;
        
        System.out.println("purchase amount: $" +purchaseAmount);
        System.out.println("discount percentage: " +discountPercentage+ "%");
        System.out.println("discount amount: $" +discountAmount);
        System.out.println("discounted price: $" +discountedPrice);
        
    }
    
}
