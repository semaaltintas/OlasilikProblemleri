/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kombinasyonpermitasyon;

import java.util.Scanner;
public class KombinasyonPermitasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
        System.out.println("N Değerini Giriniz");
        int n=klavye.nextInt();
        System.out.println("R Değerini Giriniz");
        int r=klavye.nextInt();
        if(n<r){
            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n=klavye.nextInt();
            KomHesapla(n,r);
        }else{
            KomHesapla(n,r);
        }
        PerHesapla(n,r);
    }
    private static void KomHesapla(int n, int r) {
        int faktoriyel_1=1;
        int faktoriyel_2=1;
        int faktoriyel_3=1;
        int fark=n-r;
        for(int i=1;i<=n;i++){
            faktoriyel_1=faktoriyel_1*i;
        }
        for(int j=1;j<=r;j++){
            faktoriyel_2=faktoriyel_2*j;
        }
        for(int k=1;k<=fark;k++){
            faktoriyel_3=faktoriyel_3*k;
        }
        int carpim=faktoriyel_2*faktoriyel_3;
        int kombinasyon=faktoriyel_1/carpim;
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
    private static void PerHesapla(int n, int r) {
        int sonuc=1,sonuc2=1,sonuc3=1;
        for(int i=1; i<=n; i++){sonuc*=i;}
            for(int a=1; a<=(n-r); a++){sonuc2*=a;}
            System.out.println("Tekrarsız permutasyon ="+sonuc/sonuc2);
            for(int b=1; b<=r; b++){sonuc3=n*sonuc3;}
            System.out.println("Tekrarlı Permutasyon="+sonuc3);
    }
    
}