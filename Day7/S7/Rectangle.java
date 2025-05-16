class Rectangle{
	private int height;
	int width;
	
	Rectangle(){
		height=width=2;
	}
	
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
		System.out.println("Just created a rectangle object with the size (h*w) "+height+" * "+ width);
		print(width,height);
	}
	
	void get_details(){
		System.out.println("Rectangle 3: Height is "+height +" Width is " +width);
	}
	
	void print(int width,int height){
		
		for(int j=0; j<height ; j++){
			for(int i=0 ; i<width ; i++){
				System.out.print("*");
			}
			System.out.println();//break line
		}
		
		
	}
}

class Main{
	//public static int main(String[] args){
	public static void main(String[] args){
		/*for(int i=0 ; i<10 ; i++){
			System.out.println("Value of i is "+i);
		}*/
		//return 0;
		
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle();
		//r1.height=10;
		r1.width=20;
		Rectangle r3=r1;
		r1.get_details();
		r2.get_details();
		r3.get_details();
		/*System.out.println("Rectangle 1: Height is "+r1.height +" Width is " +r1.width);
		System.out.println("Rectangle 2: Height is "+r2.height +" Width is " +r2.width);
		System.out.println("Rectangle 3: Height is "+r3.height +" Width is " +r3.width);//print r1 details
		//r1.print(3,4);
		
		//sacnner to input values when running*/
		
	}
	
}