package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by rrt on 8/6/2016.
 */
public class UseMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String,String>();
		map.put("USA", "NY,AR,LA");
		map.put("UK", "London");
		map.put("Canada", "Ontario");
		map.put("Japan", "Tokeyo");
		map.put("Bangladesh", "Dhaka");

		for(Map.Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : " + entry.getValue());
		}
	}
}