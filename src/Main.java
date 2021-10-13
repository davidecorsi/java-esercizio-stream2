import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Ordinate questo array di numeri e moltiplicateli per 2. Eliminate anche i doppioni. Tornate un nuovo
 * array.
 */
public class Main {
	public static void main(String[] args) {
		int[] intArray = {3, 6, 9, 5, 2, 6, 8, 9, 11, 15, 1};
		IntStream intStream = Arrays.stream(intArray);
		int[] intArray1 = intStream.distinct()
				.sorted()
				.map(i -> i * 2)
				.toArray();
		System.out.println(Arrays.toString(intArray1));
	}
}
