import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DisjointSet<T> {
	private List<Set> mSets;

	public DisjointSet() {
		// TODO Auto-generated constructor stub
		mSets = new ArrayList<Set>();
	}

	public Set<T> newSet(T element) {
		Set<T> set = findSet(element);
		if (set == null) {
			SetPoint<T> setPoint = new SetPoint<T>(element);
			set = new Set<>(setPoint);
			mSets.add(set);
		}
		return set;
	}

	public Set<T> union(T element1, T element2) {
		Set<T> set1 = findSet(element1);
		Set<T> set2 = findSet(element2);

		if (set1 == null) {
			set1 = newSet(element1);
		}

		if (set2 == null) {
			set2 = newSet(element2);
		}

		if (set1 != set2) {
			set1.getTail().setNextPoint(set2.getHead());
			set1.setTail(set2.getTail());

			mSets.remove(set2);
		}

		return set1;
	}

	public Set findSet(T element) {
		for (Set<T> set : mSets) {
			SetPoint<T> curentSetPoint = set.getHead();
			while (curentSetPoint != null) {
				if (curentSetPoint.get().equals(element)) {
					return set;
				}
				curentSetPoint = curentSetPoint.getNextPoint();
			}
		}
		return null;
	}

	public boolean sameSet(T element1, T element2) {
		Set set1 = findSet(element1);
		Set set2 = findSet(element2);
		return (set1 != null && set2 != null && set1.equals(set2));
	}

	public class Set<T> {
		private SetPoint<T> mHead;
		private SetPoint<T> mTail;

		public Set() {
			mHead = null;
			mTail = null;
		}

		public Set(SetPoint<T> setPoint) {
			mHead = setPoint;
			mTail = setPoint;
		}

		public void setHead(SetPoint<T> head) {
			mHead = head;
		}

		public SetPoint<T> getHead() {
			return mHead;
		}

		public void setTail(SetPoint<T> tail) {
			mTail = tail;
		}

		public SetPoint<T> getTail() {
			return mTail;
		}
	}

	public class SetPoint<T> {
		private T mElement = null;
		private SetPoint<T> mNextPoint = null;

		public SetPoint(T element) {
			this(element, null);
		}

		public SetPoint(T element, SetPoint<T> next) {
			mElement = element;
			mNextPoint = next;

		}

		public void set(T element) {
			mElement = element;
		}

		public T get() {
			return mElement;
		}

		public void setNextPoint(SetPoint<T> nextPoint) {
			mNextPoint = nextPoint;
		}

		public SetPoint<T> getNextPoint() {
			return mNextPoint;
		}
	}

	public class ElementCompare<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
}
