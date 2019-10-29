package Exercise8;
//1. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.
//2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz na ekranie odpowiedni komunikat).
//3. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (użyj google żeby znaleźć odpowiedź, jak obsłużyć więcej niż dwa przypadki w instrukcji warunkowej).
//4. Rozwiąż zadanie 1. dla czterech zmiennych.


import java.util.Scanner;

public class MathematicalOperations {

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scannerX = new Scanner(System.in);
        System.out.println("Give me a number X:");
        int x = scannerX.nextInt();

        Scanner scannerY = new Scanner(System.in);
        System.out.println("Give me a number Y:");
        int y = scannerY.nextInt();

        Scanner scannerZ = new Scanner(System.in);
        System.out.println("Give me a number Z:");
        int z = scannerZ.nextInt();

        Scanner scannerK = new Scanner(System.in);
        System.out.println("Give me a number K:");
        int k = scannerK.nextInt();

        int valueMax = Math.max(x, Math.max(Math.max(y,k),z));
        System.out.println("Higest number is: " + valueMax);

        boolean resultX = isEvenNumber(x) == true;
        if (resultX) {
            System.out.println("Number " + x + " is even");
        } else {
            System.out.println("Number " + x + " isn't even");
        }

        boolean resultY = (isEvenNumber(y)) == true;
        if (resultY) {
            System.out.println("Number " + y + " is even");
        } else {
            System.out.println("Number " + y + " isn't even");
        }

        boolean resultZ = (isEvenNumber(z)) == true;
        if (resultZ) {
            System.out.println("Number " + z + " is even");
        } else {
            System.out.println("Number " + z + " isn't even");
        }

        if (x > 0) {
            System.out.println("Number X is bigger then 0");
        } else if (x == 0) {
            System.out.println("Number X is 0");
        } else if (x < 0) {
            System.out.println("Number X is less than 0");
        }

        if (y > 0) {
            System.out.println("Number Y is bigger than 0");
        } else if (y == 0) {
            System.out.println("Number Y is 0");
        } else if (y < 0) {
            System.out.println("Number Y is less than 0");
        }

        if (z > 0) {
            System.out.println("Number Z is bigger than 0");
        } else if (z == 0) {
        System.out.println("Number Z is 0");
        } else if (z < 0) {
        System.out.println("Number Z is less than 0");
        }
    }
}