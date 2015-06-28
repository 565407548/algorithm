package tree;

import org.junit.Before;
import org.junit.Test;

public class VisitTreeByBreadthTest {
	private BTree<Integer> mRoot;

	@Before
	public void setUp() throws Exception {
		mRoot = new BTree<>(1);
		BTree<Integer> node2 = new BTree<Integer>(2);
		BTree<Integer> node3 = new BTree<Integer>(3);
		BTree<Integer> node4 = new BTree<Integer>(4);
		BTree<Integer> node5 = new BTree<Integer>(5);
		BTree<Integer> node6 = new BTree<Integer>(6);
		BTree<Integer> node7 = new BTree<Integer>(7);
		mRoot.left = node2;
		mRoot.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
	}

	@Test
	public void test() {
		BTreeVisit<Integer> visitTree = new VisitTreeByBreadth<>();
		visitTree.visit(mRoot);
	}

}
