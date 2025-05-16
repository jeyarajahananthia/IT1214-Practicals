class Students{
	int marks;
	String name;
	
	Students(){
		System.out.println("Creating a student object");
		name="default name";
	}
	Students(String n,int m){
		System.out.println("Creating a student object with name "+n+ " marks " +m);
	}
}

/*class Printer{
	void print(String s){
		System.out.println(s);
		
	}
}*/

class App{
	public static void main(String[] args){
		
		//Printer p=new Printer();
		//p.print("Welcome to Demo class app");
		//p.print("Name of the student is "+ s1.name);
		
		System.out.println("Welcome to DEMO class APP");
		
		Students s1=new Students();
		s1.marks=100;
		System.out.println("Name of the student is "+ s1.name);
		s1.name="Alice";
		System.out.println("Name of the student is "+ s1.name);
		
		Students s2=new Students("Bob",50);
		//s2.marks=50;
		s2.name="Bob";
		System.out.println("Name of the student is "+ s2.name);
		
		
		
	}
}