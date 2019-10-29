package Exercise5;

//2. Napisać program, który oblicza wartość współczynnika BMI. Jeżeli wynik jest w przedziale (18,5 - 24,9)
//to wypisuje ”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
//Jeśli użytkownik poda wagę ujemną lub większą niż 250 kg, program wyświetla komunikat o błędzie i kończy działanie.

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner weight = new Scanner(System.in);
        System.out.println("Enter Your weight in kg: ");
        double a = weight.nextInt();
        if (a <= 0 && a >= 250.0) {
            System.out.println("Error weight");
        } else if (a > 0 && a < 250.0) {
            Scanner height = new Scanner(System.in);
            System.out.println("Enter your height in cm: ");
            double b = height.nextInt();

            double bmi = a / ((b / 100) * (b / 100));
            if (bmi <= 18.5) System.out.println("Your weight is to low");
            if (bmi >= 24.9) System.out.println("Your weight is to high");
            if (bmi > 18.5 && bmi < 24.9) System.out.println("Yout weight is fine");
            System.out.println("Your BMI is:" + bmi);
        }
    }
}
