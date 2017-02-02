package Java_3.StaticValNoInst;

class InstCnt{
	static int instNum=100;
	public InstCnt(){
		instNum++;
		System.out.println(instNum);
	}
	
}
public class StaticValNoInst {

	public static void main(String[] args) {
		InstCnt.instNum-=15;
		System.out.println(InstCnt.instNum);
	}	

}
