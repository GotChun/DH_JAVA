package C00;
class Animal{
	public void sound(){
		System.out.println("Bark!!!");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Fuck!!");
	}
}
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
//		Animal dog1 = new Dog();
		Dog dog2 = new Animal();
		dog.sound();
//		dog1.sound();
		dog2.sound();
	}

}
