public class Dog {
	public int weightInPounds;

	public Dog(int w) {
		weightInPounds = w;
	}

	public void bark() {
		if(weightInPounds < 10) {
			System.out.println("yipyipyip!");
		} else if(weightInPounds < 30) {
			System.out.println("Arrrrf.")
		} else {
			System.out.println("Woof!");
		}
	}
}