package Collection.LinkedList.Project.Netflix;

import java.util.Scanner;

public class NetflixMovieDriver {
    public static void main(String[] args) {
        NetflixBussinessLogic movies = new NetflixBussinessLogic();
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("1. Add movies");
            System.out.println("2. print movies");
            System.out.println("3. remove movies");
            System.out.println("4. update movies");
            System.out.println("5. Exit");
            System.out.println("*********************");
            System.out.println("Enter option");

            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    movies.addMovies();
                }
                    break;
                case 2: {
                    movies.toPrintmovies();
                }
                    break;
                case 3: {
                    movies.removeMovies();
                }
                    break;
                case 4: {
                    movies.updateMovies();
                }
                    break;
                case 5: {
                    flag = false;
                    System.out.println("Exit sucessfully");
                }
                    break;

                default:
                    System.out.println("Enter right option");
                    break;
            }

        }

    }
}
