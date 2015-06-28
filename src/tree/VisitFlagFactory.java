package tree;

public class VisitFlagFactory {
	public final static int VISIT_TYPE_NONE = -1;
	public final static int VISIT_TYPE_PRE_ORDER = 0;
	public final static int VISIT_TYPE_IN_ORDER = 1;
	public final static int VISIT_TYPE_POST_ORDER = 2;

	public VisitFlag createVisitFlag(int flag) {
		switch (flag) {
		case VISIT_TYPE_PRE_ORDER:
			return new VisitFlagPreOrder();
		case VISIT_TYPE_IN_ORDER:
			return new VisitFlagInOrder();
		case VISIT_TYPE_POST_ORDER:
			return new VisitFlagPostOrder();
		default:
			return null;

		}
	}
}
