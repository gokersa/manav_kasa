import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut = 2.14,elma = 3.67,domates = 1.11,muz =0.95,patlican= 5,a,b,c,d,e,toplam_tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        a = input.nextDouble();
        System.out.print("Elma Kaç Kilo:");
        b = input.nextDouble();
        System.out.print("Domates Kaç Kilo:");
        c = input.nextDouble();
        System.out.print("Muz Kaç Kilo:");
        d = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo:");
        e = input.nextDouble();

        toplam_tutar = (armut*a) + (elma*b) + (domates*c) + (muz*d) + (patlican*e);

        System.out.println("Toplam Ücret" +toplam_tutar + "TL");

    }
}
