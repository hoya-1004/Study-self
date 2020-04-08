public class while1 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------");
				System.out.println("1.����  | 2.����  | 3.����");
				System.out.println("---------------------");
				System.out.println("���� : ");
			}

			keyCode = System.in.read();

			if (keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� =  " + speed);
			} else if (keyCode == 50) { // 2�� �о������
				speed--;
				System.out.println("���� �ӵ� =  " + speed);
			} else if (keyCode == 51) { // 3�� �о������
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}
}
