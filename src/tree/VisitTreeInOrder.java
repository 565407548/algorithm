package tree;

public class VisitTreeInOrder<T> extends VisitTreeByDepth<T> {

	@Override
	public void visitByRecursive(BTree<T> tree) {
		// TODO Auto-generated method stub
		if (tree.left != null) {
			visitByRecursive(tree.left);
		}
		System.out.print(tree.element + "\t");
		if (tree.right != null) {
			visitByRecursive(tree.right);

		}
	}

	@Override
	public int getVisitType() {
		// TODO Auto-generated method stub
		return VisitFlagFactory.VISIT_TYPE_IN_ORDER;
	}
}
