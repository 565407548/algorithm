package sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;


public class BubbleTest {

	@Test
	public void testBubble() {
		ArrayList<Integer> data;
		Random random = new Random();
		int size = 10;
		int max = 1000;

		/*
		 * none data
		 */
		data = new ArrayList<>();
		sort.Bubble.bubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
		/*
		 * only one data
		 */
		data = new ArrayList<>();
		data.add(random.nextInt(max));
		sort.Bubble.bubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * in order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(i);

		}
		sort.Bubble.bubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * inverse order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(size - i);

		}
		sort.Bubble.bubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * random order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(random.nextInt(max));
		}

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		sort.Bubble.bubble(data);

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
	}

	@Test
	public void testImprovedBubble() {
		ArrayList<Integer> data;
		Random random = new Random();
		int size = 10;
		int max = 1000;

		/*
		 * none data
		 */
		data = new ArrayList<>();
		sort.Bubble.improvedBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
		/*
		 * only one data
		 */
		data = new ArrayList<>();
		data.add(random.nextInt(max));
		sort.Bubble.improvedBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * in order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(i);

		}
		sort.Bubble.improvedBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * inverse order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(size - i);

		}
		sort.Bubble.improvedBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * random order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(random.nextInt(max));
		}

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		sort.Bubble.improvedBubble(data);

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
	}
	
	@Test
	public void testRecursiveBubble() {
		ArrayList<Integer> data;
		Random random = new Random();
		int size = 10;
		int max = 1000;

		/*
		 * none data
		 */
		data = new ArrayList<>();
		sort.Bubble.recursiveBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
		/*
		 * only one data
		 */
		data = new ArrayList<>();
		data.add(random.nextInt(max));
		sort.Bubble.recursiveBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * in order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(i);

		}
		sort.Bubble.recursiveBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * inverse order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(size - i);

		}
		sort.Bubble.recursiveBubble(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}

		/*
		 * random order
		 */
		data = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			data.add(random.nextInt(max));
		}

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		sort.Bubble.recursiveBubble(data);

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
	}

}
