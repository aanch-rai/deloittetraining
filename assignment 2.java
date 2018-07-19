/*

Mandated Programming Practices for the course: 
1.	It is important that code must use meaningful names, conventions, appropriate constructs and indentation.
2.	Every function must be preceded by short and meaningful comments explaining the purpose of the function.
3.	It is important and implicit that all the data entered for the program should be valid. 

1.	The temperatures of the cities across various countries are continuously monitored.
 A warning is displayed in cases where temperature goes beyond intolerable range. 
 The temperature will be entered either in the form of Celsius or Fahrenheit. 
The conversion formula is C=5(F-32)/19. 
If the temperature is beyond 60 degree Celsius or below -10 degree Celsius,
 warning has to be displayed. 
*/
//*******************************************************************************************************
package newproj;

import java.util.Scanner;

public class WeatherSystem 
{
	
	
    float temp; //instance variable to store the temperature
	
	public void to_celsius(float f)  //used to convert farenheit to celsius
	{
		float tempIncel;
		tempIncel = 5*(f-32)/19; //f is a local variable representing farenheit
		this.temp = tempIncel; //this need not be used as it is not a main(static) method i.e
		
	}
	
	
	public void warning()  //will print the warning message
	{
		System.out.println("Caution!The temperature is Intolerable ");
	}
	
	WeatherSystem() //constructor
	{
		temp = (float) 0.0; //initialize the object's variable temp to 0
	}
	
	public static void main(String[] args) 
	{
		char s;   //s is used to store if information regarding Celsius or Farenheit
		WeatherSystem obj = new  WeatherSystem();
		//memory allocated+instance variable temp is initialized + constructor is called
		//Also it is required to create object as main is a static method and it can use only
		
		System.out.println("Is the temp in celcius or farenheit? Enter C or F respectively");
		
		Scanner sc = new Scanner(System.in);
		s= sc.next().charAt(0); //assigns the input character to s
		  
		System.out.println("Enter the value : ");
		obj.temp = sc.nextFloat();// assign the numeric input to the instance variable temp 
		
		sc.close();
		
		if (s=='F')
				{	obj.to_celsius(obj.temp);
					System.out.println("The temperature in Celsius = "+obj.temp);
				}
		
		if(obj.temp>60 || obj.temp<-10)
		{
			obj.warning();
		}
		else
		{
			System.out.println(" The temperature is tolerable");
		}
	
	
	}



}


