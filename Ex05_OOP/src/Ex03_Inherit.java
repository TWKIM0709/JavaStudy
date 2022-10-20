/*
	두개의 설계도
*/

class Tv{
	boolean power;
	int ch;
	
	void power() {	//포블링		// 두개의 기능을 하나의 함수로 처리
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr{	// 비디오플레이어
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {
		
	}
	void ff() {
		
	}
}

// Tv  설계도
// Vcr 설계도

// TvVcr 제품 만들고 싶음
// 계층적 상속 >> 자원의 이름이 동일해 하나는 사용 불가
// 1. 내부에 객체로 생성
class TvVcr{
	Tv t;
	Vcr v;
	public TvVcr() {
		this.t = new Tv();
		this.v = new Vcr();
	}
}

//2. 하나는 상속, 하나는 포함
//	 [메인기능을 가지고 있는 && 비중이 높은] Class를 상속 
class TvVcr2 extends Tv{
	Vcr vcr;
	public TvVcr2(){
		this.vcr = new Vcr();
	}
}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr tvvcr = new TvVcr();
		tvvcr.t.power();
		tvvcr.v.power();
		System.out.println(tvvcr.t.power);
		System.out.println(tvvcr.v.power);
		
		///////////////////////////////////////////////
		
		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("TV전원 : " + tv2.power);
		tv2.chUp();
		
		tv2.vcr.power();
		System.out.println("비디오 전원 : " + tv2.vcr.power);
		tv2.vcr.play();
	}

}
