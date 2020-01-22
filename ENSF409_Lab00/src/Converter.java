
public class Converter {
//Your names go here:
/*
* @Author: Mehdi Marzban
* Baylee Cheung
* Saksham Nanda 
*
*/
	private double celsiusToFahrenheit(double C){
// TODO: The third student will implement this method
		return ((C*(9/5))+32);
	}
	private double fahrenheitToCelsius(double F){
 // TODO: The second student will implement this method
		return (F-32)*5/9;
	}

	private double kilometersToMiles(double K){
		return (K/1.609);
	}
	
	public static void main(String[] args) {
//TODO: The first student will implement this method.
// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value
		double x= celsiusToFahrenheit(180);
		double y= fahrenheitToCelsius(250);
	}
}

