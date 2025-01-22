package Projects.Custom_Exeption;

import java.util.Scanner;

public class ShadiDriver {
	int age;
	boolean hiv;
	String relegion1;
	String relegion2;
	static ShadiDriver com;
	static Scanner sc = new Scanner(System.in);

	static {
		com = new ShadiDriver();

		System.out.println("Enter your age : ");
		com.age = sc.nextInt();

		System.out.println("Are you having HIV ? : ");
		com.hiv = sc.nextBoolean();

		System.out.println("Enter your Religion : ");
		com.relegion1 = sc.next();

		System.out.println("Enter your Partner Religion : ");
		com.relegion2 = sc.next();

	};

	public void isMarrige() throws DoNotMarryExeption, DadaNotMarryExeption, RelegionNotMatchingExeption, AidsFound {
		if (age < 21) {
			throw new DoNotMarryExeption("You are not eligible for marrige");
		} else if (age > 60) {
			throw new DadaNotMarryExeption("Dada you are too old plese enjoy your rest years");

		} else if (!(this.relegion1.equals(relegion2))) {
			throw new RelegionNotMatchingExeption("Your religion mismatch So society dont accept you and your wife");
		} else if (hiv == true) {
			throw new AidsFound("hiv founds so Enjoy your rest of life");
		} else {
			System.out.println("Partner Matched ! lets meet togather ");
		}
	}

	public static void main(String[] args) {
		try {
			com.isMarrige();
		} catch (DoNotMarryExeption e) {

			e.printStackTrace();
		} catch (DadaNotMarryExeption e) {

			e.printStackTrace();
		} catch (RelegionNotMatchingExeption e) {

			e.printStackTrace();
		} catch (AidsFound e) {

			e.printStackTrace();
		}

	}

}
