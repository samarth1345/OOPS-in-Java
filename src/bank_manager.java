import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
class account
{
     public String account_holder;
     public String account_number;
     public double balance;
}
class saving extends account
{
    private int number_of_trans;
    saving()
    {
        this.account_holder="";
        this.account_number="";
        this.balance=0.0;
        this.number_of_trans=0;
    }
    public void setdata_1(String account_holder,String account_number,double balance,int transaction)
    {
        this.number_of_trans=transaction;
        this.account_number=account_number;
        this.balance=balance;
        this.account_holder=account_holder;
    }
    public void display()
    {
        System.out.println("Account holder :"+this.account_holder);
        System.out.println("Account number :"+this.account_number);
        System.out.println("Balance :"+this.balance);
        System.out.println("max no. of transactions :"+this.number_of_trans);
    }
}
class checking extends account
{
    private int limit;
    checking()
    {
        this.account_holder="";
        this.account_number="";
        this.balance=0.0;
        this.limit=0;
    }
    public void setdata_2(String account_holder,String account_number,double balance,int limit)
    {
        this.limit=limit;
        this.account_number=account_number;
        this.balance=balance;
        this.account_holder=account_holder;
    }
    public void display()
    {
        System.out.println("Account holder :"+this.account_holder);
        System.out.println("Account number :"+this.account_number);
        System.out.println("Balance :"+this.balance);
        System.out.println("Limit for withdrawl :"+this.limit);
    }
}
class COD extends account
{
    GregorianCalendar expiry=new GregorianCalendar();
    COD()
    {
        this.account_holder="";
        this.account_number="";
        this.balance=0.0;
    }
    public void setdata_3(String account_holder,String account_number,double balance,GregorianCalendar date)
    {
        expiry=(GregorianCalendar)date.clone();
        this.account_number=account_number;
        this.balance=balance;
        this.account_holder=account_holder;
    }
    public void display()
    {
        System.out.println("Account holder :"+this.account_holder);
        System.out.println("Account number :"+this.account_number);
        System.out.println("Balance :"+this.balance);
        System.out.println("Expiry date :"+this.expiry.getTime());
    }
}
public class bank_manager
{
    public static void main(String[] args)
    {
        String account_holder;
        String account_number;
        double balance;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account holder's name");
        account_holder=scanner.nextLine();
        System.out.println("Enter account number");
        account_number=scanner.nextLine();
        System.out.println("Enter balance");
        balance=scanner.nextDouble();

        int choice;
        System.out.println("Enter bank account type\n1.saving account\n2.checking account\n3.COD account");
        choice=scanner.nextInt();
        if(choice==1)
        {
            int number_of_trans;
            saving S = new saving();
            System.out.println("Enter limit for number of transactions");
            number_of_trans=scanner.nextInt();
            S.setdata_1(account_holder,account_number,balance,number_of_trans);
            S.display();
        }
        else if(choice==2)
        {
            int limit;
            checking C=new checking();
            System.out.println("Enter limit for withdrawl");
            limit=scanner.nextInt();
            C.setdata_2(account_holder,account_number,balance,limit);
            C.display();
        }
        else if(choice==3)
        {
            COD cod = new COD();
            GregorianCalendar date=new GregorianCalendar();
            System.out.println("Enter expiry month and year");
            int year,month;
            month=scanner.nextInt();
            year=scanner.nextInt();
            date.set(year,month,1);
            cod.setdata_3(account_holder,account_number,balance,date);
            cod.display();
        }
    }
}
