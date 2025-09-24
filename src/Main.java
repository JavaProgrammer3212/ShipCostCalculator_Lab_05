//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double shippingCost;

        double totalCost;

        System.out.println("Please input the price of your item: ");

        double itemCost = in.nextDouble();

        if (itemCost >= 100) {

            shippingCost = 0;

            System.out.println("The shipping cost of your item is free!");

        }
        else {

            shippingCost = itemCost * 0.02;

            System.out.println("The shipping cost of your item is $" + shippingCost);

        }

        totalCost = itemCost + shippingCost;

        System.out.println("The total cost of your purchase will be $" + totalCost);

    }
}