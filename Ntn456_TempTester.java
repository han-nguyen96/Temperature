class Ntn456_TempTester{

	public static void main(String[] args){
		Ntn456_Temperature a = new Ntn456_Temperature();

		Ntn456_Temperature b = new Ntn456_Temperature();

		a.setFahrenheit(75);

		System.out.println("The celsius value is "+ a.getAsCelsius());

		b.setCelsius(15);

		System.out.println("The fahrenheit value is "+b.getAsFahrenheit());
	}
}