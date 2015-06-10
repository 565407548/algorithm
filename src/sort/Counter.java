package sort;

import java.util.ArrayList;

/**
 * 计数排序
 * 
 * @author zcj
 * 
 */
public class Counter {
	public static void counter(int data[], int largest) {
		int copyData[] = new int[data.length];
		System.arraycopy(data, 0, copyData, 0, data.length);
		int counting[] = new int[largest + 1];

		for (int i = 0; i <= largest; i++) {
			counting[i] = 0;
		}

		for (int i = 0; i < copyData.length; i++) {
			counting[copyData[i]]++;
		}
		for (int i = 1; i <= largest; i++) {
			counting[i] += counting[i - 1];
		}

		for (int i = copyData.length - 1; i >= 0; i--) {
			int value = copyData[i];
			data[counting[value] - 1] = value;
			counting[value]--;
		}
	}


/**
 * 
 * @param data
 * @param offset 位数偏移（第一位=0,第二位=1...）
 * @param largest 位数可以出现的最大数字（10进制最大：9, 二进制最大：1）
 */
	public static void counterForRadix(int data[], int offset, int largest) {
		int radixData[] = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			radixData[i] = (data[i] / (int) Math.pow(largest + 1, offset))
					% (largest + 1);
		}

		int copyData[] = new int[data.length];
		System.arraycopy(data, 0, copyData, 0, data.length);

		int counting[] = new int[largest + 1];

		for (int i = 0; i <= largest; i++) {
			counting[i] = 0;
		}

		for (int i = 0; i < radixData.length; i++) {
			counting[radixData[i]]++;
		}
		for (int i = 1; i <= largest; i++) {
			counting[i] += counting[i - 1];
		}

		for (int i = radixData.length - 1; i >= 0; i--) {
			int value = radixData[i];
			data[counting[value] - 1] = copyData[i];
			counting[value]--;
		}
	}
}
