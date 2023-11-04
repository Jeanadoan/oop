package d;

public class constructor {

		int number; //variable, attributes, property
		String name; 
		
		public constructor (int number1, String name1) { //create constructor 
			number=number1; //set initial value for attribute
			name= name1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor jeana=new constructor (5, "jeana");
		
		System.out.println (jeana.number +" "+  jeana.name);
		
	}

}
