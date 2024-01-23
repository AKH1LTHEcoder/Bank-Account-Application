# Bank-Account-Application
Here we have,

3 CLASSES- 1 PARENT CLASS (ACCOUNT.JAVA) AND 2 CHILD CLASS (CHECKING.JAVA & SAVINGS.JAVA)
1 INTEFACE- FOR INTEREST RATES (IBANKRATE.JAVA)
1 MAIN CLASSES- TO STORE THE MAIN FUNCTIONS (BANKACCOUNTAPP.JAVA)
1 UTILITY CLASS- TO UPLOAD THE CSV FILE INTO THE APPLICATION

Heres an detailed explaination, Starting with:
1. BankAccountApp.java - This is the main application where we will be giving our input. You wont see 100 lines of code in here. The INPUT is an CSV file which fileLocation should be set in the class. It will also be checking for ENTERED ACCOUNT TYPE and prints ERROR if the account type is unknown or inavlid. 
2. Account.java - Its an Parent Class under it there are Checking and Savings classes (CHILD CLASSES). Used an abstract class as we are NOT MAKING OBJECTS FROM THE ACCOUNT CLASS. Properties like NAME, SSN (SOCIAL SECURITY NUMBER), BALANCE, INDEX, ACCOUNT NUMBER AND RATE are declared here for savings and checkings account. A Random account number to user will be given.
3. Checking.java - Properties such as DebitCard Number and Pin are intoduced. Checking account holders will be assinged their account number starting with '2'. @Override is used to overried the 'setRate' element. Debit Card number of 12 digits and Debit Card Pin of 4 digits are randomly assinged. Finally at the end account credentials are displayed.
4. Savings.java - Safety DepositBox ID and KEY properties are declared. Account number with is randomly assingned only starts with '1'. @Override annotation is used here as well. Safety depositbox ID of 3 digits and Safety depositbox KEY of 4 digits are randomly assigned. And the account credentials are displayed to the customer.
5. IBaseRate.java - Holds the interest rate value for the accounts.
6. CSV.java - This class is used to upload the CSV file into the application. Once uploaded the file can be processed by the application. It also checks for file type error.

