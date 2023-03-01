import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int armut,elma,domates,muz,patlıcan;
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5,toplam;
        double armutf,elmaf,domatesf,muzf,patlıcanf;

        Scanner i=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut=i.nextInt();
        armutf=armut*a;

        System.out.print("Elma Kaç Kilo ? :");
        elma=i.nextInt();
        elmaf=elma*e;

        System.out.print("Domates Kaç Kilo ? :");
        domates=i.nextInt();
        domatesf=domates*d;

        System.out.print("Muz Kaç Kilo ? :");
        muz=i.nextInt();
        muzf=muz*m;

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcan=i.nextInt();
        patlıcanf=patlıcan*p;

        toplam=armutf+elmaf+domatesf+muzf+patlıcanf;
        System.out.println("Toplam alışveriş tutarı :"+toplam+("TL"));
    }
}