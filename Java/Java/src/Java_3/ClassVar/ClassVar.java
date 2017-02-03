


package Java_3.ClassVar;
class InstCnt{
	static int instNum=0;
	public InstCnt(){
		instNum++;
		System.out.println(instNum);
	}
}

public class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}

}
