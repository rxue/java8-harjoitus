package ruixue.practice.advanced;

import java.util.Arrays;

public class DemoMaxArraySize {

	static int maxByteArraySize() {
		   int size = Integer.MAX_VALUE;
		   while(--size > 0) try {
		        byte[] b = new byte[size];
		        break;
		   } catch(Throwable t) {
			   System.out.println(size);
		   }   
		   return size;
	}
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(1004535808);
		//System.out.println(maxByteArraySize());
		int free = (int) Runtime.getRuntime().maxMemory();
		System.out.println(free);
		byte[] b = new byte[free*10];
		long before = System.currentTimeMillis();
		Arrays.fill(b, (byte)10);
		System.out.println(b[free-1]);
		System.out.println("Time Elapsed: " + (System.currentTimeMillis() - before));
	}

}
