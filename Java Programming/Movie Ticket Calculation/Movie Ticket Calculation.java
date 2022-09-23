import java.util.*;

public class Main {
    public static void main(String[] args) {
        int t,refe;
        double rate,sum,sum1,sum2,sum3;
        String cou = new String(),ref,circle;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        t = s.nextInt();
        if (t<5 && t> 40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }

        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have a coupon code:");
        String co = s.next();
        double cost=0,total=0,no = 0;
        System.out.println("Enter the circle:");
        circle = s.next();
        if (circle.equals("k")) {
            cost = t * 75;
        } else if (circle.equals("q")) {
            total = no * 150;
        } else {
            System.out.println("Invalid Input");
        }
        if (t> 20) {
            sum = ((0.1) * cost);
            sum1 = cost- sum;
            if (cou.equals("y")) {
                sum2 = ((0.2) * cost);
                sum3 = sum1 - sum2;
                if (ref.equals("y")) {
                    refe = t* 150;
                    rate = sum3 + refe;
                } else {
                    rate = sum3;
                }
            } else {
                rate = sum1;
            }
        } else {
            rate = cost;
        }
        System.out.printf("Ticket cost %.2f:",+rate);
    }
}