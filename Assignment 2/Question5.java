
public class Question5 {
	public static void main(String[] args) {
		int[] p = {8,7,4,6,2,89,23,0,1};
		int n;
		int max =0;
		for(int i =0;i<p.length;i++) {
			n = p.length-i-1;
			max = 0;
			for(int j =0;j<=n;j++) {
				if(p[max]<=p[j])
					max = j;
			}
			int temp = p[n];
			p[n] = p[max];
			p[max] = temp;
		}
		for(int u :p) {
			System.out.println(u);
		}
		
	}
    

}
