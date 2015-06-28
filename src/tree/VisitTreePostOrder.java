package tree;

public class VisitTreePostOrder<T> extends VisitTreeByDepth<T> {

	@Override
	public void visitByRecursive(BTree<T> tree) {
		// TODO Auto-generated method stub
		if (tree != null) {
			if (tree.left != null) {
				visitByRecursive(tree.left);
			}
			if (tree.right != null) {
				visitByRecursive(tree.right);
			}
			if (tree.element != null) {
				System.out.print(tree.element + "\t");
			}
		}
	}

	@Override
	public int getVisitType() {
		// TODO Auto-generated method stub
		return VisitFlagFactory.VISIT_TYPE_POST_ORDER;
	}
}
