package sort;

public class Radix {
	public static void radix(int data[], int radix) {
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		int offset = 0;
		int count = 1;
		while (count < max) {
			Counter.counterForRadix(data, offset, radix - 1);
			offset++;
			count = count * radix;
		}
	}

}
