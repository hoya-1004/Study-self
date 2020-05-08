public class AccountTest {
    public static void main(String[] args) {
        System.out.println("Account 클래스 관련 내용");
        System.out.println("=======================");
        Account yourbank = new Account();
        yourbank.acccountNo = "123-456-78-9";

        System.out.println("너의은행 계좌번호 : " + yourbank.acccountNo);
        yourbank.deposit(500000);
        System.out.println("너의은행 잔고확인 : " + yourbank.remainAmount);

        System.out.println("CheckCardAccount클래스 관련 내용");
        System.out.println("=======================");
        CheckCardAccount duna = new CheckCardAccount();
        duna.acccountNo = "456-789-10-2";

        System.out.println("두나은행 계좌번호 : " + duna.acccountNo);
        duna.deposit(1000000);
        System.out.println("두나은행 잔고확인 : " + duna.remainAmount);

        duna.directCardNo = "Check-1234";
        System.out.println("\n" + duna.directCardNo);
    }
}