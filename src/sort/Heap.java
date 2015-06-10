package sort;

import java.util.ArrayList;

public class Heap {
	public static void heap(ArrayList<Integer> data) {
		heapInit(data, data.size() - 1);
		for (int i = data.size() - 1; i > 0; i--) {
			swap(data, 0, i);
			// heapAdjust(data, 0, i - 1);
			recursiveHeapAdjust(data, 0, i - 1);
		}
	}

	public static void heapAdjust(ArrayList<Integer> data, int start, int end) {
		int root = start;

		while (root <= (end - 1) / 2) {
			int max = root;
			int left = root * 2 + 1;
			int right = root * 2 + 2;
			if (left <= end && data.get(max) < data.get(left)) {
				max = left;
			}
			if (right <= end && data.get(max) < data.get(right)) {
				max = right;
			}
			if (max != root) {
				swap(data, max, root);
				root = max;
			} else {
				break;
			}
		}

	}

	public static void recursiveHeapAdjust(ArrayList<Integer> data, int start,
			int end) {
		int root = start;

		int max = root;
		int left = root * 2 + 1;
		int right = root * 2 + 2;
		if (left <= end && data.get(max) < data.get(left)) {
			max = left;
		}
		if (right <= end && data.get(max) < data.get(right)) {
			max = right;
		}
		if (max != root) {
			swap(data, max, root);
			recursiveHeapAdjust(data, max, end);
		}
	}

	public static void heapInit(ArrayList<Integer> data, int end) {
		for (int i = (end - 1) / 2; i >= 0; i--) {
			// heapAdjust(data, i, end);
			recursiveHeapAdjust(data, i, end);
		}
	}

	private static void swap(ArrayList<Integer> data, int i, int j) {
		int tmp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, tmp);
	}
}
