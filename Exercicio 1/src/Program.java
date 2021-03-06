import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		
		// Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13,
		// 62, 30, 12 e 127.
		
		// Imprima no console:
		// a) Sua ordenação crescente.
		// b) Sua ordenação decrescente.
		
		
		
		Integer[] ar = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		// ---------------------------------------------------------------------- //
		
		Integer[] arr = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
	
		

	}

}
