package lambda;

import java.util.Arrays;
import java.util.List;
/* ������5��lambda
 * // 1. ����Ҫ����,����ֵΪ 5  
 * () -> 5  
 * // 2. ����һ������(��������),������2����ֵ  
 * x -> 2 * x  
 * // 3. ����2������(����),���������ǵĲ�ֵ  
 * (x, y) -> x �C y  
 * // 4. ����2��int������,�������ǵĺ�  
 * (int x, int y) -> x + y  
 * // 5. ����һ�� string ����,���ڿ���̨��ӡ,�������κ�ֵ(���������Ƿ���void)  
 * (String s) -> System.out.print(s)  
 */
public class SimpleExample {
	public static void main(String[] args) {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);

		// ��ǰ��ѭ����ʽ
		for (String player : players) {
			System.out.print(player + "; ");
		}

		// ʹ�� lambda ���ʽ�Լ���������(functional operation)
		players.forEach((player) -> System.out.print(player + "; "));

		// �� Java 8 ��ʹ��˫ð�Ų�����(double colon operator)
		players.forEach(System.out::println);
	}
}
