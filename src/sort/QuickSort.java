package sort;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
	public static void quickSort(ArrayList<Integer> data) {
		// recursive(data, 0, data.size() - 1);
		// randomRecursive(data, 0, data.size() - 1);
		advancedRecursive(data, 0, data.size() - 1);
	}

	public static void recursive(ArrayList<Integer> data, int start, int end) {
		if (start < end) {
			int mid = partition(data, start, end);
			recursive(data, start, mid - 1);
			recursive(data, mid + 1, end);
		}
	}

	/**
	 * 选择 end 作为 pivot
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return
	 */
	public static int partition(ArrayList<Integer> data, int start, int end) {
		int pivot = end;
		int i, j;

		i = start;
		j = start;
		while (j < end) {
			if (data.get(j) < data.get(pivot)) {
				swap(data, i, j);
				++i;
			}
			++j;
		}
		if (i < end) {
			swap(data, i, pivot);
		}
		return i;
	}

	public static void randomRecursive(ArrayList<Integer> data, int start,
			int end) {
		if (start < end) {
			int mid = partition(data, start, end);
			randomRecursive(data, start, mid - 1);
			randomRecursive(data, mid + 1, end);
		}
	}

	/**
	 * 随机选择 pivot，swap(pivot,end),即随机选择pivot
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return
	 */
	public static int randomPartition(ArrayList<Integer> data, int start,
			int end) {
		Random random = new Random();
		int pivot = start + random.nextInt(end - start + 1);
		swap(data, pivot, end);

		return partition(data, start, end);
	}

	public static void advancedRecursive(ArrayList<Integer> data, int start,
			int end) {
		if (start < end) {
			int mid = advancedPartition(data, start, end);
			advancedRecursive(data, start, mid - 1);
			advancedRecursive(data, mid + 1, end);
		}
	}

	/**
	 * 避免所有元素相等而導致算法退化，確保從中間分割
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return
	 */
	public static int advancedPartition(ArrayList<Integer> data, int start,
			int end) {
		int pivot = end;
		int i, j, k;

		i = start;
		j = start;
		k = end;
		while (j < end) {
			if (data.get(j) < data.get(pivot)) {
				swap(data, i, j);
				++i;
			} else if (data.get(j) == data.get(pivot)) {
				--k;
				swap(data, k, j);
			}
			++j;
		}
		for (int index = end; index >= k; index--) {
			swap(data, index, i);
			++i;
		}
		// 從中間分割：(i-(end-k+1)) -> (i-1)
		return i - 1 - (end - k) / 2;
	}

	private static void swap(ArrayList<Integer> data, int i, int j) {
		int tmp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, tmp);
	}
}
