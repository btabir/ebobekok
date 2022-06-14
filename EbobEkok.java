package Hesaplamalar;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        int ebob=1;

        System.out.print("Lutfen A Sayisini Giriniz :");
        a=input.nextInt();
        System.out.print("Lutfen A Sayisini Giriniz :");
        b=input.nextInt();


        for (int i=1;i<=a;i++){
            if ((a%i==0) && (b%i==0)){
                ebob=i;
            }
        }
        System.out.println("EBOB :" +ebob);

        for (int j=1;j<=(a*b);j++){
            if ((j%a==0) && (j%b==0)){
                System.out.println("EKOK : "+j);
                break; //burada break koymazsak diğer ortak çarpanları da gösterir.
            }
        }

    }
}
