package com.Ansar;


import com.Ansar.LinkedList.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        LinkedList<String> list=new LinkedList<>();
        list.add("Ansar-0");
        list.add("Ansar-1");
        list.add("Ansar-2");
        list.add("Ansar-3");
        list.add("Ansar-4");
        list.insetAtFirst("00");
        list.add("Ansar-5");
        list.add("Ansar-6");
        list.add("Ansar-7");
        list.add("Ansar-8");
        System.out.println(list.Size());
        list.remove(0);
        for(int count=0;count<list.Size();count++)
        {
            System.out.println(list.get(count)+" -->"+count);
        }
        System.out.println(list.isEmpty());



        LinkedList<Student> List=new LinkedList<>();
        List.add(new Student("Ansar",12));
        List.add(new Student("Ansar-1",52));
        List.add(new Student("Ansar-3",17));
        List.add(new Student("Ansar-3",17));
        List.insetAt(1,new Student("Ansar-4",22));
        List.add(new Student("Ansar-3",17));
        List.add(new Student("Ansar-5",32));

        java.util.List<Student> collection=new ArrayList<>();
        collection.add(new Student("Goat-0",5));
        collection.add(new Student("Goat-1",4));
        collection.add(new Student("Goat-2",12));
        collection.add(new Student("Goat-3",14));
        List.addAll(collection);
        System.out.println("Size is: "+List.Size());
        System.out.println();

        for(int count=0;count<List.Size();count++)
        {
            System.out.println(List.get(count).Name+", "+List.get(count).age);
        }
        System.out.println((List.toArray()[0]));








        /*System.out.println(list.get(4).data+" <-C-");
        System.out.println(list.get(4).getNextLink().data+" <-N-");
        System.out.println(list.get(4).getPreviousLink().data+" <-P-\n");

        System.out.println(list.get(3).data+" <-C-");
        System.out.println(list.get(3).getNextLink().data+" <-N-");
        System.out.println(list.get(3).getPreviousLink().data+" <-P-\n");


        System.out.println(list.get(5).data+" <-C-");
        System.out.println(list.get(5).getNextLink().data+" <-N-");
        System.out.println(list.get(5).getPreviousLink().data+" <-P-");*/

        
    }
}
