package lambda;

public class ExampleRunnable {
	public static void main(String[] args) {
		// 1.1ʹ�������ڲ���
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world !");
			}
		}).start();
		// 1.2ʹ�� lambda expression
		new Thread(() -> System.out.println("Hello world !")).start();

		// 2.1ʹ�������ڲ���
		Runnable race1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world !");
			}
		};
		// 2.2ʹ�� lambda expression
		Runnable race2 = () -> System.out.println("Hello world !");

		// ֱ�ӵ��� run ����(û�����߳�Ŷ!)
		race1.run();
		race2.run();
	}
}
