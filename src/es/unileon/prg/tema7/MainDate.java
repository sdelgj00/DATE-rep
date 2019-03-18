package es.unileon.prg.tema7;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(5, 13, 2017);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
