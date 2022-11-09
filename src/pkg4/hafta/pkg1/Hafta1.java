
package pkg4.hafta.pkg1;

import java.util.Scanner;


public class Hafta1 {

    
    public static void main(String[] args) {
          
      
       Scanner input = new Scanner (System.in); 
        System.out.println("Write here the value in metres");
        float a = input.nextInt();
        
        System.out.println("1-mm 2-cm 3-dm 4-km");
            
            int sec = input.nextInt();
            
           float b;
            
        
           b = switch (sec) {
            case 1 -> 1000 * a;
            case 2 -> 100*a;
            case 3 -> 10* a;
            default -> a/1000;
        };
            System.out.println("value is= "+ b);
    }
    
}
