# Bank-Account-Application
Java OOP

                                                  Bank Account Application


Application should do the following:
- Read a .csv file of names, social security numbers, account type and initial deposit;
- Use a proper data structure to hold all these accounts;
- Both savings and cheking accounts share the following properties;

deposit()
withdraw()
transfer()
showinfo()


11-Digit Account Number (generated with the following process: 1 or 2 depending on Saving or Checking 
last two digits of Social Security Number, unique 5-digit number and random 3-digit number)

Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
Both accounts will use an interface that determines the base interest rate:
    Saving accounts will use .25 points less than base rate
    Checking accounts will use 15% of the base rate
- The ShowInfo() method should reveal relevant account information as well as information specific to the Checking account or 
Saving account.

