package org.learnjava;

public class Main {
    public static void main(String[] args) {
      myDynamicArray list = new myDynamicArray<>();
      list.add(1);
      list.add("napis");
      list.add(null);
        System.out.println(list.get(1));

        System.out.println(list.size());



        }
    }

