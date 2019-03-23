package es.unileon.prg.tema7;
public class Date{
	private int _day;
	private int _month;
	private int _year;
	public Date (int day, int month, int year)throws DateException{
		if(isDayOfMonth(day, month)){
			_day=day;
			_month=month;
			_year=year;		
		}else{
			throw new DateException("Fecha inválida: "+day+"/"+month+"/"+year);		}
		
	}
	private boolean isDayOfMonth(int day, int month){
		boolean salida=false;	
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			if(day<=31&&day>=1){
				salida=true;			
			}		
		}
		else if(month==4||month==6||month==9||month==11){
			if(day<=30&&day>=1){
				salida=true;
			}
		}
		else if(month==2){
			if(day<=28&&day>=1){
				salida=true;
			}
		}
		return salida;
	}
	public String nameOfMonth(){
		String Smonth="";
		switch(_month){
			case 1:
			Smonth="Enero";
			break;
			case 2:
			Smonth="Febrero";
			break;
			case 3:
			Smonth="Marzo";
			break;
			case 4:
			Smonth="Abril";
			break;
			case 5:
			Smonth="Mayo";
			break;
			case 6:
			Smonth="Junio";
			break;
			case 7:
			Smonth="Julio";
			break;
			case 8:
			Smonth="Agosto";
			break;
			case 9:
			Smonth="Septiembre";
			break;
			case 10:
			Smonth="Octubre";
			break;
			case 11:
			Smonth="Noviembre";
			break;
			case 12:
			Smonth="Diciembre";
			break;
		}
		return Smonth;
	}
	public String seasonOfDate(){
		String season="_";
		if(_month==1||_month==2||_month==12){
			season="Invierno";
		}
		if(_month==3||_month==4||_month==5){
			season="Primavera";
		}
		if(_month==6||_month==7||_month==8){
			season="Verano";
		}
		if(_month==9||_month==10||_month==11){
			season="Invierno";
		}
		return season;
	

	}
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
		
	}
	public int getDay(){
		return _day;
	}
	public int getMonth(){
		return _month;
	}
	public int getYear(){
		return _year;
	}
	public void setDay(int day)throws DateException{
		if(isDayOfMonth(day, _month)){
			_day=day;
		}
		else{
			throw new DateException("Fecha inválida: "+_day+"/"+_month+"/"+_year);
		}
	}
	public void setMonth(int month)throws DateException{
		if(isDayOfMonth(_day, month)){
			_month=month;
		}
		else{
			throw new DateException("Fecha inválida: "+_day+"/"+_month+"/"+_year);
		}
	}
	public void setYear(int year){
		_year=year;
	}
	public boolean isSameYear(Date date){
		boolean result=false;
		if(_year==date.getYear()){
			result=true;
		}
		return result;
	}
	public boolean isSameMonth(Date date){
		boolean result=false;
		if(_month==date.getMonth()){
			result=true;
		}
		return result;
	}
	public boolean isSameDay(Date date){
		boolean result=false;
		if(_day==date.getDay()){
			result=true;
		}
		return result;
	}
	public boolean isSame(Date date){
		boolean result=false;
		if(this.isSameDay(date)&&this.isSameMonth(date)&&this.isSameYear(date)){
			result=true;
		}
		return result;
	}
	public int daysOfMonth(){
		int dias=0;		
		if(_month==1||_month==3||_month==5||_month==7||_month==8||_month==10||_month==12){
			dias=31;	
		}
		if(_month==4||_month==6||_month==9||_month==11){
			dias=30;
		}
		if(_month==2){
			dias=28;
		}
		return dias;
	}
	public String monthsToEnd()throws DateException{
		StringBuilder meses= new StringBuilder();
		Date date=new Date(1,_month,1);
		for(int i=_month; i<=12; i++){
			date.setMonth(i);
			meses.append(date.nameOfMonth()+" ");
		}
		return meses.toString(); 
	}
	public String daysToEnd(){
		StringBuilder dias=new StringBuilder();
		for(int i=_day;i<=this.daysOfMonth();i++){
			dias.append(i+" ");
		}
		return dias.toString();
	}
	public Date randomDate()throws DateException{
		int day=0, month, year;
		Date date;
		month=(int)(Math.random()*12 +1);
		year=(int)(Math.random()*2019+1);		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			day=(int)(Math.random()*31+1);
		}else if(month==4||month==6||month==9||month==11){
			day=(int)(Math.random()*30+1);
		}else if(month==2){
			day=(int)(Math.random()*28+1);
		}
		if(isDayOfMonth(day,month)){
			date= new Date(day,month,year);
			return date;
		}
		else{
			throw new DateException("Fecha inválida: "+day+"/"+month+"/"+year);
		}	
		
	}
	public String similarMonths()throws DateException{
		StringBuilder result=new StringBuilder();
		Date date=new Date(1,1,1);
		for(int i=1; i<=12; i++){
			date.setMonth(i);
			if(this.daysOfMonth()==date.daysOfMonth()){
				result.append(date.nameOfMonth()+" ");			
			}
		}
		return result.toString();
	}
	public int daysPassed()throws DateException{
		Date date=new Date(1,1,1);
		int dias=0;
		for(int i=1; i<_month; i++){
			date.setMonth(i);
			dias+=date.daysOfMonth();
		}
		dias+=this.getDay();
		return dias;
	}
	public int attempsRandomDate(){
		Date date;
		int i=0;
		int day;
		int month;
		int counter=0;
		while(i==0){
			day=(int)(Math.random()*31+1);
			month=(int)(Math.random()*12+1);
			if(day==this._day&&month==this._month){
				
				i=1;
			}
			else{
			counter+=1;	
			}
		
		}
		return counter;
	}
	public int attempsRandomDate2(){
				Date date;
		int i=0;
		int day;
		int month;
		int counter=0;
		do{
			day=(int)(Math.random()*31+1);
			month=(int)(Math.random()*12+1);
			if(day==this._day&&month==this._month){
				
				i=1;
			}
			else{
			counter+=1;	
			}
		}while(i==0);
		return counter;
	}
	public String dayOfWeek(int start)throws DateException{
		int days=daysPassed()+start;
		int dayOfW=(days)%7;
		String retourn="";
		switch(dayOfW){
			case 0:
			retourn="Lunes";
			break;
			case 1:
			retourn="Martes";
			break;
			case 2:
			retourn="Miércoles";
			break;
			case 3:
			retourn="Jueves";
			break;
			case 4:
			retourn="Viernes";
			break;
			case 5:
			retourn="Sábado";
			break;
			case 6:
			retourn="Domingo";
			break;
		}
		return retourn;
			
	}
	public int help(){
		return 78347;
	}
	
	
	
}


