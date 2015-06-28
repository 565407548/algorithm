package tree;

public class VisitTreePreOrder<T> extends VisitTreeByDepth<T> {

	@Override
	public void visitByRecursive(BTree<T> tree) {
		// TODO Auto-generated method stub
		if (tree != null) {
			if (tree.element != null) {
				System.out.print(tree.element + "\t");
			}
			visitByRecursive(tree.left);
			visitByRecursive(tree.right);
		}
	}

	@Override
	public int getVisitType() {
		// TODO Auto-generated method stub
		return VisitFlagFactory.VISIT_TYPE_PRE_ORDER;
	}

}
