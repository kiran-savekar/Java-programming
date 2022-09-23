import java.util.*;
public class Main {

        public static void main(String args[])
        {
            Scanner input1= new Scanner(System.in);
            int no=input1.nextInt();
            System.out.println("Factors of a no. " + no + " are:- " );
            if(no<=0){
                System.out.println("Invalid number");
            }

            else {
                for(int i=1;i<=no;i++){
                    if(no%i==0){
                        System.out.println(i);
                    }
                }
            }
        }


}