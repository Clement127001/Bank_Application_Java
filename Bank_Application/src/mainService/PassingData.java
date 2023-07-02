//having sql commands to insert , upadate and delete user
//selecting data about balance

//table name need to be updated

package mainService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.Bean_class;
import DBUtil.DButill;

public class PassingData
{
    //create a new user
	//okay
    public static void enterData(Bean_class obj)
    {
      try
        {
          PreparedStatement insert=DButill.getDBConnection().prepareStatement("insert into bank (name,amount)values(?,?)");
          
          
          insert.setString(1,obj.getName());
          insert.setFloat(2,obj.getAmount());

          insert.executeUpdate();
          System.out.println("Record inserted");
        }

      catch(Exception e)
        {
          System.out.println("Failed to insert Data");
          e.printStackTrace();
        }
    }

    //update name of the user
    public static void updateData(Bean_class obj,int account_no)
    {
      try
        {
          String sqlUpdate="update bank set name=? where account_no=?";

          PreparedStatement update=DButill.getDBConnection().prepareStatement(sqlUpdate);
      update.setString(1,obj.getName());
      update.setInt(2,account_no);
      update.executeUpdate();
      System.out.println("Record upadated");
        }

      catch(Exception e)
        {
          System.out.println("Failed to update");
          e.printStackTrace();
        }
   }
    
    //okay
     public static void depositAmount(Bean_class obj,int account_no)
    {
      try
        {
          String withDraw="update bank set amount=amount+?  where account_no=?";
          PreparedStatement withdraw=DButill.getDBConnection().prepareStatement(withDraw);

          withdraw.setFloat(1,obj.getAmount());
          withdraw.setInt(2,account_no);
          withdraw.executeUpdate();
          System.out.println("Amount Deposited");
        }

      catch(Exception e)
        {
          System.out.println("Can't able to deposit amount");
          e.printStackTrace();
        }
    }
    
     // okay 
    public static void withdrawAmount(Bean_class obj,int account_no)
    {
      try
        {
          String withDraw="update bank set amount=amount-?  where account_no=?";
          PreparedStatement withdraw=DButill.getDBConnection().prepareStatement(withDraw);

          withdraw.setFloat(1,obj.getAmount());
          withdraw.setInt(2,account_no);
          withdraw.executeUpdate();
          System.out.println("Amount withdrawn");
        }

      catch(Exception e)
        {
          System.out.println("Can't able to withdraw amount");
          e.printStackTrace();
        }
    }
//okay
public static void deleteData(int account_no)
    {
      try
        {
          PreparedStatement delete=DButill.getDBConnection().prepareStatement("delete from bank where account_no=?");

          delete.setInt(1,account_no);
          
          delete.executeUpdate();
          System.out.println("Record removed");
        }

      catch(Exception e)
        {
          System.out.println("Failed to delete Data");
          e.printStackTrace();
        }
    }
//okay
  public static void printData(int account_no){
    try{
      PreparedStatement print=DButill.getDBConnection().prepareStatement("select account_no,name,amount from bank where account_no=?");

      print.setInt(1,account_no);
      ResultSet res=print.executeQuery();

      if(res.next())
      {
        int account_num=res.getInt("account_no");
        String name=res.getString("name");
        float amount=res.getFloat("amount");

        System.out.println("User Details"+"\nAccount Holder Name: "+name+"\nAccount no: "+account_num+"\nAccount balance: "+amount);
      }
      
    }
    catch(Exception e){
      System.out.println("Unable to fetch data");
      e.printStackTrace();
    }
  }
  }
