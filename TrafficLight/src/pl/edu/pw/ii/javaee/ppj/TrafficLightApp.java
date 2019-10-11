package pl.edu.pw.ii.javaee.ppj;
/**
* The TrafficLightApp class exercises the TrafficLight Class.
* @author lesl
* @version 2019
*/


public class TrafficLightApp {
	public static void main(String[] args) {
	TrafficLight light1 = new TrafficLight("green");
	TrafficLight light2 = new TrafficLight("red");
	System.out.println("The state of light1 is "+light1.getState());
	light1.yellow();
	System.out.println("The state of light1 is "+light1.getState());
	light2.green();
	System.out.println("The state of light2 is "+light2.getState());
	light2.yellow();
	System.out.println("The state of light2 is "+light2.getState());
	}
	}
