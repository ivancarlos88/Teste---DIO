
public class Multiplicar {

	public static void main(String[] args) throws Exception {

		int[] A = { 10, 5, 98, 452 };
		int[] B = { 10, 5, 98, 452 };
		int[] Total = {0,0,0,0};
		if (A.length != B.length) {
			throw new Exception("Array são de tamanhos diferentes");
		} else {
			Total[4] = A[4] * B[4];
			System.out.println(Total[4]);
		}

	}
}
