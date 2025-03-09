package Collection.LinkedList.Project.Netflix;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NetflixBussinessLogic {

    Scanner sc = new Scanner(System.in);
    NetflixMovie n;
    List<NetflixMovie> movieContainer = new LinkedList<>();;

    // to add movies
    public void addMovies() {
        System.out.println("Enter movie Name :");
        String movie = sc.next();
        System.out.println("Enter movie Price :");
        double price = sc.nextDouble();

        double rating;
        while (true) {
            System.out.println("Enter movie Rating (0-10):");
            rating = sc.nextDouble();
            if (rating >= 0 && rating <= 10) {
                break;
            }
            System.out.println("Invalid rating! Please enter a value between 0 and 10.");
        }

        System.out.println("Enter movie DirectorName :");
        String directer = sc.next();
        System.out.println("Enter movie ProducerName :");
        String producer = sc.next();
        System.out.println("Enter movie ActorName :");
        String actor = sc.next();
        System.out.println("Enter movie ActressName :");
        String actress = sc.next();
        System.out.println("Enter movie Genere :");
        String genere = sc.next();
        System.out.println("Enter movie Grade :");
        char grade = sc.next().charAt(0);
        n = new NetflixMovie(movie, price, rating, directer, producer, actor, actress, genere, grade);
        movieContainer.add(n);

    }

    // to remove Movie

    public void removeMovies() {
        if (movieContainer.isEmpty()) {
            System.out.println("Please Add movies first");
        } else {

            System.out.println("Enter movie name whose want to remove ");
            String movie = sc.next();

            for (NetflixMovie movies : movieContainer) {

                if (movies.movieName.equals(movie)) {
                    movieContainer.remove(movies);
                    System.out.println("movie removed sucessfully");
                } else {
                    System.out.println("this such type of movies not exist");
                }
            }
        }
    }

    // to print the movies

    public void toPrintmovies() {

        if (movieContainer.isEmpty()) {
            System.out.println("No movies available.");
        }

        for (NetflixMovie movies : movieContainer) {
            System.out.println(movies);
        }
    }

    // to update The movies

    public void updateMovies() {

        if (movieContainer.isEmpty()) {
            System.out.println("Please Add movies frist");
        } else {

            System.out.println("Enter movie name whose want to update ");
            String movie = sc.next();
            boolean isAvilable = false;

            for (NetflixMovie movies : movieContainer) {

                if (movies.movieName.equals(movie)) {
                    System.out.println("Enter the new price:");
                    double price = sc.nextDouble();
                    movies.price = price;
                    System.out.println("Price update sucessfully");
                    isAvilable = true;
                    break;
                }

            }
            if (!isAvilable) {
                System.out.println("this such type of movies not exist");
            }
        }
    }
}
