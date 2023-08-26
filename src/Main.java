import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy , kilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: " );
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double VucutKitleEndeksi = kilo / (boy * boy) ;
        System.out.println("Vucut Kitle Endeksi: " + VucutKitleEndeksi);

    }
}