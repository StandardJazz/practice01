package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		String str = new String();

		for (int i = 1; i < 999; i++) {
			
			int hunLoc = i / 100; 
			int tenLoc = (i - hunLoc * 100) / 10; 
			int oneLoc = (i - hunLoc * 100 - tenLoc * 10); // 345- 300 - 40
			
			
			if(oneLoc!=0 && oneLoc%3==0)
				str+=" 짝";
			if(tenLoc!=0 && tenLoc%3==0)
				str+=" 짝";
			if(hunLoc!=0 && hunLoc%3==0)
				str+=" 짝";
			
			System.out.println(i+ str);
			str = "";
		}

	}
}
