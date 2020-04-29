
import java.util.Scanner;
public class IceCreamStore
{
public static void welcomeUser()
{
System.out.println("******Welcome to Your Choice Ice Cream Store!!******");
System.out.println("Please select the item you want from the Menu!!");
System.out.println("1.Vanialla Ice Cream");
System.out.println("2.ButterScotch Ice Cream");
System.out.println("3.StrawBerry Ice Cream");
System.out.println("4.Choclate Ice Cream");
System.out.println("5.BlackCurrant Ice Cream");
}
public static int getInput()
{
Scanner s = new Scanner(System.in);
int c;
do{
c= s.nextInt();
if(c<1||c>5)
{
System.out.println("Invalid Choice!! Please try again.");
}
else
{
break;
}
}while(true);
return c;
}
public static void printReceipt(int choice,double[] prices,String[] items)
{
System.out.println("Item: "+items[choice-1]+" IceCream");
System.out.println("Price: "+prices[choice-1]+"$");
System.out.println("Thank you.Visit Again!!");
}
   public static void main(String[] args)
   {
   int choice;
   double[] prices={20,30,40,50,50};
   String[] items={"Vanialla","ButterScotch","StrawBerry","Choclate","BlackCurrant"};
       welcomeUser();
       choice=getInput();
       printReceipt(choice,prices,items);
   }
}
