package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class FilterEven {
	int x;

	public FilterEven(int x) {
		super();
		this.x = x;
	}
}

public class ExpressionFilter {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		List<FilterEven> list = new ArrayList<FilterEven>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Number ");
			int x = sc.nextInt();
			list.add(new FilterEven(x));
		}
		Stream<FilterEven>filtered_evennum=list.stream().filter(p->p.x%2==0);
		filtered_evennum.forEach(FilterEven->System.out.println(FilterEven.x));
		
	}
}
