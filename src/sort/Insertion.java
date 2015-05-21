package sort;

import java.util.ArrayList;

public class Insertion {
	public static void insertion(ArrayList<Integer> data) {
		for (int i = 1; i < data.size(); i++) {
			int tmp = data.get(i);
			int index = i;
			while (index > 0 && data.get(index - 1) > tmp) {
				data.set(index, data.get(index - 1));
				index--;
			}
			data.set(index, tmp);
		}
	}

	public static void recursiveInsertion(ArrayList<Integer> data) {
		for (int i = 1; i < data.size(); i++) {
			recursive(data, i);
		}
	}

	public static void recursive(ArrayList<Integer> data, int index) {
		int i = index;
		int element = data.get(index);
		while (i > 0 && data.get(i - 1) > element) {
			data.set(i, data.get(i - 1));
			i--;
		}
		data.set(i, element);
	}
}
