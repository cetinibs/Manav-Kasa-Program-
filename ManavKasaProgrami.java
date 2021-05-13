package Giris;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static  void main(String[] args){

        double armutFiyat=2.14;
        double armutKilo;
        double elmaFiyat=3.67;
        double elmaKilo;
        double domatesFiyat=1.11;
        double domatesKilo;
        double muzFiyat=0.95;
        double muzKilo;
        double patlicanFiyat=5;
        double patlicanKilo;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo= input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo= input.nextDouble();

        double armutHesap=armutFiyat*armutKilo;
        double elmaHesap=elmaFiyat*elmaKilo;
        double domatesHesap=domatesFiyat*domatesKilo;
        double muzHesap=muzFiyat*muzKilo;
        double patlicanHesap=patlicanFiyat*patlicanKilo;
        double toplamFiyat=armutHesap+elmaHesap+domatesHesap+muzHesap+patlicanHesap;

        System.out.println("Toplam Tutar :"+toplamFiyat);


    }

}
