package ebay2020;

import java.util.*;

public class number2 {

	public static int solution(int num, int[] cards) {
		int answer = 0;
		int turn = 0;

		// Ƚ�� �ִ� list
		ArrayList<Integer> list = new ArrayList<>();

		while (turn<cards.length) {
			int copyNum = num; //8
			int count = 0;

			// �迭�� ���ʴ�� ��������
			for (int i = turn; 0 <=i; i--) {

				// num���� cards[i]�� ������ ��
				// ������ ���� �϶�
				//1,4,6
				if (copyNum % cards[i] == 0) {
					int result = copyNum / cards[i]; //2
					count += result; //3
					list.add(count); //2 ,8 3
					break;
				}
				// ������ ���� 0�� �ƴ� ��
				else {
					//copyNum�� ������ ���� �ְ� �� ���� �������� �� ��������.
					int result=copyNum/cards[i]; //1
					count+=result; //1
					copyNum = copyNum % cards[i]; //2
				}
				
			}
			turn++;
		}

		Collections.sort(list);
		answer=list.get(0);
		
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = { 1, 4, 6 };
		int[] cards2= {1,2,5};
		System.out.println(solution(8, cards));
		//System.out.println(solution(18,cards2));
	}

}
