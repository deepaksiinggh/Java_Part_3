package WrapperClass;

public class Project {

    String gameName;
    Double price;
    Double rating;
    Character grade;
    String mode;
    Integer playerNo;

    public Project(String gameName, Double price, Double rating, Character grade, String mode, Integer player) {
        this.gameName = gameName;
        this.price = price;
        this.rating = rating;
        this.grade = grade;
        this.mode = mode;
        this.playerNo = player;
    }

    public String toString() {
        return " Game name is : " + this.gameName + " and price is " + this.price + " Game rating is " + this.rating
                + " And game grade is " + this.grade + " and game mode is " + this.mode + "And no of player is "
                + this.playerNo;
    }

}
