import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack<Integer> stack = new Stack<>();

		assertTrue(stack.isEmpty() == true);
		assertTrue(stack.top() == null);
		assertTrue(stack.pop() == null);

		stack.push(1);
		assertTrue(stack.isEmpty() == false);
		assertTrue(stack.top() == 1);
		assertTrue(stack.pop() == 1);
		assertTrue(stack.top() == null);
		assertTrue(stack.pop() == null);

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 10; i++) {
			assertTrue(stack.pop() == 9 - i);
		}
		assertTrue(stack.pop() == null);
	}

}
