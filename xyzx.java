class abc{
	int a;
	abc(int a){
     a=a;
     System.out.println("Constructor");
 	}
	void display(){
	System.out.println(a);
	}
	}
	class xyzx{
		public static void main(String[] args){
			abc ob = new abc(2);
			ob.display();
			abc ob2 = new abc(100);
			ob2.display();

	}
}
	