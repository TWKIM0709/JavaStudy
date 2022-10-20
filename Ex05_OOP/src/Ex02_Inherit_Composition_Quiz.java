
class Animal{
	boolean alive; 
}

class Mammal extends Animal{	//포유류
	boolean breeding;	// 새끼 임신 여부
}

class Elephant extends Mammal{
	int size;		//크기
	int nosecm;		//코길이
}


class Bird extends Animal{	//조류
	boolean wing;	//날개 유무
}
class Penguin extends Bird{	//펭귄
	int swimspeed;	//수영 스피드
	int groupsize;	//그룹 크기
}

class Fish extends Animal{	//어류
	String livingwater;	//사는 물의 종류
}
class FlyingFish extends Fish{//날치
	int flyingtime;	//비행 시간
}

public class Ex02_Inherit_Composition_Quiz {

	public static void main(String[] args) {
		System.out.println("메인함수");
	}
}
