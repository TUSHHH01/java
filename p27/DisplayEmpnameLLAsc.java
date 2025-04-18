package multitheding;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class DisplayEmpnameLLAsc {

	public static void main(
			String[] args) {
		
		Scanner scanner1= new Scanner(System.in);
		System.out.println("Enter total students number :");
		int n=scanner1.nextInt();
		
		Scanner scanner= new Scanner(System.in);
				
		LinkedList<String> singlyLinkedList = new LinkedList<>();
		for(int i=1;i<=n;i++) {
		
		System.out.println("Enter "+i+" student name :");
		String name=scanner.next();
		singlyLinkedList.add(name);
		
		}
		System.out.println("LinkedList (before sorting): " + singlyL	inkedList);

		Collections.sort(singlyLinkedList);
		System.out.println("LinkedList (after sorting in natural): " + singlyLinkedList);
		Collections.sort(singlyLinkedList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s1);
			}
		});

		System.out.println("LinkedList (after sorting using Comparator): " + singlyLinkedList);
	}

}
