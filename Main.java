import java.util.*;

class Main {
  
public static void main(String[] args) 
{
    
int balance, withdraw, deposit;
    
Scanner sc = new Scanner (System.in);
    
System.out.println("Enter the balance = ");
    
balance = sc.nextInt();
  
while(true)

{


    
System.out.println("Automated Teller Machine");
  
System.out.println("Enter 1 for Withdraw");
    
System.out.println("Enter 2 for deposit");
    
System.out.println("Enter 3 for display balance");
    
System.out.println("Enter 4 for exit");

int choice = sc.nextInt();
    
switch (choice)

{  
  
case 1:
    
System.out.println("Enter money to be withdrawn = ");
    
withdraw = sc.nextInt();
    
if(balance>=withdraw)
      
{
        balance = balance - withdraw;
        
System.out.println("Please collect your money "+balance);
        
      
}
    
else

{
  
System.out.println("Insufficient balance ");
  

}
    
System.out.println("");
    
break;

  
case 2:
    
System.out.println("Enter money to be deposited = ");
    
deposit =  sc.nextInt();
    
balance =  balance + deposit;
    
System.out.println("Your money has been successfully submitted "+balance);
    
System.out.println("");
    
break;

  
case 3:
    
System.out.println("Display the balance "+balance);
    
break;

  
case 4:
    
System.exit(0);

}

  
}




  
}

}