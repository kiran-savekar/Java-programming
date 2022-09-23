import java.util.*;
public class Main {

        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter number of elements");
            int n = input.nextInt();

            if(n>0)
            {
                System.out.println("Enter the elements");

                int[] arr1 = new int[n];
                int[] arr2 = new int[n];

                int temp = 0;
                for(int i=0;i<n;i++)
                {
                    arr1[i]=input.nextInt();
                    temp=arr1[i]+temp;
                    arr2[i]=temp;
                }
                for(int i = 0;i<n;i++)
                {
                    System.out.print(arr2[i]+" ");
                }
            }
            else
            {
                System.out.println("Invalid Range");
            }
        }


}