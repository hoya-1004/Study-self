public class Car {
    // 필드
    int gas;

    // 생성자

    // 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("Gas가 없습니다.");
            return false;
        }
        System.out.println("Gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(Gas 잔량 :" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(Gas 잔량 :" + gas + ")");
                return;
            }
        }
    }
}