public class Account {
    private String name;
    private double amount;

    public double setAmount (double money){
        amount = money;
    }

    public double getAmount () {
        return amount;
    }
    public void Deposit (int money) {
        setAmount ( getAmount () + money );
    }


}
