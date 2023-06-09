//import required classes and packages   
import java.util.Scanner;  
public class ATMExample  
{  
    
    //main method starts   
    public static void main(String args[])  
    {   
        float balance = 100000f;
        float amount;
        int transactions = 0;
	    String transactionHistory = "";
        String name;
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Tranfer");
            System.out.println("Choose 5 for Transaction History");  
            System.out.println("Choose 6 for EXIT");  
            System.out.println("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the ammount to withdraw from user  
        amount = sc.nextFloat();                
        if(balance >= amount )  
        {   
            transactions++;
            balance = balance - amount;
            System.out.println("Please collect your money.");
            String str = amount + " Rs Withdrawn.\n";
            transactionHistory = transactionHistory.concat(str); 
        }  
        else  
        {  
            //show error message   
            System.out.println("Insufficient Balance.");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get the amount to deposit from the user  
        amount = sc.nextFloat();  
        transactions++;              
        //add the deposit amount to the total balanace  
        balance = balance + amount;  
        System.out.println("Your Money has been successfully deposited.");  
        System.out.println("");
        String str = amount + " Rs deposited.\n";
        transactionHistory = transactionHistory.concat(str);  
        break;  
   
                case 3:  
        
        System.out.println("Balance : "+ balance);  
        System.out.println("");  
        
        break;

                case 4:  
        //Transfer money to other accounts 
        System.out.println("\nEnter Receipent's Name : ");
        name= sc.next(); 
        System.out.println("\nEnter Receipent's Account_Number : ");
        int acc = sc.nextInt();
        System.out.println("\nEnter amount : "); 
        amount = sc.nextFloat(); 
        if(balance >= amount)  
        {  
            transactions++;
            //remove the withdrawl amount from the total balance  
            balance = balance - amount;  
            System.out.println("Transfer Successful.");
            String str1 = amount + " Rs transfered to " +name +" with account no " + acc + ".\n";
            transactionHistory = transactionHistory.concat(str1); 

        }  
        else  
        {  
            //show error message   
            System.out.println("Insufficient Balance.");  
        }  
        System.out.println("");  
        break;
   
                case 5:  
                if ( transactions == 0 ) {
                    System.out.println("\nEmpty");
                }
                else {
                    System.out.println("\n" + transactionHistory);
                }
                System.out.println("");  
                break;
   
                case 6:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}