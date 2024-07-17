import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Manava Hoş Geldiniz");

        System.out.print("Armut Kaç Kilo? :");
        armut = input.nextDouble() * armut;

        System.out.print("Elma Kaç Kilo? :");
        elma = input.nextDouble() * elma;

        System.out.print("Domates Kaç Kilo? :");
        domates = input.nextDouble() * domates;

        System.out.print("Muz Kaç Kilo? :");
        muz = input.nextDouble() * muz;

        System.out.print("Patlican Kaç Kilo? :");
        patlican = input.nextDouble() * patlican;

        toplam = (armut + elma + domates + muz + patlican);
        System.out.println("Toplam Tutar: " + toplam);

    }
}