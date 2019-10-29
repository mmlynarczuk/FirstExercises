package Exercise4;
// 6. Napisać program obliczający średnią arytmetyczną z podanych liczb ujemnych oraz iloczyn liczb dodatnich.
// Liczby wczytywane są od użytkownika. Ogranicz sie do 5 liczb.
// czy da się to wykonać bez użycia tablic i pętli
// 6.1 Zadanie 6 wykonaj dla liczb zmiennoprzecinkowych

import java.util.Scanner;

public class AritmeticalCalculation {
    public static void main(String[] args) {

        Scanner giveNumbers = new Scanner(System.in);
        System.out.println("Give 5 numbers: ");
        double a = giveNumbers.nextInt();
        double b = giveNumbers.nextInt();
        double c = giveNumbers.nextInt();
        double d = giveNumbers.nextInt();
        double e = giveNumbers.nextInt();
        System.out.println("Given numbers is: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", ");



    }
}
