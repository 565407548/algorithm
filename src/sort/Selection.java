package sort;

import java.util.ArrayList;

public class Selection {
	public static void selection(ArrayList<Integer> data) {
		int minIndex;
		for (int i = 0; i < data.size(); i++) {
			minIndex = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(minIndex) > data.get(j)) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int min = data.get(minIndex);
				data.set(minIndex, data.get(i));
				data.set(i, min);
			}
		}
	}

	public static void recursiveSelection(ArrayList<Integer> data) {
		for (int i = 0; i < data.size() - 1; i++) {
			recursive(data, i);
		}
	}

	public static void recursive(ArrayList<Integer> data, int index) {
		int minIndex = index;
		for (int i = index + 1; i < data.size(); i++) {
			if (data.get(minIndex) > data.get(i)) {
				minIndex = i;
			}
		}
		if (minIndex != index) {
			int min = data.get(minIndex);
			data.set(minIndex, data.get(index));
			data.set(index, min);
		}
	}
}
