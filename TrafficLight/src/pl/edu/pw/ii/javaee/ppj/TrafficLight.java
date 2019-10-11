package pl.edu.pw.ii.javaee.ppj;

public class TrafficLight {

		private String state; // green, yellow, red
		/**
		* Constructor for objects of class TrafficLight.
		* Pass in "green", "yellow" or "red" to
		* represent the state of the TrafficLight object.
		*
		* @param state the initial state of the TrafficLight object
		*/
		public TrafficLight(String state) {
		this.state = state;
		}
		
		/**
		* The getState() method is an accessor method
		* for the state variable.
		*
		* @return the value of "state"
		*/
		public String getState() {
		return state;
		}
		/**
		* The setState(String state) is a mutator method
		* for the state variable.
		*
		* @param state the value used to initialize the state variable
		*/
		public void setState(String state) {
		this.state = state;
		}
		
		
		/**
		* The green() method sets the state of the TrafficLight
		* to green color if the current color is yellow.
		*/
		public void green() {
		if (state.equals("green")) {
		System.out.println("The light is already green.");
		} else if (state.equals("red")) {
		System.out.println("The light has " + state +
		" color but must be yellow before it can become green.");
		} else {
		state = "green";
		System.out.println("The light is now green.");
		}
		}
		
		public void yellow() {
		if (state.equals("green") || state.equals("red")) {
		state = "yellow";
		System.out.println("The light is now yellow.");
		} else {
		System.out.println("The light is already yellow.");
		}
		}
		public void red() {
		if (state.equals("red")) {
		System.out.println("The light is already red.");
		} else if (state.equals("green")) {
		System.out.println("The light has " + state +
		" color but must be yellow before it can become green.");
		} else {
		state = "red";
		System.out.println("The light is now red.");
		

	}

}}
