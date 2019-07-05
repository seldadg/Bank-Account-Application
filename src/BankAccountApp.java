
import java.util.LinkedList;
import java.util.List;
import utilities.*;

public class BankAccountApp {
    public static void main(String[] args){
        List<Account> accounts = new LinkedList<Account>();


        String file = "/Users/seldaali/Java Projects/Bank Account Application/NewBankAccounts.csv";

        // // Create new accounts based on the data
        // Checking checking1 = new Checking("Tom Tailor", "123456789", 1500);
        // Saving saving1 = new Saving("Mary Jane", "987654321", 2500);
        
        // saving1.compound();

        // saving1.showInfo();
        // System.out.println("******************");
        // checking1.showInfo();

        // Read a CSV file then create new account based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String socialSecurityNum = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Saving(name, socialSecurityNum, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, socialSecurityNum, initDeposit));
            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n************************");
            acc.showInfo();
            acc.deposit(1000);
            acc.withdraw(500);
            acc.transfer(" Someone", 300);
            // acc.printBalance();
            acc.compound();
        
        }

    }
}