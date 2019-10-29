package Exercise3;

import java.util.Scanner;

//Zadanie: Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia
public class isPlus {

    private static boolean isPlus (int temperature){
        if (temperature >= 0);
        return true;
    }

    public static void main(String[] args) {

        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        temperature = scanner.nextInt();
        System.out.println("Entered temperature is: " + temperature);

            boolean result = isPlus(temperature);
            if (result)System.out.println("The temperature is negative");
            else {
                System.out.println("The temperature is positive");

    }






    }
}
