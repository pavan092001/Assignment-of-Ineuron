

public class Question6 {

	public static void main(String[] args) {
		int[] x = {2,4,5,6,7,8,4,30,99,20};
		int[] y = {5,20,99,8};
		System.out.println(isSubSet(x,y));
		
		
		
		

	}
	static boolean isSubSet(int[] x,int[] y) {
		boolean k = false;
		for(int i=0;i<y.length;i++) {
			k = false;
			for(int j =0;j<x.length;j++) {
				if(x[j] == y[i])
					k = true;
			}
			if(!k)
				return false;
		}
		return true;
	}

}
