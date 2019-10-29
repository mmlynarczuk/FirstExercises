package Exercise2;

import java.util.Scanner;

//Zadanie 2:
//1. Napisać program, który przelicza podaną kwotę w złotych polskich (PLN) na Euro (EUR), dolary amerykańskie (USD) i funty brytyjskie (GBP).
//2. Zmodyfikuj program tak, aby kwota wejściowa w złotych była podawana przez użytkownika po uruchomieniu programu.
//3. Zmodyfikuj program tak, aby nie przyjmował wartości ujemnej.
//4. Zmodyfikuj program tak, aby pytał użytkownika na jaką walutę ma przeliczyć podaną kwotę?
public class Exchange {

    public static void main(String[] args) {
        double eur = 3.50;
        double usd = 4.87;
        double gbp = 6.43;

        Scanner scanerPLN = new Scanner(System.in);
        System.out.println("Podaj kwotę w złotych");

        double pln1 = scanerPLN.nextDouble();
        System.out.println("Podana kwota to: " + pln1);

        int jakaWaluta;
        System.out.println("Na jaką walutę chcesz przeliczyć kwotę wybierz 1 dla EUR, 2 dla USD, 3 dla GBP?");
        Scanner scannerJakaWaluta = new Scanner(System.in);
        jakaWaluta = scannerJakaWaluta.nextInt();

        switch (jakaWaluta) {
            case 1: {
                System.out.println("Kwota w EURO: " + pln1 * eur);
            }
            case 2: {
                System.out.println("Kwota w DOLARACH: " + pln1 * usd);
            }
            case 3: {
                System.out.println("Kwota w FUNTACH: " + pln1 * gbp);
            }
        }
    }
}
