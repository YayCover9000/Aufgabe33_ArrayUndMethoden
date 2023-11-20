import java.util.Arrays;
public class Aufgabe33_ArrayUndMethoden {
	public static void main(String [] args) {
		int[] array = new int[100];
		
		Ausgeben(array);
		System.out.println();
		array = ArrayFüllen();
		Ausgeben(array);
		Arrays.sort(array);
		System.out.println();
		Ausgeben(array);
		
	}
	public static void Ausgeben(int Array[]) {
		for(int e:Array) {
			System.out.print(e + " ");
		}
	}
	public static int[] ArrayFüllen() {
		int the_array[] = new int [100];
		int count = 1;
		
		// the_array füllen
		for(int i = 0; i < the_array.length; i++) {
//			the_array[i] = count;
//			count++;
			the_array[i] = (int)(Math.random() * 100);
		}
		return(the_array);
	}
}
