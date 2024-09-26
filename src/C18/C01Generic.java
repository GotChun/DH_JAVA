package C18;

class 재료{
	
}


class 야채 extends 재료{

	@Override
	public String toString() {
		return "야채 []";
	}

}
class 팥 extends 재료{
	@Override
	public String toString() {
		return "팥 []";
	}
}
class 슈크림 extends 재료{
	@Override
	public String toString() {
		return "슈크림 []";
	}
}
class 피자 extends 재료{
	@Override
	public String toString() {
		return "피자 []";
	}
}

class 민초{

	@Override
	public String toString() {
		return "민초 []";
	}
	
}


class 호빵<T extends 재료>{	// <> 연산자안에 extends 재료 쓰면 재료클래스를 상속받는 클래스만 사용가능
	private T material;			//제네릭타입 클래스 T는 참조변수 이름임
	호빵(T material){
		this.material=material;
	}
	@Override
	public String toString() {
		return "호빵 [material=" + material + "]";
	}
}
public class C01Generic {

	public static void main(String[] args) {

		호빵<팥> ob1 = new 호빵<팥>(new 팥());
		System.out.println(ob1);
		
		
		호빵<야채> ob2 = new 호빵<야채>(new 야채());
		System.out.println(ob2);
		
		호빵<슈크림> ob3 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob3);
		
		호빵<민초> ob4 = new 호빵<민초>(new 민초());
		System.out.println(ob4);
	}
}
