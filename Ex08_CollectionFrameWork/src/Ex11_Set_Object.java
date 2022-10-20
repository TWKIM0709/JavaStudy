import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	public Myclass() {
	}
	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Myclass [학번=" + id + ", 이름=" + name + "]";
	}
	
}

public class Ex11_Set_Object {

	public static void main(String[] args) {
		HashSet<Myclass> hset = new HashSet<Myclass>();
		
		Myclass mc1 = new Myclass(1,"Abc");
		Myclass mc2 = new Myclass(1,"Def");
		Myclass mc3 = new Myclass(1,"Asdf");
		
		hset.add(mc1);
		hset.add(mc1);
		System.out.println(hset.toString());	//같은 주소값 >> 삽입 한번만 됨

		
		//Myclass 내부 데이터가 같아도 주소값이 달라 add 가능
		Myclass mc4 = new Myclass(1,"Abc");
		hset.add(mc4);
		System.out.println(hset);
		
		for(Myclass m : hset) {
			System.out.println(m);
		}
		
		Iterator<Myclass> itr = hset.iterator();
		while(itr.hasNext()) {
			Myclass mc = itr.next();
			System.out.println(itr.next());
		}
		
		
		//전공자 과제??
	}

}
