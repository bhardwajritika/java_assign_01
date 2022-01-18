package assignment_01;
import java.util.*;
public class No_of_digit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		while(num>0) {
			
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
