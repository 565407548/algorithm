package heap;

import java.util.ArrayList;

/**
 * 优先队列
 * 
 * @author zcj
 * 
 */
public class MinHeap {
	private ArrayList<Integer> mData;
	private int mHeapSize;
	private int mHeapCapacity;

	public MinHeap(int capacity) {
		mHeapCapacity = capacity;
		mHeapSize = 0;
		mData = new ArrayList<>(mHeapCapacity);
	}

	public MinHeap() {
		mHeapCapacity = 1;
		mHeapSize = 0;
		mData = new ArrayList<>(mHeapCapacity);
	}

	public Integer getMin() {
		if (mHeapSize > 0) {
			return mData.get(0);
		} else {
			return -1;
		}
	}

	public Integer remove() {
		if (mHeapSize > 0) {
			int tmp = mData.get(0);
			mData.set(0, mData.get(mHeapSize - 1));
			mData.set(mHeapSize - 1, -1);
			--mHeapSize;
			filterDown(0);

			return tmp;
		} else
			return -1;
	}

	public boolean isEmpty() {
		return mHeapSize == 0;
	}

	public void empty() {
		mData.clear();
		mHeapSize = 0;
	}

	public void insert(Integer element) {
		if (mHeapSize == mHeapCapacity) {
			int mNewHeapCapacity = 2 * mHeapCapacity;
			ArrayList<Integer> newData = new ArrayList<>(2 * mHeapCapacity);
			for (int i = 0; i < mHeapSize; i++) {
				newData.add(mData.get(i));
			}
			mData = newData;
			mHeapCapacity = mNewHeapCapacity;
		}

		++mHeapSize;
		mData.add(mHeapSize - 1, element);
		filterUp(mHeapSize - 1);
	}

	private void filterUp(int index) {
		if (index > 0 && index < mHeapSize) {
			int root = (index - 1) / 2;
			if (mData.get(root) > mData.get(index)) {
				swap(mData, root, index);
				index = root;
				filterUp(index);
			}
		}

	}

	private void filterDown(int index) {
		if (index <= (mHeapSize - 1 - 1) / 2) {
			int left = 2 * index + 1;
			int right = 2 * index + 2;
			int min = index;
			if (left < mHeapSize && mData.get(min) > mData.get(left)) {
				min = left;
			}
			if (right < mHeapSize && mData.get(min) > mData.get(right)) {
				min = right;
			}
			if (min != index) {
				swap(mData, min, index);
				filterDown(min);
			}
		}
	}

	private void swap(ArrayList<Integer> data, int i, int j) {
		int tmp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, tmp);
	}

}
