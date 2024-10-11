package asds;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class localda {

	public static void main(String[] args) {
		List<Integer> a = List.of(10, 20, 30, 40, 50);
		List<Integer> b = List.of(25, 35, 40, 45, 50);

		/*
		 * List<Integer>c = new ArrayList<Integer>(); ;
		 * 
		 * for(int nums:a) { if (b.contains(nums)) { c.add(nums); } }
		 * 
		 * 
		 * System.out.println(c);
		 * 
		 * }
		 */

		/*
		 * List<Integer>c = new ArrayList<Integer>();
		 * c=a.stream().filter(a.contains(b)).collect(Collectors.toList()); c=
		 * a.stream().filter(b::contains).collect(Collectors.toList());
		 */

		List<Integer> c = new ArrayList<Integer>();
		c = a.stream().filter(element -> b.contains(element)).collect(Collectors.toList());

	}
}
