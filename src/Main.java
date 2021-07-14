//new datatype for storing name and phone
class Contacts
{
    String name;
    String phone;
}
//class to manage contacts perform task through methods
class ManageContacts
{
    Contacts[] obj;
    int FriendCount;
    //constructor to initialise data variables
    ManageContacts()
    {
        this.FriendCount=0;
        this.obj=new Contacts[100];
    }
    //method to add a new contact
    void AddContact(Contacts New_obj)
    {
        obj[FriendCount]=New_obj;
        FriendCount++;
    }
    //method to search mobile number with help of name
    Contacts SearchContact(String Search_name)
    {
        for(int i=0;i<=FriendCount;i++)
            if (obj[i].name.equals(Search_name))
                return obj[i];

        return null;
    }
}
class Main
{
    public static void main(String [] args)
    {
        Contacts obj1=new Contacts();   //creating object for storing name and phone
        obj1.name="roger";
        obj1.phone="xxxxxxxxxx";

        Contacts obj2=new Contacts();
        obj2.name="jackson";
        obj2.phone="123456789";

        ManageContacts object = new ManageContacts();    //creating object of ManageContacts class
        object.AddContact(obj1);                         //adding phone and name through Managecontacts class
        object.AddContact(obj2);

        Contacts Find_obj = object.SearchContact("jackson");  //searching phone through name
        System.out.println(Find_obj.phone);               //printing phone after search
    }
}
