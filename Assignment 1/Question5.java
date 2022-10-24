package Basic;

public class Question5 {

	public static void main(String[] args) {
		int n = 14;
		int mid = n/2;
		 for(int i =0;i<n;i++) {
			 
			 for(int j =0;j<n;j++) {
				 
				 if(i == 0 || i == n-1 ||i+j<=mid || i-j>=mid)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	}

}
