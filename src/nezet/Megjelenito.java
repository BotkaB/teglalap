
package nezet;

import java.util.Scanner;
import model.Teglalap;


public class Megjelenito {
    static Scanner sc = new Scanner(System.in);
   
   
       private int Oldal(char oldal) {
       boolean jo;
       int hossz;
        do{
            System.out.print("Adja meg a téglalap "+oldal+" oldalának hosszát: ");
            hossz = Integer.parseInt(sc.nextLine());
            jo = hossz > 0 ;
        }while(!jo);
        
        return hossz;
    }
      
    
     Teglalap teglalap=new Teglalap(Oldal('a'),Oldal('b'));
     int t=teglalap.Terulet();
     int k=teglalap.Kerulet();
     
     
     public void Eredmeny()
     {
     System.out.println("Kerulet:"+k);
     System.out.println("Terulet:"+t);
     }

 

}


