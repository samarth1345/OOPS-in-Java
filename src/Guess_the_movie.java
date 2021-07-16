import java.util.Scanner;
class checkmovie
{
    private String movie="joker";
    private String guess="_____";
    public boolean checkif(char k)
    {
        int j=movie.indexOf(k);
        if(j==-1)
        {
            return false;
        }
        else
        {
            char[] ch=guess.toCharArray();
            ch[j]=k;
            String new_string = new String(ch);
            guess=new_string;
            return true;
        }
    }
    public boolean end_condition()
    {
        if(movie.equals(guess))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void display()
    {
        System.out.println("Movie name with dashes is "+guess);
    }
}
public class Guess_the_movie
{
    public static void main(String[] args)
    {
        char check;
        Scanner scanner=new Scanner(System.in);
        int i=10;
        checkmovie obj=new checkmovie();
        while(i>0)
        {
            if(!obj.end_condition())
            {
                System.out.println("You have " + i + " guess(s) left");
                obj.display();
                System.out.println("Enter your guess");
                check = scanner.next().charAt(0);
                if (!obj.checkif(check)) {
                    i--;
                }
            }
            else
            {
                System.out.println("Congratulations you guessed it right!!!!!");
                break;
            }
        }
        if(i==0)
        {
            System.out.println("better luck next time!!!");
        }
    }
}
