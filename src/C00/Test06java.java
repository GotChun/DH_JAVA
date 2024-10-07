package C00;

import java.util.Scanner;

public class Test06java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 : ");
		int height = sc.nextInt();
		int top = height/2;		//4			//탑의 절반 길이 지정


		int i = 0;			//시작 초기값
		while(i<height) {		//높이까지 반복
			if(i<top) { // 						//상단부 반복문
				for(int j=0;j<top-i;j++) {		// i가 늘수록 top -1 씩 감소
					System.out.print(" "); 		//공백 출력
				}
				for(int k=0;k<(i*2)+1;k++) {	// i 가 1 증가할 때 별 개수 2 증가.
					System.out.print("*");		// i가 0일 때도 별이 1개 찍혀야 하고 무조건 홀수로 찍혀야 하기때문에 i를 2로 곱한 뒤 +1
				}
				System.out.println();
				i++;

			}
			else {								//하단부 반복문
				for(int a=0;a<i-top ;a++) {		// i가 늘어날수록 공백 개수 증가. 공백의 최대개수 = 탑의 절반
					System.out.print(" ");				//즉 i - top
				}
				for(int b=0;b<2*(height-i-1)+1;b++) {	//i가 늘어날수록 별의 개수는 2개씩 감소한다.
					System.out.print("*");			//	height 에서 -1 을 하는것은 마지막 인덱스인8이다 . 여기서 - i 는 최상단부에서부터의 거리를 나타낸다.
				}										//height(9) - 4 를 하면 5이므로 현재 5번째 라인에 있다는 뜻이 된다. 여기서 2를 곱해 별을 2개씩 줄이도록 할 수 있다.
				System.out.println();					// 그리고 +1을 함으로써 별의 개수를 홀수로 만들도록 한다. 이것을 통해 모양의 대칭을 유지할 수 있게 한다.
				i++;
			}
		}


	}

}

//높이 9
//    *			//공백 4  별 1   0
//	 ***		//공백 3  별 3   1
//  *****		//공백 2  별 5   2
// *******		//공백 1  별 7   3
//*********		//공백 0  별 9   4
// *******		//공백 1  별 7   5
//  *****		//공백 2  별 5   6
//   ***		//공백 3  별 3   7
//    *			//공백 4  별 1   8
