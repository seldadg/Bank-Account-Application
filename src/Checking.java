public class Checking extends Account{
    // List properties specific to a cheking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize cheking account properties
    public Checking(String name, String socialSecurityNum, double initDeposit) {
        super(name, socialSecurityNum, initDeposit);
        accountNumber = "2" + accountNumber;

        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to the cheking account
    public void showInfo(){
        super.showInfo();
        System.out.println(
            " Your Checking Account features" + 
            "\n Debit Card Number: " + debitCardNumber + 
            "\n Debit Card PIN: " + debitCardPIN
        );
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * 0.15;
    }
}