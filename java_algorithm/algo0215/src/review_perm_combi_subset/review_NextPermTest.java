package review_perm_combi_subset;

public class review_NextPermTest {
	static int[] p;
	static int N =p.length;
	public static void main(String[] args) {

		do {
			
		}while(np(N-1));
		System.out.println();
	}
	
	private static boolean np(int size) {
		int i = size;	
		while(i>0 && p[i-1]>= p[i]) i--;
		if(i==0) return false;
		
		int j=size;
		while(p[i-1]>= p[i]) j--;
		int temp=p[i-1];
		p[i-1]= p[j];
		p[j] = temp;
		
		int k=size;
		while(i<=k) {
			temp = p[i];
			p[i] = p[k];
			p[k] = temp;
			i++;
			k--;
		}
		
		return false;
	}

}
