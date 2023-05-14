public class BankAccount {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();

        creditCard1.accountNumber = 1234;
        creditCard1.accountBalance = 125.00;
        creditCard2.accountNumber = 4321;
        creditCard2.accountBalance = 523.07;
        creditCard3.accountNumber = 3214;
        creditCard3.accountBalance = 765.83;

        double result1 = creditCard1.sum(100.90);
        double result2 = creditCard2.sum(20.56);
        double result3 = creditCard3.razn(307.05);

        creditCard1.iformation();
        creditCard2.iformation();
        creditCard3.iformation();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);




    }
}
