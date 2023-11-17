
package model;


public class Teglalap {
 int a;
 int b;


    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
        
    }

    public int Terulet() {
        return a*b;
    }

    public int Kerulet() {
        return 2*a+2*b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
 
 
         
}
