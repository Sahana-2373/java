class abc{
	int a;
	abc(){
     a=10;
     System.out.println("Constructor");
 	}
	void display(){
	System.out.println(a);
	}
	}
	class xyz{
		public static void main(String[] args){
			abc ob = new abc();
			ob.display();
			abc ob2 = new abc();
	}
}
	