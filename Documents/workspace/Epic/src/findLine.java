import java.util.ArrayList;


public class findLine {
	public static ArrayList<Integer> res = new ArrayList<Integer>();
	static int i =0;
	public static ArrayList<Integer>findLine1(int[][] A, int j)
	{
		//System.out.println(A.length);
		//System.out.println(A[i][j]);
		if( j == A[0].length-1)
			res.add(i);
		else{
			for( ; i<A.length; i++)
			{
		
				if(j<A[0].length-1&&A[i][j] == 0)
				{
					//System.out.println("inloop");
					//j=j+1;
					findLine1(A,++j);
				}
//				if(j==A[0].length-1&&A[i][j] == 0){
//					
//					findLine1(A,j);
//				}
//					
				else
					{
					 j=0;	
					 continue;
					}
					
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		int[][] A = {{1,1,1},{0,0,0},{0,0,1},{0,0,0}};
		System.out.println(A.length);
		System.out.println(A[0].length);

		System.out.println(findLine1(A,0));
	}
}
