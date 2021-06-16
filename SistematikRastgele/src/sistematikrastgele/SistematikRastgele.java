/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematikrastgele;
import java.util.*;
public class SistematikRastgele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("N sayisini giriniz"); 
        
       Scanner girdi = new Scanner(System.in);
       int N = girdi.nextInt(); 
        
       System.out.println("n sayisini giriniz"); 
       
       Scanner girdi2 = new Scanner(System.in);
       int n = girdi2.nextInt(); 
       
       int K=N/n;
       
       System.out.println(K); 
       
       Random r=new Random(); //random sınıfı
       int a=r.nextInt(K);
       
       System.out.println(a); 
       
       for(int i = 0;i<n;i++) {
           a=a+K;
           System.out.println(a);
       
       }
  }
    
}
