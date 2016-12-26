package com.arraylistiterator.classes;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Avinash");
		arr.add("Selva");
		arr.add("Manjo");
		arr.add("Adi");
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
