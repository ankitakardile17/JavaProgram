package myproje;

public class TableWhile {

	public static void main(String[] args) {
		int i=5,j=10;
		int table=0;
		int s=1;
		while(i<=j)
		{
			if(i%2==0)
			{
				while(s<=10)
				{
				table=i*s;
				System.out.println(table);
				s++;
				}
				
			}i++;
		}
	}

}
