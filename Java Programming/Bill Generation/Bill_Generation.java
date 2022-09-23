import java.util.*;
public class Main
{
    public static void main (String[] args) {
        int  pi,pu,co,total;
        System.out.println("Enter the no of pizzas bought:");
        Scanner input1=new Scanner(System.in);
        pi= input1.nextInt();
        System.out.println("Enter the no of puffs bought:");
        Scanner input2=new Scanner(System.in);
        pu= input2.nextInt();
        System.out.println("Enter the no of cold drinks bought:");
        Scanner input3=new Scanner(System.in);
        co= input3.nextInt();
        total=(pi*100)+(pu*20)+(co*10);
        System.out.println("-------- Bill Details -----------");
        System.out.println("No of pizzas:- "+pi);
        System.out.println("No of puffs:- "+pu);
        System.out.println("No of cold drinks:- "+co);
        System.out.println("Total price is :- "+total);
        System.out.println("-------- Thank you! Enjoy the show -----------");
    }
}