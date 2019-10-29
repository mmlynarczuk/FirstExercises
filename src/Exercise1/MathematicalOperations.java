package Exercise1;
//Zadanie 1:
//Zadeklaruj i zainicjuj dwie zmienne typu całkowitego oraz napisz program, który wylicza i wypisuje na ekran:
//Sumę
//Różnicę
//Iloczyn
//Iloraz
//Resztę z dzielenia
//tych dwóch liczb.
//2. Zmodyfikuj program tak, aby wartości obu liczb były podawane przez użytkownika po uruchomieniu programu.
//3. Zmodyfikuj program tak, aby nie można było podzielić przez 0. Program powinien wypisać komunikat: „Błąd dzielenia przez 0”.

import java.util.Scanner;

public class MathematicalOperations {


    public static void main(String[] args) {

        Scanner scannerX = new Scanner(System.in);
        System.out.println("Give me a number x: ");
        int x = scannerX.nextInt();

        Scanner scannerY = new Scanner(System.in);
        System.out.println("Give me a number y: ");
        int y = scannerY.nextInt();

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x % y;
        int e = x / y;

        if (x == 0 || y ==0) {
            System.out.println("Yours numbers is: " + x + " and " + y );
            System.out.println("Addition result x to y is: " + a);
            System.out.println("Subtraction result y from x is: " + b);
            System.out.println("Division by 0 error");
        } else {

            System.out.println("Your's numbers is: "+ x + " i " + y);
            System.out.println("Addition result x to y is: " + a);
            System.out.println("Subtraction result y from x is: " + b);
            System.out.println("Multiplication result whit x and y is: " + c);
            System.out.println("Result of dividing x and y is: " + e + " and the rest of the division: " + d);
        }

    }
}
