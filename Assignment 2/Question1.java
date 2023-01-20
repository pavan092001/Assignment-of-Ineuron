

public class Question1 {

	public static void main(String[] args) {
		// FIND DUPLICATE IN ARRAY
		
		int[] k = {1,2,3,7,1,2,5,6,89,98,45,7,12,211,3,2,78};
		
		for(int i =0;i<k.length;i++) {
			int end = k.length-i;
			int max = getMax(end,k);
			swap(max,end-1,k);
		}
		
		for(int c :k) {
			System.out.println(c);
		}
		System.out.println("The dupliccate element is ");
		
		for(int i =0;i<k.length-1;i++) {
			if(k[i] == k[i+1])
				System.out.println(k[i]);
			}

		}
	
	
	static int getMax(int end,int[] p) {
		int max =0;
		for(int i =0;i<end;i++) {
			if(p[max]<p[i])
				max = i;
		}
		return max;
		
	}
	static void swap(int start,int end,int[] p) {
		int temp = p[start];
		p[start]=p[end];
		p[end] =temp;
	}



}
