import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionTwo {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		arrList.add(1);
		arrList.add(2);

		linkedList.add(1);
		linkedList.add(2);

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
	}
}
