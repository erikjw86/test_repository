import java.util.Scanner;

public class RepoTest {
	
	public static void main(String[] args) {
		
		System.out.println("What year were you born?");
		
		Scanner input = new Scanner(System.in);
		int yearborn = input.nextInt();
		
		int age = 2021 - yearborn;
		
		System.out.println("You are " + age);
		
		
	}

}
