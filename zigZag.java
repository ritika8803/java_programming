import java.util.*;
public class zigZag {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
		System.out.print("\nEnter the order of the matrix : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int i, j;
		int[][] mat = new int[m][n];
		System.out.print("\nInput the matrix elements \n");
		for(i = 0; i < m; i++)
			{		
				for(j = 0; j < n; j++)
					mat[i][j] = sc.nextInt();
			}

		for(i = 0; i <= 0; i++)
			{
				for(j = 0; j < n-1; j++)
					{
						row1 = row1 + mat[i][j];
					}
			}
	
		for(j = n - 1; j == n-1; j--)
			{
				for(i = 0; i < m; i++)
					{
						col_n = col_n + mat[j][i];
					}
			}
		
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
					{
						if ((i + j) == (m - 1))
							{		
								diag += mat[i][j];
							}
						if(j == 0 && i == m-1)
							col_n = col_n - mat[i][j];
					}
				}
		sum = diag + row1 + col_n;
		System.out.print("Sum of Zig-Zag pattern is " + sum);
    }
}

