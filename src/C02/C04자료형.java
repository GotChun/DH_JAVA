package C02;

public class C04자료형 {

	public static void main(String[] args) {
	//byte 1byte	
	//short	2byte  
	//char	2byte
	//int 4byte (기본자료형)	
	//long	8byte  64bit = 개많음
	
	//실수
	//float
	//double
		
	// 정수 int - 4byte 정수 부호 o
		
//	int n1 = 0b10101101;	//2진수값		//상수풀에 저장됨
//	int n2 = 173;			//10진정수값
//	int n3 = 0255;			//8진수
//	int n4 = 0xad;			//16진수
//	System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
//	byte n5 = (byte)-129;		  //byte라서   //큰 공간에 있는 값을 
//	byte n6 = -30;
//	byte n7 = 30;
//	byte n9 = 127;
//	byte n9 = (byte)129;	//억지형변환 가능은 한데 데이터 변형이 일어남		//컴파일러 에러가 난다 why ? byte라서 범위를 넘어서서 
//	
//	System.out.printf("%d\n",n5);   
//	System.out.println(0b10101101);	//음수라고 ?
//	System.out.println(Integer.toBinaryString(-129));
	
	//---------------------------------------------------
	// 정수 short -2byte 정수 부호 o | char-2byte 정수 부호x(양수만)
	
//	char n1 =65535; //(0~2^16-1)  (0~65535)
//	short n2 = 32767; //(-2^15 ~ +2^15-1) (-32768 ~ + 32767)
//	
//	char n3 =60000;
//	short n4 = n3; //문제발생 .. why?		형이 다르고 , short는 최대 32767 까지 가능하기 때문에
//	
//	System.out.printf("%d\n",n4);	
//		----------------------
		
	//정수 long - 8byte 정수 부호 o
	
	//
//	long n1 = 10;		//딱히 문제없이 들어가니까 자동형변환
//	long n2 = 20;	//L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//	
//	long n3 = 10000000000L; // Error ? why ?
//	long n4 = 10000000000l;
//	
//	
//	System.out.println(n3);
//	System.out.println(n4);
	
	//---------------------------------------
//	실수
//	유리수와 무리수의 통칭
//	소숫점이하값을 가지는 수 123.456
//	float : 4byte 실수 (6-9자리)
//	double : 8byte 실수(15-18자리) , 기본자료형
	
	//정밀도 확인
	float n1 = 0.123445352354235325423F; //f,F : float 형 접미사   6~9자리에서부터 이상하게 나옴(올림처리)
	double n2 = 0.123123124152352352345; 	//근데 실수는 웬만해서는 안쓰는게 좋다고함 !
	
	System.out.println(n1);
	System.out.println(n2);
	
		
	}
}
