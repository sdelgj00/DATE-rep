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
	public String SeasonOfMonth(){
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
			Smonth="Septiempbre";
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
		if(_year=date.getYear()){
			result=true;
		}
		return result;
	}
	public boolean isSameMonth(Date date){
		boolean result=false;
		if(_month=date.getMonth()){
			result=true;
		}
		return result;
	}
	public boolean isSameDay(Date date){
		boolean result=false;
		if(_day=date.getDay()){
			result=true;
		}
		return result;
	}
	public boolean isSame(Date date){
		if(this.i
	}
	
	
	
}

