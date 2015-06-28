package tree;

public abstract class BTreeVisit<T> {
	public abstract void visit(BTree<T> tree);

	public abstract void visitByRecursive(BTree<T> tree);

	public abstract int getVisitType();
}
