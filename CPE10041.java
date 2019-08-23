import java.util.*;
public class CPE10041
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int times=in.nextInt();
		for(int i=0;i<times;i++)
		{
			int mem=in.nextInt();
			int data[]=new int [mem];
			for(int j=0;j<mem;j++)
			{
			data[j]=in.nextInt();
			}
			Arrays.sort(data);
			long sum=0;
			for(int j=0;j<mem;j++)
			{
				sum+=Math.abs(data[mem/2]-data[j]);
			}
			System.out.println(sum);
		}
	}
}