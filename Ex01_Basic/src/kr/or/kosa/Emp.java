package kr.or.kosa;
//����� ���� �ϼ���
public class Emp {//class Emp�� ������ Ÿ���̴�.(ū Ÿ��)
	//������//Ÿ��/����

	public int number;
	private int empno; //��ä���� - ĸ��ȭ �����������: �ٸ�Ŭ���������� ��� x ->getter,setter
	
	//getter(read), setter(write) -�Լ�
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		//�����ϱ� ���� ����
		if(empno <0 ) {
			this.empno = 0;
		}else {
			this.empno = empno;
		}
		
	}
	
	 
	public void print() { //void �ȿ� �ִ� ���� �����Ѵ�.
		
		System.out.println("��� ��ȣ: "+empno);
	}

}
