
package pkg4.feladat;

import java.util.Scanner;


public class Feladat {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int terület;
        
       System.out.println("Kérem adja meg az A oldalt: ");
       
        a= input.nextInt();
        System.out.println("Kérem adja meg a B oldalt: ");
       
        b= input.nextInt();
        System.out.println("Kérem adja meg a C oldalt: ");
       
        c= input.nextInt();
        terület=a+b+c;
      
        if(a*a+b*b==c*c){
            System.out.println("A hárómszőg területe: "+terület );
        }else{
            System.out.println("Hibás adatok" );
        }
      
    }
    
}
