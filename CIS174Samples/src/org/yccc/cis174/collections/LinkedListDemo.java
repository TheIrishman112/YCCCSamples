package org.yccc.cis174.collections;

import java.util.*;

/**
 * The LinkedList class extends AbstractSequentialList and implements the List interface. It provides a linked-list data structure.
 * 
 * @author mbourgeois
 *
 */
public class LinkedListDemo 
{
	public static void main(String args[]) {

         /* Linked List Declaration */
         LinkedList<String> linkedlist = new LinkedList<String>();

         /*add(String Element) is used for adding 
          * the elements to the linked list*/
         linkedlist.add("Item1");
         linkedlist.add("Item5");
         linkedlist.add("Item3");
         linkedlist.add("Item6");
         linkedlist.add("Item2");
         System.out.println("Linked List Content: " +linkedlist);

         // Add first and last items.
         linkedlist.addFirst("First Item");
         linkedlist.addLast("Last Item");
         System.out.println("LinkedList Content after addition: " +linkedlist);

         // Get and set values
         Object firstvar = linkedlist.get(0);
         System.out.println("First element: " +firstvar);
         linkedlist.set(0, "Changed first item");
         Object firstvar2 = linkedlist.get(0);
         System.out.println("First element after update by set method: " +firstvar2);

         // Remove first and last elements.
         linkedlist.removeFirst();
         linkedlist.removeLast();
         System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

         // Add to a specified postion.
         linkedlist.add(0, "Newly added item");
         linkedlist.add(3, "Insert in the middle");
         
         // Remove from a specified position.
         linkedlist.remove(2);
         System.out.println("Final Content: " +linkedlist); 
         
         System.out.println("Working with Iterators");
         Iterator<String> it = linkedlist.iterator();
         while(it.hasNext())
         {
        	 String s = (String) it.next();
        	 it.remove();
        	 System.out.println("Removing " + s);
        	 System.out.println(linkedlist);
         }
     }
}
