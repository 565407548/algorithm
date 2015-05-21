package sort;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class InsertionTest {

	@Test
	public void testInsertion() {
		ArrayList<Integer> data = new ArrayList<>();
		Random rand = new Random();
		int size = rand.nextInt(20) + 1;
		for (int index = 0; index < size; index++) {
			data.add(index, rand.nextInt(1000));
		}

		for (int index = 0; index < data.size(); index++) {
			System.out.print(data.get(index));
			System.out.print("\t");
		}
		System.out.println();

		Insertion.insertion(data);

		for (int index = 0; index < data.size(); index++) {
			System.out.print(data.get(index));
			System.out.print("\t");
		}
		System.out.println();

		for (int index = 1; index < data.size(); index++) {
			Assert.assertTrue(data.get(index - 1) <= data.get(index));
		}
	}

	@Test
	public void testRecursiveInsertion() {
		ArrayList<Integer> data = new ArrayList<>();
		Random rand = new Random();
		int size = rand.nextInt(20) + 1;
		for (int index = 0; index < size; index++) {
			data.add(index, rand.nextInt(1000));
		}

		for (int index = 0; index < data.size(); index++) {
			System.out.print(data.get(index));
			System.out.print("\t");
		}
		System.out.println();

		Insertion.recursiveInsertion(data);

		for (int index = 0; index < data.size(); index++) {
			System.out.print(data.get(index));
			System.out.print("\t");
		}
		System.out.println();

		for (int index = 1; index < data.size(); index++) {
			Assert.assertTrue(data.get(index - 1) <= data.get(index));
		}
	}

}
