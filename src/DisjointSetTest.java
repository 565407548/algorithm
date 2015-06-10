import static org.junit.Assert.*;

import org.junit.Test;

public class DisjointSetTest {

	@Test
	public void test() {
		DisjointSet<String> disjointSet = new DisjointSet<>();
		disjointSet.newSet("a");
		disjointSet.newSet("b");
		disjointSet.newSet("d");
		disjointSet.newSet("e");
		disjointSet.newSet("g");
		disjointSet.newSet("i");
		disjointSet.newSet("j");

		disjointSet.union("a", "b");
		disjointSet.union("a", "c");
		disjointSet.union("b", "c");
		disjointSet.union("b", "d");
		disjointSet.union("e", "f");
		disjointSet.union("e", "g");
		disjointSet.union("h", "i");

		assertTrue(disjointSet.sameSet("a", "d") == true);
		assertTrue(disjointSet.sameSet("a", "g") == false);
		assertTrue(disjointSet.sameSet("e", "j") == false);
		assertTrue(disjointSet.sameSet("e", "f") == true);
		assertTrue(disjointSet.sameSet("h", "i") == true);
		assertTrue(disjointSet.sameSet("i", "j") == false);
	}
}
