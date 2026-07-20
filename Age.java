import java.util.Scanner;
public class Age{
	public static void main(String[] args){
	Scanner ob = new Scanner(System.in);
	int age;
	age= ob.nextInt();
	if(age>=18){
	System.out.println("Eligible to vote");
}else{
	System.out.println("Not eligible to vote");
}
}	
}