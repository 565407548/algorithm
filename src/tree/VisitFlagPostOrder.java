package tree;

public class VisitFlagPostOrder extends VisitFlag {
	public VisitFlagPostOrder() {
		currentFlag = VisitFlag.FLAG_LEFT;
	}

	@Override
	public void nextFlag() {
		// TODO Auto-generated method stub

		switch (currentFlag) {
		case VisitFlag.FLAG_SELF:
			currentFlag = VisitFlag.FLAG_FINISH;
			break;
		case VisitFlag.FLAG_LEFT:
			currentFlag = VisitFlag.FLAG_RIGHT;
			break;
		case VisitFlag.FLAG_RIGHT:
			currentFlag = VisitFlag.FLAG_SELF;
			break;
		default:
			currentFlag = VisitFlag.FLAG_FINISH;
			break;
		}
	}

}
