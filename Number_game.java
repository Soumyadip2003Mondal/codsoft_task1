import java.util.*;
public class Number_game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int wins=0;
        char ch='0';
        do
        {
            int n=10,f=0,num;
            ch='0';
            int r = rand.nextInt((100 - 1) + 1) + 1;
            System.out.println("\nA random number has been generated between 1 and 100");
            while(n>0)
            {
                int x;
                System.out.println("\nYou have "+ n +" guesses");
                do
                {
                    x=0;
                    System.out.println("Enter Your Guess:");
                    num=sc.nextInt();
                    if(num>100 || num<1)
                    {
                        x=1;
                        System.out.println("Invalid Guess");
                    }
                }while(x==1);
                n=n-1;
                if(num==r)
                {   wins++;
                    System.out.println("Your guess is correct");
                    break;
                }
                else if(num>r)
                System.out.println("Your guess is too high");
                else
                System.out.println("Your guess is too low");
            }
            if(n==0)
            System.out.println("\nYour guesses were wrong");
            System.out.println("\nWould You like to play again:(Enter '1' for 'yes' or any other key for no)");
            ch=sc.next().charAt(0);   
        }while(ch=='1');
        System.out.println("\nYour have won "+ wins+" times");
        System.out.println("Thank You for playing the game");
    }
}