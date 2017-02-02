package Java_10.GenericBaseFruitBox;


class Orange{
	int sugarContent;
	Orange(int sugar){
		this.sugarContent = sugar;
	}
	public void showSugarContent(){
		System.out.println(this.sugarContent);
	}
}

class Apple{
	int weight;
	Apple(int weight){
		this.weight = weight;
	}
	public void showAppleWeight(){
		System.out.println(this.weight);
	}
}

class FruitBox<T>{
	T item;
	
	FruitBox(T item){
		this.item = item;
	}
	
	public void store(T item){
		this.item = item;
	}
	public T pullOut(){
		return this.item;
	}
}

public class GenericBaseFruitBox {

	public static void main(String[] args) {
		FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(20));
		orBox.store(new Orange(10));
		Orange org = orBox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> apBox = new FruitBox<Apple>(new Apple(10));
		apBox.store(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
		
		/*
		FruitBox<Orange> stBox = new FruitBox<Orange>(new Orange(20));
		stBox.store("123");
		*/
	}
}
