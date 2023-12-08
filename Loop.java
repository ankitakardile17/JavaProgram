package myproje;

public class Loop {

	public static void main(String[] args) {
		int table=0;
		for(int i=5;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
			if(i%2==0)
			{
				 table=i*j;
			
				 System.out.print(table+"\t");
				 
			}
			}System.out.println("\n");
		}
	}

}
