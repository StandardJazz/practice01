package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String targetString = scan.nextLine();
		int length = targetString.length();

		String resultString = new String();

		for(int i = 0 ; i<length;i++){
			resultString +=targetString.charAt(i);
			System.out.println(resultString);
		}
	}
}
