import java.util.Scanner;

public class JavaArrayWhileLoop_27Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner si = new Scanner(System.in);
		System.out.println("---Array with while Loop----");
		int i=0;
		int[] Arr = {23,54,69,10};
		while(i<4)
		{
			System.out.println(Arr[i]);
			i++;
		}
		System.out.println("-----Array with While Loop and length-----");
		int j=0;
		int[] Arr2 = {32,95,38};
		while(j<Arr2.length)
		{
			System.out.println(Arr2[j]);
			j++;
		}
		System.out.println("------Reverse Order-------");
		int k=2;
		while(k>=0)
		{
			System.out.println(Arr2[k]);
			k--;
		}
		
	}

}
