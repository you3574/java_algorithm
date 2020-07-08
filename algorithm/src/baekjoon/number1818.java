package baekjoon;

import java.util.*;

public class number1818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int num = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		ArrayList<Integer> result = new ArrayList<>(list);
		Collections.sort(result);

		for (int i = 0; i < n; i++) {
			if (list.equals(result)) {
				System.out.println(num);
				break;
			} else if (list.get(i) == result.get(i)) {
				continue;
			} else {
				//System.out.println("i:"+i);
				min = list.get(i);
				//System.out.println("min: " + min);
				for (int j = i + 1; j < n; j++) {
					if (min > list.get(j)) {
						min = list.get(j);
						list.add(i, min);
						list.remove(j+1);
						num++;
					}else
						continue;
				}

			}

		}
	}
}
