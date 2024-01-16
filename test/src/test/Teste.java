package test;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
	public static void main (String args[]) {
		ArrayList<String> divisibleNums = new ArrayList();
		Scanner Objchoice = new Scanner(System.in);
		System.out.println("Insert the choice of division, and later the number to be the range , from [0-range]");
		System.out.println("Insert the divisible number choice: ");
		int choice = Objchoice.nextInt();
		System.out.println("Insert the range, from [0-range]: ");
		int range = Objchoice.nextInt();
		Objchoice.close();
		for(int i = 0; i < range; i++) {
			
			if (i % choice == 0) {
				divisibleNums.add((Integer.toString(i)));
			}
			
		}
		System.out.println(String.format("The nums prompted and that satisfy the given condition, in the range [0 -  %d] are: ", range));
		for (int j = 0 ; j < divisibleNums.size(); j++) {
			System.out.print(String.format("%s  ", divisibleNums.get(j)));
		}	
	}
}
