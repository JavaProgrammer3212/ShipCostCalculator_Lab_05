//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        num itemPrice
//
//        num shippingCost
//
//        num totalCost
//
//        output “Please enter the price of your item:”
//
//        input itemPrice
//
//        if itemPrice >= 100 then
//
//          shippingCost = 0
//
//          output “Your shipping cost is free!”
//
//        else
//
//          shippingCost = itemPrice * 0.02
//
//          output “Your shipping cost is $” + shippingCost
//
//        end if
//
//        totalPrice = itemPrice + shippingCost
//
//        output “The total price of your purchase is $” + totalPrice

        Scanner in = new Scanner(System.in);

        double itemCost;

        double shippingCost;

        double totalCost;

        System.out.println("Please input the price of your item: ");

        if (in.hasNextDouble()) {

            itemCost = in.nextDouble();

            in.nextLine();

            if (itemCost >= 100) {

                shippingCost = 0;

                System.out.println("The shipping cost of your item is free!");

            } else {

                shippingCost = itemCost * 0.02;

                System.out.println("The shipping cost of your item is $" + shippingCost);

            }

            totalCost = itemCost + shippingCost;

            System.out.println("The total cost of your purchase will be $" + totalCost);
        }
    }
}