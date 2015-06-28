package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class VisitTreeByBreadth<T> extends BTreeVisit<T> {

	@Override
	public void visit(BTree<T> tree) {
		// TODO Auto-generated method stub
		Queue<BTree<T>> queue = new LinkedList<>();
		if (tree != null) {
			queue.offer(tree);
		}
		while (!queue.isEmpty()) {
			BTree<T> node = queue.poll();
			if (node.element != null) {
				System.out.print(node.element + "\t");
			}
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}

	@Override
	public void visitByRecursive(BTree<T> tree) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getVisitType() {
		// TODO Auto-generated method stub
		return VisitFlagFactory.VISIT_TYPE_NONE;
	}

}
