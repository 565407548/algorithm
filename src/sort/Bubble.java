package sort;

import java.util.ArrayList;

public class Bubble {
	public static void bubble(ArrayList<Integer> data) {
		int min;
		for (int i = 0; i < data.size(); i++) {
			for (int j = data.size() - 1; j > i; j--) {
				if (data.get(j) < data.get(j - 1)) {
					min = data.get(j);
					data.set(j, data.get(j - 1));
					data.set(j - 1, min);
				}
			}
		}
	}

	public static void improvedBubble(ArrayList<Integer> data) {
		int min;
		boolean flag = false;
		for (int i = 0; i < data.size(); i++) {
			if (flag)
				return;
			flag = true;
			for (int j = data.size() - 1; j > i; j--) {
				if (data.get(j) < data.get(j - 1)) {
					min = data.get(j);
					data.set(j, data.get(j - 1));
					data.set(j - 1, min);
					flag = false;
				}
			}
		}
	}

	public static void recursiveBubble(ArrayList<Integer> data) {
		for (int i = 0; i < data.size(); i++) {
			recursive(data, i);
		}
	}

	public static void recursive(ArrayList<Integer> data, int index) {
		int less;
		for (int i = data.size() - 1; i > index; i--) {
			if (data.get(i) < data.get(i - 1)) {
				less = data.get(i);
				data.set(i, data.get(i - 1));
				data.set(i - 1, less);
			}
		}
	}
}