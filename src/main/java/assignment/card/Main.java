package assignment.card;
import java.util.*;
public class Main 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Holder Name:");
        String cardname = sc.nextLine();
        System.out.println("Enter Card Number:");
        Long cardnum = sc.nextLong();
        System.out.println("Enter Expire Date:");
        String exdate = sc.next();
        
        TestCard tc = new TestCard(cardname,cardnum,exdate);
        TestCard tc1 =  tc.clo();
        
        Long valnum = 97889122l;
        System.out.println(tc1.test(valnum));
        boolean x = tc1.test(valnum);
        if(x==true)
        {
        	System.out.println("Card Name: "+cardname + "\n" + "Card number: "+cardnum +"\n" +"Expiry Date: "+exdate);
        }
        else
        {
            System.out.println("invalid");
        }
    }


}
