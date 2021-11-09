import java.util.*;

public class ChallengeQ3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		int num = arr.length;
		int lastLength = arr[num-1].length();
		System.out.println("Length of last word:"+lastLength);
			
	}
		
}