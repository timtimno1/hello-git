import java.util.Scanner;
public class uva11743
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		in.nextLine();//°²§ì\n\
		for(int z=0;z<count;z++)
		{
			int data[]=new int[16];
			int even_sum=0;
			int odd_sum=0;
			String line=in.nextLine();
			String split_line[]=line.split(" ");
			Conversion(data,split_line);
			for(int i=0;i<=14;i+=2)
			{
				odd_sum+=data[i+1];
				int doube_data=2*data[i];
				if(doube_data>=10)
				{
					for(int j=0;j<2;j++)
					{
						even_sum+=doube_data%10;
						doube_data/=10;
					}
				}
				else
				{
					even_sum+=doube_data;
				}
			}
			if((even_sum+odd_sum)%10==0)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
	static void Conversion(int data[] ,String... a)
	{
		for(int i=0;i<4;i++)
		{
			int toint=Integer.parseInt(a[i]);
			for(int j=0;j<4;j++)
			{
				data[(3-j)+(i*4)]=toint%10;
				toint/=10;
			}
		}
	}
}
