package assignment01;

public class AverageSpeeed {

	public static void main(String[] args) {
		System.out.println("Distance = 24 miles = " + (24 * 1.6) + "  Kilometers ");//comvert miles into KM
		
		//convert minutes & sec into hrs
		//why we putting .0 after the mins and secs because we get the hr in decimals.
		System.out.println("Time = 1hr 40m 35sec = " + (1+(40.0/60.0)+(35.0/3600.0)) + " hours \n");
		
		System.out.println("Speed = " + ((24*1.6)/(1+(40.0/60.0)+(35.0/3600.0)))+ " kph ");//speed=distance/time
	}

}
