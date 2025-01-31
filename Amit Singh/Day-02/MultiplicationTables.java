import java.util.Scanner;

public class MultiplicationTables {
	public MultiplicationTables(int start, int end) {
		for(int i=1; i<=10; i++) {
			for(int j=start; j<=end; j++) {
				System.out.print(padLeft(j,2) + " x " + padLeft(i,2) + " = " + padLeft((i*j),3) + "   ");
			}
			System.out.println();
		}
	}

	public String padLeft(int number, int length) {
		StringBuffer buf = new StringBuffer(String.valueOf(number));
		for(int i=buf.length(); i<length; i++) {
			buf.insert(0," ");     // Space is inserted in the left side of the number
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		
		// This code i updated in the earlier program....
		
		Scanner sc = new Scanner(System.in);
		//int start= sc.nextInt();
		//int end = sc.nextInt();
		int start= 15;
		int end = 45;
		int temp_end=start+4;
		while(temp_end<=end) {
			new MultiplicationTables(start, temp_end);
			start+=5;
			temp_end+=5;
			System.out.println("\n");
		}
		int remain = temp_end-end;
		temp_end-=remain;
		new MultiplicationTables(start, temp_end);
		System.out.println();
	}
}
