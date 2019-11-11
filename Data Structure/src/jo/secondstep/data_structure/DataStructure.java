package jo.secondstep.data_structure;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DataStructure {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Array list :");
		SSArrayList arrayList = new SSArrayList();
		arrayList.add(10);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(8);
		arrayList.addFirst(5);
		System.out.println(arrayList.size());
		arrayList.print();

		System.out.println("linkedList :");
		SSLinkedList lList = new SSLinkedList();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		System.out.println(lList.size());
		lList.print();

		SSArrayList arrayListadd = new SSArrayList();
		arrayListadd.add(11);
		arrayListadd.add(12);
		
		
		System.out.println("the mix");
		arrayList.addAll(2,arrayListadd);
		System.out.println(arrayList.size());
		arrayList.print();
	
		

	}

}
