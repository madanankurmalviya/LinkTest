package StarPatterns;

public class TrangleFiveAdd {
	static int rows=5;

	public static void main(String[] args) 
	{
		for (int i = 1; i <= rows; i++)
        {
            int temp = i;
            for (int j = i; j >= 1; j--)
            {
                System.out.print(temp + " ");
                temp = temp + rows;
            }
            System.out.println();
        }

	}

}
