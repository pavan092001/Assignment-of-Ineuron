

public class Question3 {

	public static void main(String[] args) {
		int[] p = {2,5,1,3,0,99,456,80};
		boolean s = false;
		for(int i =0;i<p.length;i++) {
			s= false;
			for(int j =1;j<p.length-i;j++) {
				if(p[j]<p[j-1]) {
				    int temp = p[j];
					p[j] = p[j-1];
					p[j-1] = temp;
					s = true;
				}
			}
			if(!s)
				break;
		}
		for(int r:p)
			System.out.println(r);

	}

}
