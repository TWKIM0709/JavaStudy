import java.util.Arrays;

/*
	�迭�� '��ü'�� (Array)
	1. new�� ���� ����
	2. heap �޸𸮿� �ö󰣴� (�����ڿ��̴�)
	3. �����迭(�����迭) : �迭�� �ѹ� �����ϸ�(ũ�Ⱑ ��������) ������ �Ұ����ϴ�.  <<�ݴ�>> Collection(����)
	4. �ڷᱸ��(�˰���) �������� �н�

*/
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// ���� Ÿ���� ���� �������� �����ؼ� �����͸� ó���ϼ���
		int s1;
		int s2;
		int s3;//...
		
		int a1, a2, a3;//...
		
		// �迭
		int[] score = new int[4];
		// >> int Ÿ���� �� 4�� ���� ... heap ���ӵ� ������ >> ���̸�(index(÷��) : [0] [1] [2] [3] >> 0���� �����Ѵ�)
		
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 500;
		score[2] = 700;
		score[3] = 200;
		//score[4] = 500;
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// �迭�� 0���� �����Ѵ� >> �迭�� ũ��� index������ 1 ũ��
		System.out.println(score[3]);
		
		//Array (�迭) ���� ��� (for��)
		for(int i = 0; i<4; i++) {
			System.out.printf("[%d]=[%d] \t", i, score[i]);
		}
		System.out.println();
		
		//�迭�� ũ�� >> [�迭.length]
		for(int i = 0; i < score.length; i++) {
			System.out.printf("[%d]=[%d] \t", i, score[i]);
		}
		System.out.println();
		
		//Tip
		//Arrays.toString(�迭) >> �迭�� String Ÿ������ return >> ��ﶧ�� �������� >> �Ƿ� �ȴ���
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);
		
		//Tip2
		//Array.sort(�迭) >> �迭�� ���� >> ��ﶧ�� �������� >> �Ƿ� �ȴ���
		Arrays.sort(score);
		resultArray = Arrays.toString(score);
		System.out.println(resultArray);
		
		//�迭 ���� 3����
		int[] arr = new int[5]; // �⺻
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,22,33};
		//Tip) javascript : lec cararr = [1,2,3,4,5];
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4);
		
		int[] arr5 = arr4;
		System.out.println(arr4==arr5);
		
		//�迭�� Ÿ���� �⺻8���� + String + Ŭ���� Ojbect
		String[] strarr = new String[] {"��","��","�ٶ�"};
		for(int i = 0; i<strarr.length; i++)System.out.println(strarr[i]);
		
		char[] carr = new char[5];
		float[] farr = new float[5];
		
	}

}



