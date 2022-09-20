package day15C;

import java.util.HashMap;

import java.util.Map;
import java.util.stream.Collectors;


public class UsePlayerHashmap {
	public static void main(String[] args) {
		Players p1 = new Players("Dhoni",40,7,"India",13000);
		Players p2 = new Players("Sachin",43,10,"India",23000);
		Players p3 = new Players("Dravid",42,17,"India",12000);
		Players p4 = new Players("Pant",30,27,"India",3000);
		Players p5 = new Players("Virat",33,18,"India",17000);
		
		HashMap<Integer,Players> p = new HashMap<>();
		p.put(p1.getJerseyNo(), p1);
		p.put(p2.getJerseyNo(), p2);
		p.put(p3.getJerseyNo(), p3);
		p.put(p4.getJerseyNo(), p4);
		p.put(p5.getJerseyNo(), p5);
		
		Map<Integer, Players> v = p.values().stream().filter(x->x.getName().contains("D")).collect(Collectors.toMap(x->x.getJerseyNo(),x->x));
		v.forEach((x,y)->System.out.println(x+" "+y));
	}
	

}
