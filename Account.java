public class Account {
    String acccountNo;
    int remainAmount;

    public Account() {
        System.out.println("Account 생성자 호출되었음");
    }

    public void deposit(int inputAmount) {
        remainAmount += inputAmount;
    }
}