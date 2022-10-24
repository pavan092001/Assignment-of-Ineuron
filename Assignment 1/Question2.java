package Basic;

public class Question2 {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int j=1;
		while(i<n) {
			j =1;
			while(j<n) {
				System.out.print(i+" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
