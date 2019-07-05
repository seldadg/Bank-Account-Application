public class Saving extends Account{
    // List properties specific to a saving account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize saving account properties
    public Saving(String name, String socialSecurityNum, double initDeposit) {
        super(name, socialSecurityNum, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
       
    }
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    
    // List any methods specific to the saving account
    public void showInfo(){
        super.showInfo();
        System.out.println(
            " Your Saving Account features" + 
            "\n Safety Deposit Box ID: " + safetyDepositBoxID + 
            "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }

    @Override
    public void setRate() {
       rate = getBaseRate() - 0.25;
    }
}