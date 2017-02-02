package Java_10.ObjectBaseFruitBox;

class Orange{
	int sugarContent;
	Orange(int sugar){
		this.sugarContent = sugar;
	}
	public void showSugarContent(){
		System.out.println(this.sugarContent);
	}
}

class FruitBox{
	Object item;
	public void store(Object item){
		this.item = item;
	}
	public Object pullOut(){
		return this.item;
	}
}

class OrangeBox{
	Orange item;
	public void store(Orange item){
		this.item = item;
	}
	public Orange pullOut(){
		return this.item;
	}
}

public class ObjectBaseFruitBox {

	public static void main(String[] args) {
		FruitBox fBox1 = new FruitBox();
		fBox1.store(new Orange(10));
		Orange org1 = (Orange)fBox1.pullOut();
		org1.showSugarContent();
		/*
		FruitBox fBox2 = new FruitBox();
		fBox2.store("orange");
		Orange org2 = (Orange)fBox2.pullOut();
		org2.showSugarContent();
		*/
		
		/*
		OrangeBox fBox2 = new OrangeBox();
		fBox2.store("orange");
		*/
	}

}
