package C17;

public class C04ExceptionMain {

	public static void main(String[] args) {

		try {
		String str=null;
		str.toString();		//null  예외발생


		int arr[] = {10 , 20 , 30};
		arr[5] = 100;					//Bound Exception 발생	//배열길이보다 큼
		Integer.parseInt("a1234");		//Parse Exception 발생 //문자가 있음

		Animal animal = new Dog();
		Cat yummi = (Cat)animal;		//Cast Exception 발생
		}catch() {

		}catch() {

		}catch() {

		}catch() {

		}

	}
}
