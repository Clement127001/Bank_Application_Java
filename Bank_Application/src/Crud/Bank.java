//modules 

//1.1 create users
//1.2 wihdraw
//1.3 Deposit
//1.4 update user details
//1.5 delete user

//implement all the operation with try and catch

//convention for varibales
//name, account_no,amount,address (database with the single table holding all these details) 
//follow the same convention along the application and database

package Crud;
import Bean.Bean_class;
import mainService.PassingData;

public class Bank
{
	
//	public Bank()
//	{
//		
//	}
	Bean_class obj=new Bean_class();
public void createUser(String name,float amount) 
{
  
	obj.setName(name);
	obj.setAmount(amount);
	PassingData.enterData(obj);
	
}
  public void deposit(int account_no,float amount){
    
    obj.setAmount(amount);
    PassingData.depositAmount(obj,account_no);
  }
  public void withdraw(int account_no,float amount){
   
    obj.setAmount(amount);
    PassingData.withdrawAmount(obj,account_no);
  }
  
  public void alterName(int account_no,String name){
 
    obj.setName(name);
    PassingData.updateData(obj,account_no);
  }
  public void deleteUser(int account_no){

    PassingData.deleteData(account_no);
  }
  public void printDetails(int account_no){
   
    PassingData.printData(account_no);
  }
}    