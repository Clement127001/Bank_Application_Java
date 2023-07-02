package Driver;
import java.util.Scanner;
import java.lang.Math;
import Crud.Bank;

class Main
{
  public static void main(String[] args)
  {
    //varibles for bank database
    //randomly generated account number
	 Scanner sc=new Scanner(System.in);
	 Scanner in=new Scanner(System.in);
    
    int account_no=10000;
    float amount=0.0f;
    String name="";

    int option;

    Bank user1=new Bank();

    while(true)
      {
        System.out.println("1) Creating a new user"+"\n2) Deposit"+"\n3) Withdraw"+"\n4) Update Details"+"\n5) Delete an user"+"\n6) Display Details"+"\nOther option to exit"+"\nEnter an option : ");

        option=sc.nextInt();
        sc.nextLine();

        switch(option)
          {
          case 1:
            {
            System.out.println("Enter user name : ");
            
            name=sc.nextLine();
            System.out.println("Enter the initial amount to be deposited Enter amount or 0 to start an account : ");
              amount=sc.nextFloat();

              user1.createUser(name,amount);
              
              break;
            }

            case 2:
              {
                System.out.println("Enter your account number : ");
                account_no=sc.nextInt();
                System.out.println("\nEnter the amount to be deposited : ");
                amount=sc.nextFloat();
                user1.deposit(account_no,amount);
                
                break;
              }

              case 3:
              {
                System.out.println("Enter your account number : ");
                account_no=sc.nextInt();
                System.out.println("\nEnter the amount to be withdrawn : ");
                amount=sc.nextFloat();
                user1.withdraw(account_no,amount);
                
                break;
              }

            case 4:
              {
                System.out.println("Enter your account no : ");
                account_no=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the name to be changed : ");
                name=sc.nextLine();
                System.out.println("yes  to change \nno to skip");
                String updateStatus=sc.next().toLowerCase();
                if(!updateStatus.equals("no"))
                   {
                    
                  user1.alterName(account_no,name);
                   }

             //some statement to the update action sop()
                break;
              }

            case 5:
              {
                System.out.println("Enter the account number : ");
                account_no=sc.nextInt();
                System.out.println("Do you want to delete the user\nyes to delete an user\nno to skip");
                String delStatus=sc.next().toLowerCase();

                if(!delStatus.equals("no"))
                 user1.deleteUser(account_no);
                
                break;
              }
            case 6:
              {
                System.out.println("Enter the account number: ");
                account_no=sc.nextInt();
                user1.printDetails(account_no);
                break;
              }

            default:
              {
              System.out.println("Thank you, Visit again");
              break;
              }
          }
      }
//    sc.close();
  }
}