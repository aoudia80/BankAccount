package mobileApplication;

import java.util.HashMap;
import java.util.Scanner;

public class MobileDiary {

	public static void main(String[] args) {
		HashMap<String, Long> Mobilediary = new HashMap<String, Long>();
		Mobilediary.put("Jan", 1234L);
		Mobilediary.put("Mat", 2346L);
		Mobilediary.put("Pat", 8966L);
		Mobilediary.put("Nat", 5465L);
		Mobilediary.put("Man", 3654L);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.next();
		
		if(Mobilediary.containsKey(name)) {
			System.out.println(name +" Phone number is" + ": "+Mobilediary.get(name));
		}
	}

}
