package Udemy_tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueAndStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        
        /*        Person3 person1 = new Person3(1);
        Person3 person2 = new Person3(2);
        Person3 person3 = new Person3(3);
        Person3 person4 = new Person3(4);

        Queue<Person3> person3Queue = new ArrayBlockingQueue<Person3>(3);
        System.out.println(person3Queue.offer(person3));
        System.out.println(person3Queue.offer(person2));
        System.out.println(person3Queue.offer(person4));
        System.out.println(person3Queue.offer(person1));*/

    }
}



 class Person3{
    private int id;

     @Override
     public String toString() {
         return "Person3{" +
                 "id=" + id +
                 '}';
     }

     public Person3(int id){
        this.id = id;

    }
 }