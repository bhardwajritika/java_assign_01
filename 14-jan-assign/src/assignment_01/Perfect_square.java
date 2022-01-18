package assignment_01;
import java.util.*;


public class Perfect_square {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i == 0)
				count++;
		}
		if(count%2!=0)
			System.out.println("Perfect Square");
		else
			System.out.println("Not a perfect square");
	}

}
