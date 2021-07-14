import java.util.Scanner;

public class Library
{
    private String roll;
    private String id;
    private boolean isborrowed;
    
    public Library()
    {
        this.roll=" ";
        this.id=" ";
        this.isborrowed=false;
    }
    public void borrow(String roll,String id)
    {
        this.roll=roll;
        this.id=id;
        this.isborrowed=true;
    }
    public void Isborrowed()
    {
        if(this.isborrowed==true) {
            System.out.println("Book with id "+this.id+" was borrowed");
        }
    }
    public void returnborrowed()
    {
        this.isborrowed=false;
        System.out.println("Book returned");
    }
}
class Managelibrary
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Library student=new Library();
        String roll,id;
        System.out.println("Please enter your roll no ");
        roll=scanner.nextLine();
        System.out.println("Please enter book id ");
        id=scanner.nextLine();
        student.borrow(roll,id);
        //student.Isborrowed();
        student.returnborrowed();
    }
}