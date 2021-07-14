import java.util.Scanner;
public class Numbergame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the number game");
        System.out.println("In this game we are going to choose a number(0-100) and you have to guess it in stipulated guess");
        Scanner scanner=new Scanner(System.in);
        int random_number=(int)Math.random()*100;
        boolean ans=false;
        for(int i=0;i<10;i++)
        {
            int guess;
            System.out.println("Enter your guess "+(i+1));
            guess=scanner.nextInt();
            if(guess==random_number)
            {
                ans=true;
                break;
            }
            else if(guess>random_number)
            {
                System.out.println("your guess is greater number chosen by us");
            }
            else
            {
                System.out.println("your guess is smaller number chosen by us");
            }
        }
        if(ans)
        {
            System.out.println("Congratulations!....You Win");
        }
        else
        {
            System.out.println("oh ho!..Better luck next time");
        }
    }
}
