package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 ! : ");
		int targetNum = scan.nextInt();
		int sum = 0;

		if (targetNum % 2 == 0) {
			for (int i = 0; i <= targetNum; i++) {
				if(i%2!=0)
					continue;
				System.out.println(i);
				sum+=i;
			}
		} else {
			for(int i = 0 ; i<=targetNum ; i++){
				if(i%2==0)
					continue;
				System.out.println(i);
				sum+=i;
			}

		}
		System.out.println("조건에 따른 합은 : " + sum);

	}

}
