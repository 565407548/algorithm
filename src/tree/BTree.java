package tree;

public class BTree<T> {
	public T element;
	public BTree<T> left;
	public BTree<T> right;

	public BTree(T elem) {
		element = elem;
		left = null;
		right = null;
	}
}
