
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter traveled miles:");
        int miles = input.nextInt();
        System.out.println("Enter gallons::");
        int distance = input.nextInt();

        int result = miles/distance;

       System.out.println("You traveled " + miles + " miles using about " + result + " miles per gallon.");

    }
}
