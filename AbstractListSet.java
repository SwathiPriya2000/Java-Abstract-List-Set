import java.util.*; 
  
public class AbstractListSet { 
    public static void main(String args[]) 
    { 
  
        // Creating an empty AbstractList 
        LinkedList<Integer> 
            list = new LinkedList<Integer>(); 
  
        // Use add() method to add elements in the list 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 
        list.add(50); 
  
        // Displaying the AbstractList 
        System.out.println("AbstractList:" + list); 
  
        // Using set() method to replace 10 with 100 
        System.out.println("The Object that is replaced is: "
                           + list.set(0, 100)); 
  
        // Using set() method to replace 20 with 200 
        System.out.println("The Object that is replaced is: "
                           + list.set(1, 200)); 
  
        // Displaying the modified AbstractList 
        System.out.println("The new AbstractList is:" + list); 
    } 
} 


