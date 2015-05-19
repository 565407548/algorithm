package sort.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import sort.Selection;

public class SelectionTest {

	@Test
	public void testSelection() {
		ArrayList<Integer> data;
		Random random = new Random();
		int size = 10;
		int max = 1000;

		/*
		 * none data
		 */
		data = new ArrayList<>();
		sort.Selection.selection(data);
		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
		/*
		 * only one data
		 */
		data = new ArrayList<>();
		data.add(random.nextInt(max));
		sort.Selection.selection(data);
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
		sort.Selection.selection(data);
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
		sort.Selection.selection(data);
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

		sort.Selection.selection(data);

		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "\t");
		}
		System.out.println();

		for (int i = 1; i < data.size(); i++) {
			assertTrue(data.get(i - 1) < data.get(i));
		}
	}

}
