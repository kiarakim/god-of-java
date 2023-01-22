여느 책과 달리 내가 참고한 책 자바의 신은 처음부터 Eclipse 설치방법을 알려주지 않는다. 

자바 코드를 컴파일하고 실행하는 것에 익숙해지기 전에 개발툴을 사용하는 것을 좋지 않다고 생각한다면서. 읽고보니 맞는말이다. 

그런데 난 이미 Ecplise사용법을 알아서 그런지 필자가 만든 자바 코드 실행기로 기본기를 다지기엔 마음이 급하다. 
</br></br>

Ecplise 버전을 보니 19년도 것이라 최신 버전으로 바꾸고 실습해보았다. 오늘 나의 주요 과제는... Eclipse와 Git 연동이었다.

``` java
public class Profile {

	public static void main(String[] args) {
		System.out.println("My name is Kiara");
		System.out.println("My age is 25");
	}
}
```
 
위의 예제처럼 모든 자바 클래스는 main()메소드가 반드시 있어야 한다.
</br>
하나의 메소드는 다음과 같이 여섯 부분으로 나뉜다.

1. 제어자(modifier) : main()메소드가 있는 public static과 같은 메소드의 특성을 정하는 부분

2. 리턴 타입(return type) : 메소드가 끝났을 때 돌려주는 타입

3. 메소드 이름(method name) : 소괄호 앞에 있는 메소드 이름

4. 매개 변수 목록(parameter list) : 소괄호 안에 있는 매개 변수의 목록

5. 예외 목록(exception list) : 메소드의 소괄호가 끝나는 부분과 중괄호가 시작하는 부분 사이에 예외 목록 선언

6. 메소드 내용(method body) : 중괄호 안에 있는 내용들
</br> 

위에 Bold처리한 리턴 타입, 메소드 이름 그리고 메소드 내용은 메소드를 만들 때 반드시 있어야 하는 것들이다. 
</br></br>
### Eclipse와 Git 연동
나도 멋드러지게 캡쳐하고 올리고 싶었지만 이미 설정해놓은 것들을 잃을 순 없어...

아래는 나의 Git연동 일등공신 포스팅.

[깃허브(github) 이클립스(eclipse) 연동](https://velog.io/@hyun-jii/%EA%B9%83%ED%97%88%EB%B8%8Cgithub-%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4eclipse-%EC%97%B0%EB%8F%99)

</br>
그리고 계속 로그인 하라면서 아이디 비번 치면 권한이 없다 그러길래 이것도 구글링하고 해결 완! 2021.08.21일부터 Github에서 ID/Password인증을 없애고 ID/Personal Access Token방식의 인증방식을 요구한다고 한다.

아래는 참고한 포스팅.

[Eclipse | git-receive-pack not permitted on](https://kitty-geno.tistory.com/89)
</br>
그리하여 나는 깃허브에 소스코드 올리는 방법을 '이제야' 알게되었다^^

<img src="https://user-images.githubusercontent.com/101039161/213903958-8834fe66-9298-41ca-b402-862a2a3e4dda.jpeg" height="300px"></img>

아직은 초라한 내 레포지토리
