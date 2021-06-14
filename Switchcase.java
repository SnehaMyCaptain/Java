package switchcase;

import java.util.Scanner;

public class Switchcase {


	public static void main(String[] args){
		int choice;
		System.out.println("Pick one :1. Hi\t2. Hey\t3. hello\t");
		Scanner s = new Scanner(system.in);
		choice= a.nextInt();
		swicth(choice)
		{
			case1 : System.out.println("You said Hi");
				break;
			case 2:System.out.println("You said Hey");
				break;
			case 3:System.out.println("you said hello");
				break;
			default:System.out.println("Invalid choice");
		}
	}
}