package Collection.LinkedList.Project.Netflix;

public class NetflixMovie {
    String movieName;
    double price;
    double rating;
    String directerName;
    String producerName;
    String actorName;
    String actressName;
    String genere;
    char grade;

    public NetflixMovie(String movieName, double price, double rating, String directerName, String producerName,
            String actorName, String actressName, String genere, char grade) {
        this.movieName = movieName;
        this.price = price;
        this.rating = rating;
        this.directerName = directerName;
        this.producerName = producerName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.genere = genere;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "NetflixMovie [movieName=" + movieName + ", price=" + price + ", rating=" + rating + ", directerName="
                + directerName + ", producerName=" + producerName + ", actorName=" + actorName + ", actressName="
                + actressName + ", genere=" + genere + ", grade=" + grade + "]";
    }

}
