
public class Main {

	
	

	
	static void swapPrimitive(int a, int b){
		int K = a;
		a = b;
		b = K;
		System.out.println("inner Swap     a : " + a + " b : " + b);
	}
	static void swapfinalClass(Integer A, Integer B){
		Integer T = A;
		A = B;
		B = T;
		System.out.println("inner Swap     a : " + A + " b : " + B);
	}
	static void swapDatainClass(Integer A, Integer B){
		A = 5;
		B = 2;
	}
	static void dataOverWritemethod(Data D1, Data D2){
		int value = D1.getValue();
		D1.setValue(D2.getValue());
		D2.setValue(value);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5;
		swapPrimitive(a, b);
		System.out.println("Swap Result    a : " + a + " b : " + b + "\n");
		
		Integer A = new Integer(2);
		Integer B = new Integer(5);
		
		swapfinalClass(A, B);
		System.out.println("inner Swap     a : " + A + " b : " + B + "\n");
		
		swapDatainClass(A, B);
		System.out.println("Data innerData A : " + A + " B : " + B + "\n");
		
		Data D1 = new Data(2);
		Data D2 = new Data(5);
		
		dataOverWritemethod(D1, D2);
		System.out.println("Data overwrite A : " + D1.value + " B : " + D2.value + "\n");
	}
}
