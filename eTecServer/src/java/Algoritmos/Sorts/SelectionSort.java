package Algoritmos.Sorts;
import java.util.ArrayList;
import Estructuras.*;
import basicsOBJs.Item;

public class SelectionSort<E> {
	
	 //para arrays
	 public static <E extends Comparable<E>> void selectionArray(E[] arr){
         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j].compareTo(arr[index])<0 )
	                    index = j;
	      
	            E smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	 }
	 
	 ///para arraylist
	 public static <E extends Comparable<E>> void selectionArrayList(ArrayList<E> arr){
         
		 for (int i = 0; i < arr.size(); i++) {
	            // find position of smallest num between (i + 1)th element and last element
	            int pos = i;
	            for (int j = i; j < arr.size(); j++) {
	                if (arr.get(j).compareTo(arr.get(pos))<0 )
	                    pos = j;
	            }
	            // Swap min (smallest num) to current position on array
	            E min = arr.get(pos);
	            arr.set(pos, arr.get(i));
	            arr.set(i, min);
	        }
	 }
	 
	
	 public static <E extends Comparable<E>> void SelectionSortDoubleLinkedListList(DoubleLinkedList<E> list){
		 Node<E> head = list.getHead();
		 selectionLinkedList(head);
	 }
	 
	 public static <E extends Comparable<E>> void selectionLinkedList(Node<E> head){
         
		 Node<E> i, j;
		 i = head;
		 for ( i = head; i != null; i =i.getNext()) {
	            // find position of smallest num between (i + 1)th element and last element
	            Node<E> pos = i;
	            for ( j = i.getNext(); j != null; j=j.getNext()) {
	                if (j.getData().compareTo(pos.getData())<0 )
	                    pos = j;
	            }
	            // Swap min (smallest num) to current position on array
	            E min = pos.getData();
	            pos.setData( i.getData());
	            i.setData(min);
	        }
	 }
         
         public static  void SelectionSortDoubleLinkedListList(ItemsDoubleLinkedList list){
		 Node<Item> head = list.getHead();
		 selectionLinkedListForItem(head);
	 }
	 
	 public static void selectionLinkedListForItem(Node<Item> head){
         
		 Node<Item> i, j;
		 i = head;
		 for ( i = head; i != null; i =i.getNext()) {
	            // find position of smallest num between (i + 1)th element and last element
	            Node<Item> pos = i;
	            for ( j = i.getNext(); j != null; j=j.getNext()) {
	                if (j.getData().getNombre().compareTo(pos.getData().getNombre())<0 )
	                    pos = j;
	            }
	            // Swap min (smallest num) to current position on array
	            Item min = pos.getData();
	            pos.setData( i.getData());
	            i.setData(min);
	        }
	 }
}
