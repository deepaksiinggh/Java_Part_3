package WrapperClass;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectDriver {
    Project[] storeGames;

    public void addgame() {
        System.out.println("How many games do you want to add");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        storeGames = new Project[num];

        for (int i = 0; i < storeGames.length; i++) {
            System.out.println("Enter the " + (i + 1) + " game name ");
            String name = sc.next();
            System.out.println("Enter the " + (i + 1) + " game price ");
            Double price = sc.nextDouble();
            System.out.println("Enter the " + (i + 1) + " game rating ");
            Double rating = sc.nextDouble();
            System.out.println("Enter the " + (i + 1) + " game grade ");
            Character grade = sc.next().charAt(0);
            System.out.println("Enter the " + (i + 1) + " game mode ? offline:online ");
            String mode = sc.next();
            System.out.println("Enter how many player can play the game ");
            Integer playerNo = sc.nextInt();

            storeGames[i] = new Project(name, price, rating, grade, mode, playerNo);

        }
    }

    public void displayStore() {
        System.out.println(Arrays.toString(storeGames));
    }

    public static void main(String[] args) {
        ProjectDriver p1 = new ProjectDriver();
        p1.addgame();
        if (p1.storeGames == null || p1.storeGames.length == 0) {
            System.out.println("plese add the game frist");
        } else {
            p1.displayStore();
        }

    }
}
