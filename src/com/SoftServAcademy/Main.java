package com.SoftServAcademy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List <Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i<10; i++){
            myCollection.add(scanner.nextInt());
            switch (i) {
                case 8 :
                    System.out.println("1 number");
                    break;
                case 9 :
                    System.out.println("Done");
                    break;
                    default: System.out.println((9-i) + " numbers");
            }
        }
        System.out.println("#1 " + myCollection.toString());

        List <Integer> newCollection = new LinkedList<>();

        for (Integer object : myCollection) {
            if (object > 5) {
                newCollection.add(object);
            }
        }
        System.out.println("#2 " + newCollection.toString());

        List <Integer> newCollection2 = new LinkedList<>();
        for (int i = 0; i<myCollection.size(); i++) {
            if (i>6) {
                newCollection2.add(myCollection.get(i));
            }
        }
        System.out.println("#3 " + newCollection2.toString());

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println("#4 " + myCollection.toString());
        myCollection.add(2,1);
        int value = -3;
        int my_new_index = 8;
        if(my_new_index >= myCollection.size()) {
            myCollection.add(-3);
        } else {
            myCollection.add(my_new_index, value);
        }
        myCollection.add(5,-4);
        Collections.sort(myCollection);
        System.out.println("#5 " + myCollection.toString());


        Map <Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "tom");
        employeeMap.put(2, "bob");
        employeeMap.put(3, "rob");
        employeeMap.put(4, "ann");
        employeeMap.put(5, "kar");
        employeeMap.put(6, "rar");
        employeeMap.put(7, "zap");
        System.out.println(employeeMap.toString());

        System.out.println("Enter ID: ");
        int id;
        id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else
            System.out.println("No such ID.");

        System.out.println("Enter name: ");
        String name;
        name = scanner.next();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(name + " ID - " + entry.getKey());
            }
        } if (!employeeMap.containsValue(name)) {
            System.out.println("No such name.");
        }


        scanner.close();
    }
}
