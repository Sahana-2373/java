class Jeeva{
	int a,b,c;
	void Sum(){
	c=a+b;
	System.out.println(c);
	}
}
class Jeeva1{
public static void main(String[] args){
	Jeeva obj = new Jeeva();
	Jeeva xyz = new Jeeva();
	obj.a=5;
	obj.b=10;
	xyz.a=10;
	xyz.b=20;
	obj.Sum();
	xyz.Sum();
	}
}