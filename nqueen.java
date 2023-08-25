import java.util.Scanner;

class Queen {
	int a[][] = new int[10][10];
	int n, i,c,f,m;
	Queen()
	{
	    m=1;
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n:");
		n = s.nextInt();
	}

	int condition(int i, int j, int n) {
		int k, l;
		for (int z = 0; ++c>0&&z <= i - 1; z++) {
			if (a[z][j] == 1)
				return 0;
		}

		for (k = i - 1, l = j - 1; ++c>0&&k >= 0 && l >= 0; k = k - 1, l = l - 1) {
			if (a[k][l] == 1)
				return 0;
		}

		for (k = i - 1, l = j + 1;++c>0&& k >= 0 && l <= n; k = k - 1, l = l + 1) {
			if (a[k][l] == 1)
				return 0;
		}

		return 1;
	}

	void logic() {
		if (i == n && n!=1) {
			System.out.println("the possible solution:"+m);
			m++;
			print();
			f=1;
		}
        int v=0;
		for (int j = 0; j < n; j++) {
			if (condition(i, j, n) == 1) {
				a[i][j] = 1;
				v=j;
				i = i + 1;
				logic();
				
				i = i - 1;
				a[i][v] = 0;

			}

		}

	}

	void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
			{
			    if(a[i][j]==1)
			            System.out.print(" "+"Q");
			    else
			          System.out.print(" "+"-");
			}
			
			System.out.println();
		}
		System.out.println();

	}
}

class Main {
	public static void main(String args[]) {
		Queen q = new Queen();
		q.input();
		q.logic();
		if (q.f==0)
			System.out.println("no");
	
	}
}
