package Java_8.MeaningfulConst;

import java.util.Scanner;

interface Week{
	int MON=1,TUE=2,WED=3,THU=4,FRI=5,SAT=6,SUN=7;
}


public class MeaningfulConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch(sel){
		case Week.MON:
			System.out.println("1");
			break;
		case Week.TUE:
			System.out.println("2");
			break;
		case Week.WED:
			System.out.println("3");
			break;
		case Week.THU:
			System.out.println("4");
			break;
		case Week.FRI:
			System.out.println("5");
			break;
		case Week.SAT:
			System.out.println("6");
			break;
		case Week.SUN:
			System.out.println("7");
			break;
		}
		sc.close();
	}

}
