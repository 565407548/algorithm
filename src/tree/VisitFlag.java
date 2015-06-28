package tree;

public abstract class VisitFlag {
	protected final static int FLAG_INVALID = -1;
	protected final static int FLAG_SELF = 0;
	protected final static int FLAG_LEFT = 1;
	protected final static int FLAG_RIGHT = 2;
	protected final static int FLAG_FINISH = 3;

	protected int currentFlag = FLAG_INVALID;

	public abstract void nextFlag();

	public boolean self() {
		return currentFlag == FLAG_SELF;
	}

	public boolean left() {
		return currentFlag == FLAG_LEFT;
	}

	public boolean right() {
		return currentFlag == FLAG_RIGHT;
	}

	public boolean finish() {
		return currentFlag == FLAG_FINISH;
	}
}
