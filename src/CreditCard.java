public class CreditCard {
    int accountNumber;
    double accountBalance;
    public CreditCard(){
    }

     double sum (double amount){
        accountBalance += amount;
        return accountBalance;
    }

    double razn (double amount){
        accountBalance += amount;
        return accountBalance;
    }

    void iformation (){
        System.out.println(accountNumber + " " + accountBalance);
    }

}
