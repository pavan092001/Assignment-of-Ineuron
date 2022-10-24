package Basic;

public class Question3 {
	public static void main(String[] a) {
		int n = 15;
		int mid = (n-1)/2;
		 for(int i =0;i<n;i++) {
			 for(int j =0;j<n;j++) {
				 if(i ==0||i== n-1 || j ==n-1|| j ==0 ||(i+j<=mid)||(j-i)>=mid && j>=mid)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
			 
		 }
	}

}
