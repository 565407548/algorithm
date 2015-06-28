package tree;

import java.util.Stack;

public class VisitTreeByDepth<T> extends BTreeVisit<T> {

	@Override
	public void visit(BTree<T> tree) {
		// TODO Auto-generated method stub
		VisitFlagFactory factory = new VisitFlagFactory();

		Stack<BTree<T>> elementStack = new Stack<>();
		Stack<VisitFlag> flagStack = new Stack<>();
		if (tree != null) {
			elementStack.push(tree);
			flagStack.push(factory.createVisitFlag(getVisitType()));
		}
		while (!elementStack.isEmpty()) {
			BTree<T> node = elementStack.peek();
			VisitFlag flag = flagStack.peek();

			if (flag.self()) {
				System.out.print(node.element + "\t");
				flag.nextFlag();
			} else if (flag.left()) {
				flag.nextFlag();

				if (node.left != null) {
					elementStack.push(node.left);
					flagStack.push(factory.createVisitFlag(getVisitType()));
				}
			} else if (flag.right()) {
				flag.nextFlag();

				if (node.right != null) {
					elementStack.push(node.right);
					flagStack.push(factory.createVisitFlag(getVisitType()));
				}
			} else if (flag.finish()) {
				elementStack.pop();
				flagStack.pop();
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
