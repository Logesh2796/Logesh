package day15C;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


public class UsePlayers {
	public static void main(String[] args) {
		Players p1 = new Players("Dhoni",40,7,"India",13000);
		Players p2 = new Players("Sachin",43,10,"India",23000);
		Players p3 = new Players("Dravid",42,17,"India",12000);
		Players p4 = new Players("Pant",30,27,"India",3000);
		Players p5 = new Players("Virat",33,18,"India",17000);
		
		ArrayList<Players> p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		List<Players> senior = p.stream().filter(x->x.getAge()>35).collect(Collectors.toList());
		senior.forEach(x->System.out.println(x));
		//System.out.println(i);
		
		List<String> sen = p.stream().filter(x->x.getAge()>35).map(x->x.getName()+" "+x.getAge()).collect(Collectors.toList());
		
		sen.forEach(x->System.out.println(x));
		//System.out.println(sen);
		
		List<String> s =p.stream().map(x->x.getName()).filter(x->x.startsWith("D")).collect(Collectors.toList());
		s.forEach(x->System.out.println(x));
		
		List<String> ss =p.stream().filter(x->x.getName().length()>4).map(x->x.getName()).collect(Collectors.toList());
		ss.forEach(x->System.out.println(x));
		
	//	List<Players> si =p.stream().filter(x->x.getName().length()).collect(Collectors.toList());
	//	si.forEach(x->System.out.println(x));
		
		Long c =p.stream().map(x->x.getName()).filter(x->x.startsWith("D")).count();
		System.out.println(c);
		
		Map<Integer, Players> h = p.stream().filter(y->y.getAge()>33&&y.getRuns()>10000).collect(Collectors.toMap(x->x.getJerseyNo(),x->x));
		h.forEach((x,y)->System.out.println(x+" "+y));

		
	}

}
