package es.unileon.prg.tema7;

public class MainDate {

	public static void main(String[] args) {

		Date today, xday;

		try {
			today = new Date(5, 8, 2017);
			xday = new Date(5, 8, 2017);
			System.out.println(today.toString());
			System.out.println("Mes:" +today.nameOfMonth());
			System.out.println("Estación:" +today.seasonOfDate());
			System.out.println("IGUALDAD:" +today.isSame(xday));
			System.out.println("Meses hasta final de año: "+today.mesesQueFaltan());
			
		} catch (DateException e) {
			System.out.println(e.getMessage());

		}

	}

}
