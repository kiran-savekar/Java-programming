import java.util.*;
public class Main {

        public static void main(String args[])
        {
            Scanner input1=new Scanner(System.in);
            int no1 = input1.nextInt();
            Scanner input2=new Scanner(System.in);
            int no2 = input2.nextInt();
            Scanner input3=new Scanner(System.in);
            int no3 = input3.nextInt();
            Scanner input4=new Scanner(System.in);
            int no4 = input4.nextInt();

            char ascii1 = (char) no1;
            char ascii2 = (char) no2;
            char ascii3 = (char) no3;
            char ascii4 = (char) no4;
            System.out.println( no1 + " - " + ascii1);
            System.out.println( no2 + " - " + ascii2);
            System.out.println( no3 + " - " + ascii3);
            System.out.println( no4 + " - " + ascii4);

        }


}