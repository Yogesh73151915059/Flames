package String;
import java.util.*;
public class Flames_Game {
   
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Flames Game");
		System.out.print("Enter your name:");
		String ch1=sc.next().toLowerCase();
		System.out.print("Enter your crush name:");
		String ch2=sc.next().toLowerCase();
		int ch1_size=ch1.length();
		int ch2_size=ch2.length();
		int count=0;
		for(int i=0;i<ch1_size;i++) {
			for(int j=0;j<ch2_size;j++) {
				if(ch1.charAt(i)==ch2.charAt(j)) {
					count++;
					break;
				}
			}
		}

		int bla=(ch1_size+ch2_size)-(count*2);
		flames_check(bla);
	}

	private static void flames_check(int bla) {
		
		String org="flames";
		while(org.length()!=1) {
			int cut=0;
			for(int i=1;i<=bla;i++) {
				if(cut>=org.length()) {
					cut=0;
				}
				++cut;
			}
			org=org.substring(0, cut-1)+org.substring(cut);
			org=org.trim();
		}
		switch(org) {
		case "f":
			System.out.println("You got good Friend");
			break;
		case "l":
			System.out.println("Congratulation");
			System.out.println("You got Lover!");
			break;
		case "a":
			System.out.println("You got Affection");
			break;
		case "m":
			System.out.println("You got Marriage");
			break;
		case "e":
			System.out.println("Sorry");
			System.out.println("You got Enemy");
			break;
		case "s":
			System.out.println("You got Sister");
			break;
		}
	}

}
