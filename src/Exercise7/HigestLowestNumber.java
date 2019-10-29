package Exercise7;
//Zadanie 3:
//1. Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz najmniejszą z nich.


import java.util.Scanner;

public class HigestLowestNumber {
    public static void main(String[] args) {

        Scanner scannerX = new Scanner(System.in);
        System.out.println("Your X:");
        int x = scannerX.nextInt();

        Scanner scannerY = new Scanner(System.in);
        System.out.println("Your Y:");
        int y = scannerY.nextInt();

        Scanner scannerZ = new Scanner(System.in);
        System.out.println("Your Z:");
        int z = scannerZ.nextInt();

        System.out.println("You bring numbers: " + x + " " + y + " " + z);

        int numberMax = Math.max(x, Math.max(y,z));
        int numberMin = Math.min(x, Math.min(y,z));

        System.out.println("Higest number: " + numberMin);
        System.out.println("Lowest number: " + numberMax);
    }
}
