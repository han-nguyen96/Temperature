class Ntn456_Temperature {
	private double Fah_Temp;
	private double Cel_Temp;

	Ntn456_Temperature(){
		setFahrenheit(0);
		setCelsius(0);
	}

	public void setFahrenheit(double i){
		this.Fah_Temp=i;
	}

	public void setCelsius(double i){
		this.Cel_Temp=i;
	}

	public double getAsFahrenheit(){
		double f_temp;
		f_temp = ((Cel_Temp)*(1.8))+32;
		return f_temp;
	}

	public double getAsCelsius(){
		double c_temp;
		c_temp=((Fah_Temp-32)/(1.8));
		return c_temp;
	}


}

