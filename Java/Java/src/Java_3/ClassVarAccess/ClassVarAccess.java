package Java_3.ClassVarAccess;
class AccessWay{
	static int num=0;
	AccessWay() {
		incrCnt();
	}
	public void incrCnt(){
		num++;
	}
}

public class ClassVarAccess {

	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println(AccessWay.num);
	}

}
