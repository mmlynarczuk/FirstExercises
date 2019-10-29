package Exercise6;

//5. Stwórz program, który poprosi użytkownika o podanie dwóch wartości - długości boków prostokąta.
// Następnie wypisze pole takiego prostokąta.

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner giveA = new Scanner(System.in);
        System.out.println("Give first side of the rectangle");
        int a = giveA.nextInt();

        Scanner giveB = new Scanner(System.in);
        System.out.println("Give second side of the rectangle");
        int b = giveB.nextInt();

        int p = a * b;

        System.out.println("Rectangle area = " + p);
    }
}
