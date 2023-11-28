package lambdaexpression;

import java.util.HashMap;
import java.util.Map;

public class DemoMapFunction {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("company", "systech");
		m.put("Language", "Java");
		m.put("topci", "Lamda Expression");
		m.forEach((key, value) -> System.out.println(key + " :" + value));
	}
}
