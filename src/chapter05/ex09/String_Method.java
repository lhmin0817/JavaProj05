package chapter05.ex09;

import java.util.Arrays;

public class String_Method {
	public static void main(String[] args) {
		//String 클래스에서 사용되는 주요 메소드(함수)
				//기본 자료형 : boolean, byte, short, int, long, float, double, char
				//참조 자료형 : 배열  / 열거 / 객체 / 인터페이스 	<== 첫자 모두 대문자 
		
		//1. 문자열의 길이(length())
		//	 [참조]자료형  [참조]변수
		String str1 = "Hello Java";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());				//글자의 갯수 : 11 자
		System.out.println(str2.length());				//글자의 갯수 : 13 자 
		
		
		//2. 문자열 검색(charAt(), indexof(), lastIndexod())
		System.out.println(str1.charAt(1));				//1번 방의 문자를 출력 : e
		System.out.println(str2.charAt(1));				//녕
		
		System.out.println();
		
				//indexof(), lastIndexof()				<한 문자의 방번호를 검색>
		System.out.println(str1.indexOf('a'));			//왼쪽 부터 순차적으로 검색 / 문자 a가 저장된 방번호를 출력 : 7
		System.out.println(str1.lastIndexOf('a'));		//오른쪽 부터 순차적으로 검색 / 문자 a가 정장된 방번호를 출력 : 9
		
		System.out.println(str1.indexOf('a',8));		//8번에서 왼쪽으로 순차적 검색 검색 a를 검색 : 9
		System.out.println(str1.lastIndexOf('a',8));	//8번에서 오른쪽으로 순차적 검색 검색 a를 검색 : 7
		
		
		System.out.println("==========");
			//문자열을 검색해서 방번호를 출력
		System.out.println(str1.indexOf("Java"));		//6번 방으로부터 시작
		System.out.println(str2.indexOf("하세요"));		//2번 방으로부터 시작
		System.out.println(str1.lastIndexOf("ello"));	//1
		
				//문자열 검색에 실패 시 : -1	값을 출력
		System.out.println(str1.indexOf("bye"));		//-1
		
		//3. 문자열 변환 및 문자열 연결 : String.valueof(), concat()
		// String.valueof() : 기본 자료형을 ==> String자료형으로 변환
		
		//String str3 = 2.3;								// 오류발생 : 2.3(double형 데이터를 String에 담아 오류)
		String str3 = String.valueOf(2.3);
		//String str4 = true									// 오류발생 : boolean타입을 String 변수에 저장 시 오류
		String str4 = String.valueOf(true);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("==========");
		
		//concat() : +연산자와 같은 문자열과 문자열을 연결시켜주는 메소드
		
		String str5 = str3.concat(str4);
		String str6 = str3 + str4;
		System.out.println(str5);
		System.out.println(str6);
		
		//String.valueof() + concat() ==> +
		String str7 = "안녕" + 3;									//안녕3,			3이 String 형으로 자동 변환
		String str8 = "안녕".concat(String.valueOf(3));			//내부적으로 작동됨
		
		System.out.println(str7);
		System.out.println(str8);
		
		//4. 문자열을 ==> byte[] (getBytes() )
		//	 문자열을 ==> char[] (toChat() )
		
		String str10 = "Hello Java";
		String str11 = "안녕하세요! 반갑습니다.";
		
		//getBytes(); : 문자열을 1글짜씩 잘라서 byte배열에 저장, 아스키 코드값이 출력
		byte[]arr1 = str10.getBytes();
		byte[]arr2 = str11.getBytes();
		
		System.out.println(Arrays.toString(arr1));				//아스키코드 값으로 출력
		System.out.println(Arrays.toString(arr2));					
		
		System.out.println("==========");
		//toCharArray() :
		char[]arr3 = str10.toCharArray();
		char[]arr4 = str11.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		//5. 문자열 수정, 대문자로 출력 : toUpperCase(), 소문자로 변환 : toLowerCase();
		System.out.println(str1.toLowerCase());					//소문자
		System.out.println(str1.toUpperCase());					//대문자
		
		System.out.println("==========");
		//6.문자열 수정 : replace("수정할 원본","수정할 내용");
		//			  substring(시작방번호, 잘라올 방번호);
		String str13 = "안녕 자바 World";
		
		System.out.println(str1.replace("Hello", "안녕"));
		System.out.println(str13.replace("World", "월드"));
		
		//substring (0,5) : 0번 방에서부터 5번 방까지 잘라오기
		System.out.println(str13.substring(0,4));				//0번에서 시작 해서 4번 방 앞까지 짤림
		//	모든 프로그램에서 시작은 포함, 끝은 미포함	
		System.out.println(str13.substring(3,5));				//자바
		
		//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장 
		String[]strArray = "abc/def-ghi jkl".split("/|-| ");
		
		System.out.println(Arrays.toString(strArray));
		
		System.out.println("==========");
		//trim() : 문자열 앞 뒤를 공백을 제거하는 메소드
		
		System.out.println("     abc    ".trim());
		
		System.out.println("==========");
		//6.문자열의 내용 비교 (equals() equalsIgnoreCase() )
			//equals() : Heap의 갑을 비교 대문자 소문자까지 체크
			// equalsIgnoreCase()	: Heap 의 값비교, 대.소문자를 체크하지 않고 비교
		String str20 = new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");
		
		//== : Stack 메모리의참조 주소 비교
		System.out.println(str20==str21);						//false
		System.out.println(str20==str22);						//false
		System.out.println(str21==str22);						//false
		
		System.out.println("==========");
		//equals() : 대소문자를 체크 하면서 Heap의 값비교
		System.out.println(str20.equals(str21));				//true
		System.out.println(str21.equals(str22));				//false
		System.out.println(str21.equalsIgnoreCase(str22));		//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
