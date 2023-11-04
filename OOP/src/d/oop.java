package d;

public class oop {

	
		// TODO Auto-generated method stub
	/*	String name ;
		int ID;
		String Address;
		public static void main(String[] args) {
			oop henry=new oop ();
			henry.name = "Henry";
			henry.ID = 101010;
			henry.Address= "ontario";
			System.out.println ("name: "+ henry.name +" ID: "+ henry.ID+" Address: " + henry.Address);
			
			oop Ken=new oop ();
			Ken.name = "Ken";
			Ken.ID = 100121;
			Ken.Address= "north pole";
			System.out.println ("Name:" + Ken.name +" ID: "+ Ken.ID+" Adress: " + Ken.Address);
	
			oop brian=new oop ();
			brian.name = "brian";
			brian.ID = 100102;
			brian.Address= "south pole";
			System.out.println ("Name: "+briaan.name +" ID:"+ brian.ID+" Address: " + brian.Address);
		
			oop le=new oop ();
			le.name = "le";
			le.ID = 101001;
			le.Address= "somewhere";
			System.out.println ("Name: "+le.name +" ID: "+ le.ID+" Address: " + le.Address);
	
			oop jeana=new oop ();
			jeana.name = "jeana";
			jeana.ID = 1010111;
			jeana.Address= "USA";
			System.out.println ("Name: "+jeana.name +" ID: "+ jeana.ID+" Address: " + jeana.Address); 
		*/
	String name;
	int Id;
	String address;
	//defined constructor
	//constructor is also a method, its a special where we define it no need to call it
	void insertInfo (String n, int id, String ad) {//in constructor we set parameter
				name=n; // assign parameters to variables
				Id=id;
				address=ad;
			}
	//defined method
			void displayInfo () {
				System.out.println (name+" "+Id+" "+ address);
			}
				//creating main method inside the student class
				public static void main(String[] args) {
			oop Jeana=new oop (); //create a object for student class
			Jeana.insertInfo ("Jeana", 1, "ad");
			Jeana.displayInfo ();
			
		oop ken=new oop ();
		ken.insertInfo ("ken", 2 ,"address");
		ken.displayInfo ();
		
		oop brian=new oop();
		brian.insertInfo ("brian", 3, "addresss");
		brian.displayInfo ();
		}

}
