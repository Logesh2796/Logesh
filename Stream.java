package day15C;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
		ArrayList<Integer> e = new ArrayList<>();
		e.add(244);
		e.add(256);
		e.add(299);
		e.add(277);
		
		e.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		List<Integer> even= e.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		Long c = e.stream().filter(x->x%2==0).count();
		System.out.println(c);
	}

}
