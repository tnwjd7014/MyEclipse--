package basicquiz1;

public class quiz3 {

	public static void main(String[] args) {
		//별찍기 - 사각 (3-1)
		int n = 5;
		for (int i =0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//별찍기 - 직삼각형 (3-2)
		for (int i =0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//별찍기 - 역 직삼각형 (3-3)
		for (int i =0; i<n; i++) {
			for (int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//별찍기 - 오른쪽 직삼각형 (3-4)
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--)
				System.out.print(" ");
			for(int k=1; k<=i; k++) {
				System.out.print("*");		
			}
			System.out.println();
		}
		//별찍기 - 오른쪽 역 직삼각형 (3-5)
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int k=n; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
			//또는
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//별찍기 - 정삼각형(홀수) (3-6)
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--)
				System.out.print(" ");
			for(int k=0; k<=(i*2); k++)
				System.out.print("*");
			System.out.println();
		}
			//또는
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			for(int k=1; k<=(i*2)-1; k++)
				System.out.print("*");
			System.out.println();
		}
		//별찍기 - 왼쪽 세로삼각형 (3-7)
		for (int i = 0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i<n-1; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//별찍기 - 오른쪽 세로삼각형 (3-8)
		for(int i = 0; i < n; i++) {
			for(int j=n-1; j>i; j--)
				System.out.print(" ");
			for(int k=0; k<=i; k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j=0; j<i+1; j++)
				System.out.print(" ");
			for(int k=n-1; k>i; k--)
				System.out.print("*");
			System.out.println();
		}
		//별찍기 - 마름모 (3-9)
		int space = n-1;
		for(int j=1; j<=n; j++) {
			for(int i=1; i <= space; i++)
				System.out.print(" ");
			space--;
			for(int i=1; i<=(j*2)-1; i++)
				System.out.print("*");
			System.out.println("");
		}
		space = 1;
		for(int j=1; j<=n-1; j++) {
			for(int i=1; i <= space; i++)
				System.out.print(" ");
			space++;
			for(int i=1; i<=2 * (n - j) -1; i++)
				System.out.print("*");
			System.out.println("");
		}
		//별찍기 - 정삼각형 (3-10)
		for (int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		//별찍기 - 역 정삼각형 (3-11)
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int k = n; k>i; k--)
				//또는 for(int k = 0; k <= n-1-i; k++)
				System.out.print("* ");
			System.out.println();
		}
		//별찍기 - 모레시계 (3-12)
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int k = n; k>i; k--)
				System.out.print("* ");
			System.out.println();
		}
		for (int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		//별찍기 - 빈 정삼각형 (3-13)
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--)
				System.out.print(" ");
			for (int k=0; k<=(i*2); k++) {
				if(k==0 || k==i*2 || i==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			//또는
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++)
				System.out.print(" ");
			for (int k=1; k<=(2*i-1); k++) {
				if(k==1 || i==n || k==(2*i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//별찍기 - 빈 역삼각형 (3-14)
		for(int i=n; i >= 1; i--) {
			for(int j=i; j<n; j++)
				System.out.print(" ");
			for(int k=1; k<=(2*i-1); k++){
				if (k==1 || i==n || k==(2*i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//별찍기 - 빈 마름모 (3-15)
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--)
				System.out.print(" ");
			System.out.print("*");
			for (int k = 1; k < 2*(i-1); k++)
				System.out.print(" ");
			if (i == 1)
				System.out.print("");
			else
				System.out.println("*");
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = n; j > i; j--)
				System.out.print(" ");
			System.out.print("*");
			for (int k = 1; k < 2*(i-1); k++)
				System.out.print(" ");
			if (i == 1)
				System.out.print("");
			else
				System.out.println("*");
		}
	}

	}
