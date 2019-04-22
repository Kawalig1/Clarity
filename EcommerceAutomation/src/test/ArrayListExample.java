package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	static List<String>Array = new ArrayList<String>();
	
	public static void Testing()
	{
		Array.add("Gopal");
		Array.add("Kawali");
		Array.add(2, "Narsappa");
		
		int SizeOfArray = Array.size();
		System.out.println(SizeOfArray);
		System.out.println("-----------------------------Before Remove----------------");
		System.out.println(Array);
		System.out.println("-----------------------------After Remove----------------");
		Array.remove(1);
		System.out.println(Array);
		System.out.println("-----------------------------After Add----------------");
		Array.add(2, "Kawali");
		System.out.println(Array);
	}
	


	public static void main(String[] args) {
		
		Testing();
		

	}

}
