package basicquiz1;

public class quiz4 {

	public static void main(String[] args) {
		int n = 5;
		
		//숫자찍기 - 층별로 123 (4-1)
		for(int i = 0; i < n; i++) {
			int num = 1;
			for (int j=0; j<=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		//숫자찍기 - 전체층 123 (4-2)
		int k = 1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i;j++)
				System.out.print(k++ + " ");
			System.out.println();
		}
		//숫자찍기 - 층별 같은숫자 (4-3)
		for (int i=1; i<=n; i++) {
			for(int j=0; j<i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
		//숫자찍기 - 층별 54321 (4-4)
		for (int i = n; i>=1; i--) {
			for(int j=n; j>=i; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		//숫자찍기 - 층별 54321 (4-5)
		for (int i=1; i<=n; i++) {
			for (int j=i; j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//숫자찍기 - 모레시계 (4-6)
		for (int i = 1; i<=n; i++) {
			for ( int j = 1; j<i; j++)
				System.out.print(" ");
			for (int a=i; a<=n; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		for (int i = 1; i<n; i++) {
			for(int j =n-1; j>=1; j--) {
				System.out.println(" ");
			}
		
		}
	}

}
