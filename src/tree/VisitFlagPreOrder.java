package tree;

public class VisitFlagPreOrder extends VisitFlag {
	public VisitFlagPreOrder() {
		currentFlag = VisitFlag.FLAG_SELF;
	}

	@Override
	public void nextFlag() {
		// TODO Auto-generated method stub

		switch (currentFlag) {
		case VisitFlag.FLAG_SELF:
			currentFlag = VisitFlag.FLAG_LEFT;
			break;
		case VisitFlag.FLAG_LEFT:
			currentFlag = VisitFlag.FLAG_RIGHT;
			break;
		case VisitFlag.FLAG_RIGHT:
			currentFlag = VisitFlag.FLAG_FINISH;
			break;
		default:
			currentFlag = VisitFlag.FLAG_FINISH;
			break;
		}
	}
}
