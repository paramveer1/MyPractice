package CollectionFramework;
import  java.util.List;
import java.util.ArrayList;
import  java.util.LinkedList;
import  java.util.Iterator;
import  java.util.Arrays;
import  java.util.ListIterator;
import  java.util.Stack;

public class Demo {
    public static void main(String[] args) {
Stack stack = new Stack();
stack.add(4);
stack.addAll(Arrays.asList(8,6,3,5));
stack.add(3,8);
System.out.println(stack);
stack.pop();
stack.push(9);

System.out.println(stack.peek());




       
    }
}
      
       

