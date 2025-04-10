class One{
    int a=10;  //variable definition
	int b;     //variable declaretion
	
	void printDetails(){       //method 
	    System.out.println("from class one a= "+a);
		System.out.println("from class Two b= "+b);
		
	}

}

class Two{
	int a,c;
	void printDetails(){
		System.out.println("from class Two a= "+a);
		System.out.println("from class Two c= "+c);
		
	}

}

class App{
	public static void main(String[] args){
		 One o1=new One();
		 Two t1=new Two();
		 
		 o1.printDetails();
		 o1.b=100;
		 o1.printDetails();
		 t1.printDetails();
		 t1.a=20;
		 t1.c=30;
		 t1.printDetails();
		 
		
	}

}