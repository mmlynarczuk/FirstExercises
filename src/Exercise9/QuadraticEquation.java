package Exercise9;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// 7. Napisać program rozwiązujący równanie kwadratowe (a, b i c podawane jest przez użytkownika)

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner giveA = new Scanner(System.in);
        System.out.println("Give a:");
        double a = giveA.nextInt();

        Scanner giveB = new Scanner(System.in);
        System.out.println("Give b:");
        double b = giveB.nextInt();

        Scanner giveC = new Scanner(System.in);
        System.out.println("Give c:");
        double c = giveC.nextInt();

        System.out.println("Your quadratic equation is: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (a != 0) {

            double delta = pow(b, 2) - (4 * a * c);

            if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Quadratic equation hase one  root x = " + x);
            } else if (delta > 0) {
                double x1 = (-b - sqrt(delta)) / (2 * a);
                double x2 = (-b + sqrt(delta)) / (2 * a);
                System.out.println("The quadratic equation has two roots x1 = " + x1 + " and x2 = " + x2);
            } else if (delta < 0) {
                System.out.println("The quadratic equation has no roots");
            }
        }if (a == 0){
                double x = -c/b;
                System.out.println(" Equation is not quadratic x = " + x);
            }
        }
    }
