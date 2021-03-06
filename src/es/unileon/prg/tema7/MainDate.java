package es.unileon.prg.tema7;

public class MainDate {

	public static void main(String[] args) {

		Date today, xday, nday;

		try {
			today = new Date(26, 11, 2017);
			xday = new Date(20, 4, 2017);
			
			System.out.println(today.toString());
			
			System.out.println("Mes:" +today.nameOfMonth());
			System.out.println("Estación:" +today.seasonOfDate());
			System.out.println("IGUALDAD:" +today.isSame(xday));
			System.out.println("Meses hasta final de año: "+today.monthsToEnd());
			nday=today.randomDate();
			System.out.println("nday: "+nday.toString());
			System.out.println(today.daysToEnd());
			System.out.println(today.similarMonths());
			System.out.println("Dias del año: "+today.daysPassed());
			System.out.println("Intentos sacar misma fecha atleatoria (while): "+today.attempsRandomDate());
			System.out.println("Intentos de sacar misma fecha atleatoria (do-while): "+today.attempsRandomDate2());
			System.out.println("Día de la semana empezando en Lunes: "+today.dayOfWeek(3));
		} catch (DateException e) {
			System.out.println(e.getMessage());

		}

	}

}
