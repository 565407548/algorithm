package heap;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class MinHeapTest {

	@Test
	public void test() {
		MinHeap minHeap = new MinHeap();
		Random random = new Random();
		int min;
		// same data
		minHeap.empty();
		for (int i = 0; i < 10; i++) {
			minHeap.insert(0);
		}
		min = minHeap.getMin();
		while (!minHeap.isEmpty()) {
			int current = minHeap.remove();
			Assert.assertTrue(min <= current);
			min = current;
		}

		// in order
		minHeap.empty();
		for (int i = 0; i < 10; i++) {
			minHeap.insert(i);
		}
		min = minHeap.getMin();
		while (!minHeap.isEmpty()) {
			int current = minHeap.remove();
			Assert.assertTrue(min <= current);
			min = current;
		}

		// reverse order
		minHeap.empty();
		for (int i = 0; i < 10; i++) {
			minHeap.insert(10 - i);
		}
		min = minHeap.getMin();
		while (!minHeap.isEmpty()) {
			int current = minHeap.remove();
			Assert.assertTrue(min <= current);
			min = current;
		}

		// random order
		minHeap.empty();
		System.out.println("random order");
		for (int i = 0; i < 10; i++) {
			minHeap.insert(random.nextInt(1000));
		}
		min = minHeap.getMin();
		while (!minHeap.isEmpty()) {
			System.out.print(min + "\t");
			int current = minHeap.remove();
			Assert.assertTrue(min <= current);
			min = current;
		}
		System.out.println();

		// random order
		minHeap.empty();
		System.out.println("random order");
		for (int i = 0; i < 10; i++) {
			minHeap.insert(random.nextInt(1000));
		}
		for (int i = 0; i < 12; i++) {
			minHeap.remove();
		}
		for (int i = 0; i < 20; i++) {
			minHeap.insert(random.nextInt(1000));
		}
		for (int i = 0; i < 5; i++) {
			minHeap.remove();
		}
		min = minHeap.getMin();
		while (!minHeap.isEmpty()) {
			System.out.print(min + "\t");
			int current = minHeap.remove();
			Assert.assertTrue(min <= current);
			min = current;
		}
		System.out.println();

		/**
		 * 
		 */
		System.out.print("the max 10 data:");
		minHeap.empty();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			data.add(i + 1);
		}
		for (int i = 0; i < 100; i++) {
			int i1 = random.nextInt(1000);
			int i2 = random.nextInt(1000);
			int tmp = data.get(i1);
			data.set(i1, data.get(i2));
			data.set(i2, tmp);
		}
		int index = 0;
		for (; index < 10; index++) {
			minHeap.insert(data.get(index));
		}
		for (; index < 1000; index++) {
			min = minHeap.getMin();
			if (min < data.get(index)) {
				minHeap.remove();
				minHeap.insert(data.get(index));
			}
		}
		while (!minHeap.isEmpty()) {
			int elem = minHeap.remove();
			System.out.print(elem + "\t");
			Assert.assertTrue(elem > 990);
		}

	}

}
