
package basitrastgele;
import java.util.Scanner;
public class BasitRastgele {
 
    public static void main(String[] args) {
         System.out.println("Maksimuum sayıyı giriniz: ");
        Scanner Xmax=new Scanner(System.in);
        int x=Xmax.nextInt();
        System.out.println("Minimum sayıyı giriniz: ");
        Scanner Xmin=new Scanner(System.in);
        int y=Xmin.nextInt();
        System.out.println("Üretilecek sayıyı giriniz: ");
        Scanner Xn=new Scanner(System.in);
        int n=Xn.nextInt();
        System.out.println("Üretilen Sayılar: ");
     

        if((x-y)<n){
            for (int i=0; i<n; i++){
            int b=(int)(x + Math.random()*(x-y));
            System.out.print (b);
    }
    }
      /*  else{
          for(int i=0;i<n;i++){
            
            int random=(int)(x + Math.random()*(x-y));
            for(int j=0;j<n;j++){
            if(random==d[j])
               break;
            }
           d[i]=random;
           System.out.print ( d[i]);
            }
      
    }*/
    }
}