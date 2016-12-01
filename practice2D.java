public class practice2D
{
	public static void main(String[] args)
	{
		int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		print2D(grid);
		
		int[][] spreadSheet = new int[5][7];
		print2D(spreadSheet);
		
		String[][] myWords = new String[4][3];
		print2D(myWords);
		
		print2D(generate2D());
		print2D(generate2D(3));
		
		print2DWithLines(generate2D());
	}
	
	
	/**
	* This method prints out a 2D array of ints as a table with grid lines separating the
	* numbers
	* @param a The 2D array of ints that the method prints out
	*/
	
	public static void print2DWithLines(int[][] a)
	{
		for (int row = 0; row < a.length; row++)
		{
			System.out.println("------------");
			for (int col = 0; col < a[row].length; col++)
			{
				System.out.print("|" + a[row][col]);
				if (a[row][col] < 10)
					System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("------------");
	}
	
	
	/**
	* This method prints a 2D array of ints as a square without the grid lines
	* @param a The 2D array of ints that the method prints out
	*/
	
	public static void print2D(int[][] a)
	{
		for (int row = 0; row < a.length; row++)
		{
			for (int col = 0; col < a[row].length; col++)
				System.out.print(a[row][col] + " ");
		System.out.println();
		}
	}
	
	
	/**
	* This method prints out a 2D array of Strings in a square without the grid lines
	* @param a The 2D array of Strings that the method prints out
	*/
	
	public static void print2D(String[][] a)
	{
		for (int row = 0; row < a.length; row++)
		{
			for (int col = 0; col < a[row].length; col++)
				System.out.print(a[row][col] + " ");
		System.out.println();
		}
	}
	
	
	/**
	* This method first made a square 2D array of ints with a number predetermined in the
	* method, but it is mutable. Now, the method calls another with the predetermined
	* number that is also mutable
	* @return grid The 2D array of ints that the method makes
	*/
	
	public static int[][] generate2D()
	{
		/*int[][] grid = new int[4][4];
		int counter = 1;
		for (int row = 0; row < 4; row++)
		{
			for (int col = 0; col < 4; col++)
			{
				grid[row][col] = counter;
				counter++;
			}
		}
		return grid;
		*/
		int[][] grid = generate2D(4);
		return grid;
	}
	
	/**
	* This method makes a 2D array of ints in a square with the number of rows put in
	* @param row The number of rows that the square 2D array of ints should have
	* @return grid The 2D array of ints in the square
	*/
	
	public static int[][] generate2D(int row)
	{
		int[][] grid = new int[row][row];
		int counter = 1;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < row; j++)
			{
				grid[i][j] = counter;
				counter ++;
			}
		}
		return grid;
	}
}