class Paper{            //no methods,constructors
	int length;         //only decleration
	int width;
	String text;
}

class Document{
	String name;    //My First Document
	Paper p; //paper type object
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created my document object d");
		d.name="My First Document";
		System.out.println("Nmae of the document d is: " + d.name);
		d.p=new Paper();
		
		d.p.length=10;
		d.p.width=10;
		d.p.text="This is the text in document My First Document";
		
		System.out.println("Size of l*w of the paper of document d is: " + d.p.length+ "*" +d.p.width);
		System.out.println("The text value is " + d.p.text);
		
		/*Document d2=new Document();
		System.out.println("Created my Document object d2");
		d2.name="My Second Document";
		System.out.println("Nmae of the document d is: " + d2.name);*/

	}
}
