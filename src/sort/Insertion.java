package sort;

import java.util.ArrayList;

public class Insertion {
	public static void insertion(ArrayList<Integer> data) {
		for (int i = 1; i < data.size() ; i++) {
			int tmp = data.get(i);
			int index = i;
			while (index > 0 && data.get(index - 1) > tmp) {
				data.set(index, data.get(index - 1));
				index--;
			}
			data.set(index, tmp);
		}
	}
}
