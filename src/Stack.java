import javax.swing.tree.ExpandVetoException;

public class Stack<T> {
	private final static int ENLARGE_THRESHOLD = 2;// mCapacity=2*mCapacity
	private final static int SHRINK_THRESHOLD = 4;// mCapacity==4*mSize
	private final static int INIT_CAPACITY = 4;//

	private int mSize;
	private int mCapacity;
	private Object[] elements;

	public Stack() {
		this(INIT_CAPACITY);
	}

	public Stack(int capacity) {
		mSize = 0;
		mCapacity = capacity <= 0 ? 1 : capacity;
		elements = new Object[mCapacity];
	}

	public void push(T element) {
		enlarge();
		elements[mSize++] = element;
	}

	public T pop() {
		if (!isEmpty()) {
			T elem = (T) elements[mSize - 1];
			elements[mSize - 1] = null;
			mSize--;

			shrink();

			return elem;
		} else {
			return null;
		}
	}

	public T top() {
		if (!isEmpty()) {
			return (T) elements[mSize - 1];
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return mSize == 0;
	}

	private void enlarge() {
		if (mSize == mCapacity) {
			mCapacity = ENLARGE_THRESHOLD * mCapacity;
			Object[] tmp = new Object[mCapacity];
			System.arraycopy(elements, 0, tmp, 0, mSize);
			elements = tmp;
		}
	}

	private void shrink() {
		if (mSize != 0 && SHRINK_THRESHOLD * mSize == mCapacity) {
			mCapacity = (mCapacity + ENLARGE_THRESHOLD - 1) / ENLARGE_THRESHOLD;
			Object[] tmp = new Object[mCapacity];
			System.arraycopy(elements, 0, tmp, 0, mSize);
			elements = tmp;

		}
	}
}
