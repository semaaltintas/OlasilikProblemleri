/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basitseri;
import java.util.Arrays;
import java.util.Scanner;
public class BasitSeri {

   
    public static void main(String[] args) {
        
     int giris, kacAdet;
     Scanner sayiAl = new Scanner(System.in);

 
     System.out.println("Kaç Adet Sayı gireceksiniz?");
     kacAdet = sayiAl.nextInt();
     int[] girilenSayi = new int[kacAdet];
 
     for (int x = 0; x < girilenSayi.length; x++) {
 
         System.out.println("Tam Sayi Giriniz:");
         giris = sayiAl.nextInt();
         girilenSayi[x] = giris;
 }
        
     Arrays.sort(girilenSayi);
        
       for (int i =0;i<girilenSayi.length; i++){
      System.out.println(girilenSayi[i]);}
  
    
    }
    
}
