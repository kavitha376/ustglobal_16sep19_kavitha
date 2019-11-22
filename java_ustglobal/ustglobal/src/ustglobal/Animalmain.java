package ustglobal;

public class Animalmain {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();
		l.roar();
		
		
		
		System.out.println("*********************");
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		System.out.println("***********************");
		Animal a =new Animal();
		a.eat();
	}

}
