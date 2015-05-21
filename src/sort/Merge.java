package sort;

import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class Merge {
	public static void merge(ArrayList<Integer> data) {
		mergeDivide(data, 0, data.size() - 1);
	}

	public static void mergeDivide(ArrayList<Integer> data, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeDivide(data, start, mid);
			mergeDivide(data, mid + 1, end);
			mergeCombine(data, start, mid, end);
		}
	}

	public static void mergeCombine(ArrayList<Integer> data, int start,
			int mid, int end) {
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();

		arrayCopy(data, start, left, mid - start + 1);
		arrayCopy(data, mid + 1, right, end - mid);
		left.add(Integer.MAX_VALUE);
		right.add(Integer.MAX_VALUE);

		int leftIndex = 0;
		int rightIndex = 0;
		int index = start;
		for (int i = start; i <= end; i++) {
			if (left.get(leftIndex) < right.get(rightIndex)) {
				data.set(index++, left.get(leftIndex++));
			} else {
				data.set(index++, right.get(rightIndex++));
			}
		}
	}

	private static void arrayCopy(ArrayList<Integer> src, int srcIndex,
			ArrayList<Integer> des, int length) {
		for (int i = 0; i < length; i++) {
			des.add(src.get(srcIndex + i));
		}
	}
}
