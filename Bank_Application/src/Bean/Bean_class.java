package Bean;

public class Bean_class 
{
private int account_no;
float amount;
private String name;

public Bean_class()
{
	super();
} 
  
public void setName(String name)
{
	this.name=name;
}

public String getName()
{
	return name;
}

//public void setAccountNo(int account_no)
//{
//this.account_no=account_no;
//}
//  
public int getAccountNo()
{
	return account_no;
}

public void setAmount(float amount) 
{
	this.amount=amount;
}

public float getAmount()
{
return this.amount;    
}

}
