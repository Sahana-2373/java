import java.util.Scanner;
public class Ifelse{
	public static void main(String[] args){
	Scanner ob = new Scanner(System.in);
	int x;
	int y;
	int z;
	x = ob.nextInt();
	y=ob.nextInt();
	z=ob.nextInt();
	if(x<y && x<y){
	System.out.println("x is Smaller");
}else if(y<z){
	System.out.println("y is Smaller");
}
else{
	System.out.println("z is Smaller");
}
}
}