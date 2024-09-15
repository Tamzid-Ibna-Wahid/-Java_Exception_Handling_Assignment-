public class MainAccount {
    public static void main(String[] args) {
        BankAccount shafi = new BankAccount(100);
        
        try{
                shafi.deposit(50);
                System.out.println("Depositing $50.0");
                System.out.println("New balance : " + shafi.getBalance());
        }
        catch(InvalidAmountException e){
            System.out.println(e);
        }

        try{
            shafi.withdraw(200);
            System.out.println("Attempting to withdraw : $200");
            System.out.println("New balance : " + shafi.getBalance());
        }
        catch(Exception e){
            System.out.println("Attempting to withdraw : $200");
            System.out.println(e);
        }

        try{
            shafi.withdraw(50);
            System.out.println("Attempting to withdraw : $50");
            System.out.println("New balance : " + shafi.getBalance());
        }
        catch(Exception e){
            System.out.println("Attempting to withdraw : $50");
            System.out.println(e);
        }

        try{
            shafi.deposit(-10);
            System.out.println("Depositing $-10");
            System.out.println("New balance : " + shafi.getBalance());
    }
        catch(InvalidAmountException e){
        System.out.println("Attempting to deposit : -10");
        System.out.println(e);
    }

    finally{
        System.out.println("Final Amount : "+ shafi.getBalance());
        System.out.println("End of transaction.");
    }


        

    }
}
