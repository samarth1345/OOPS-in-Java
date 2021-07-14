import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file
{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("new_new.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNextLine())
        {
            String line= scanner.nextLine();
            System.out.println(line.split(" ").length);
        }
    }
}
