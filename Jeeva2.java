import java.util.Scanner;
class Jeeva{
	int a,b,c;
	void Sum(){
	c=a+b;
	System.out.println(c);
	}
}
class Jeeva2{
public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	Jeeva obj1 = new Jeeva();
	Jeeva xyz = new Jeeva();
	obj1.a=obj.nextInt();
	obj1.b=obj.nextInt();
	xyz.a=obj.nextInt();
	xyz.b=obj.nextInt();
	obj1.Sum();
	xyz.Sum();
	}
}