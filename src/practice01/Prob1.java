package practice01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		System.out.print("수를 입력하세요! : ");
		int targetNum = scanInt.nextInt();
		
		if(targetNum%3==0)
			System.out.println(targetNum+"은 3의 배수입니다!");
		else
			System.out.println(targetNum+"은 3의 배수가 아닙니다!");

	}
}
