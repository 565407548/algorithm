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
}
