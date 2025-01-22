package Projects.Amazon;

import java.util.Scanner;

public class Amazon {

    static char option;
    static double cartVal;
    static boolean premium;
    static boolean hdfc;
    static boolean axis = true;
    static double gst = 60;
    static double dilivery = 40;

    static {
        System.out.println("++++++++++++ Welcome to amazon website ++++++++++++");

        System.out.println("Above 3000 shopping get 300 off");
        System.out.println("Above 20000 shopping get 2000 off");
        System.out.println("Above 50000 shopping if Hdfc creadit card get 3000 off");
        System.out.println("Above 100000 shopping if Axix creadit card get 10000 off");
        System.out.println("Are you have a premium memberShip");
        Scanner sc = new Scanner(System.in);
        premium = sc.nextBoolean();
    }

    public static void main(String[] args) {

        System.out.println("########## Choose a product #############");
        System.out.println("A. Iphone - 150000");
        System.out.println("B. Laptop - 55000");
        System.out.println("C. Biscuit - 150");
        System.out.println("D. Gucci bag - 30000");
        System.out.println("E. H&M Pants - 3200");

        Scanner sc = new Scanner(System.in);
        System.out.println("___________Enter the option_________");
        option = sc.next().charAt(0);

        switch (option) {
            case 'A': {
                if (premium) {
                    cartVal = 150000 + gst;
                    System.out.println("IPhone purchased sucessfully " + cartVal);
                } else {
                    cartVal = 150000 + gst + dilivery;
                    System.out.println("IPhone purchased sucessfully " + cartVal);
                }
            }
                break;
            case 'B': {
                if (premium) {
                    cartVal = 55000 + gst;
                    System.out.println("Laptop purchased sucessfully " + cartVal);
                } else {
                    cartVal = 55000 + gst + dilivery;
                    System.out.println("Laptop purchased sucessfully " + cartVal);
                }

            }
                break;
            case 'C': {
                if (premium) {
                    cartVal = 150 + gst;
                    System.out.println("Biscuit purchased sucessfully " + cartVal);
                } else {
                    cartVal = 150 + gst + dilivery;
                    System.out.println("Biscuit purchased sucessfully " + cartVal);
                }

            }
                break;

            case 'D': {
                if (premium) {
                    cartVal = 30000 + gst;
                    System.out.println("Gucci bag purchased sucessfully " + cartVal);
                } else {
                    cartVal = 30000 + gst + dilivery;
                    System.out.println("Gucci bag purchased sucessfully " + cartVal);
                }

            }
                break;

            case 'E': {
                if (premium) {
                    cartVal = 3200 + gst;
                    System.out.println("H&M jeans purchased sucessfully " + cartVal);
                } else {
                    cartVal = 3200 + gst + dilivery;
                    System.out.println("H&M jeans purchased sucessfully " + cartVal);
                }

            }
                break;
            default:
                System.out.println("Please enter a valid option");
        }
        applyDiscounts();
    }

    public static void applyDiscounts() {
        Scanner sc = new Scanner(System.in);
        if (cartVal > 50000) {
            System.out.println("Do you have an HDFC credit card? (true/false)");
            hdfc = sc.nextBoolean();
            System.out.println("Do you have an Axis credit card? (true/false)");
            axis = sc.nextBoolean();
        }
        if (cartVal > 100000 && axis) {
            cartVal -= 10000;
            System.out.println("Axis card discount applied! New total: ₹" + cartVal);
        } else if (cartVal > 50000 && hdfc) {
            cartVal -= 3000;
            System.out.println("HDFC card discount applied! New total: ₹" + cartVal);
        } else if (cartVal > 20000) {
            cartVal -= 2000;
            System.out.println("Cart discount applied! New total: ₹" + cartVal);
        } else if (cartVal > 3000) {
            cartVal -= 300;
            System.out.println("Cart discount applied! New total: ₹" + cartVal);
        } else {
            System.out.println("No discounts applied. Final total: ₹" + cartVal);
        }
    }

}
