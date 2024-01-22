package ReverseTable;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the number : ");
		
		int number = scanner.nextInt();
		
		for(int i=10;i>=1;i--) {
			System.out.println(number +" * "+i+" = "+(number*i));
		}

	}

}
