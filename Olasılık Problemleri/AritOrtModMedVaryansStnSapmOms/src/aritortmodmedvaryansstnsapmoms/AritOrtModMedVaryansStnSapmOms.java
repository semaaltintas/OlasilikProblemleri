
package aritortmodmedvaryansstnsapmoms;

import java.util.Arrays;
import java.util.Scanner;
public class AritOrtModMedVaryansStnSapmOms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int giris, kacAdet;
        
     Scanner sayiAl = new Scanner(System.in);

 
     System.out.println("Kaç Adet Sayı gireceksiniz?");
     kacAdet = sayiAl.nextInt();
     int[] sayilar = new int[kacAdet];
          for (int x = 0; x < sayilar.length; x++) {
 
         System.out.println("Tam Sayi Giriniz:");
         giris = sayiAl.nextInt();
         sayilar[x] = giris;
 }
          double StandartSapma = Hesapla(sayilar);
          System.out.println("Dizinin ortalaması :" + Ortalama(sayilar));
          ortanca(sayilar, kacAdet);
          System.out.format("Standart Sapma = %.6f \n", StandartSapma);
          mod(sayilar);
}
public static double Ortalama(int[] dizi)
        {
            double ortalama = 0;
            int toplam = 0;
            for (int i = 0; i < dizi.length; ++i)
            { toplam += dizi[i]; }
            ortalama = (double)toplam/(dizi.length);
            return ortalama;
        }

public static void ortanca(int[] dizi,int b) {
            int kalan =0;
            for (int i = 0; i < dizi.length; ++i)
             Arrays.sort(dizi);
            
            if (b %2==1) {
                kalan=(b/2);
                System.out.println("Medyan : "+dizi[kalan]);
            }
            else {
            kalan =b/2;
                System.out.println("Medyan : "+(dizi[kalan]+dizi[kalan-1])/2);
            }  
    }
public static double Hesapla(int dizi[])
    {
        double toplam = 0.0, StandartSapma = 0.0;
        int length = dizi.length;
 
        for(int sayi : dizi) {
            toplam += sayi;
        }
 
        double ortalama = toplam/length;
 
        for(int sayi: dizi) {
            StandartSapma += Math.pow(sayi - ortalama, 2);
        }
 
        return Math.sqrt(StandartSapma/length);
    }  
public static void mod(int dizi[]){

    int mod = 0;
    int modval=0;
    int k, i, counter;
        for ( i = 0; i < dizi.length; ++i) {
        counter = 0;
        for (k = 0; k < dizi.length; ++k)
            if (dizi[k] == dizi[i]) 
                counter++;
        if (counter > mod) {
            mod = counter;
            modval = dizi[i];
        }
    }
 
    System.out.println("Mod :" +modval);
}
    }
