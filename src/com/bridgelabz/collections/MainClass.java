package com.bridgelabz.collections;

import com.bridgelabz.oops.ComparatorSample;

import java.util.*;


interface A{

}
interface C{

}

interface B extends A,C{

}



public class MainClass {

    public static void main(String[] args) {

        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("ABC",3);
        hashtable.put("BCD",6);

        // Iterable => Collection => List,Set,Queue => LinkedList,ArrayList,HashSet,LinkedHashSet

        // Collection framework
        List<Integer> arrayList = new ArrayList<>();   // dynamic array
        List<Integer> linkedList2 = new LinkedList<>();

        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Queue<Integer> queue = new PriorityQueue<>();
        Deque<String> deque = new ArrayDeque<>();


        Integer i1 = Integer.valueOf(12);

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(400);
        arrayList.add(900);
        arrayList.add(300);
        arrayList.add(800);
        arrayList.add(200);
        arrayList.add(200);
        arrayList.add(null);
        arrayList.add(null);

        hashSet.add(900);
        hashSet.add(300);
        hashSet.add(800);
        hashSet.add(200);
        hashSet.add(200);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("HashSet =>" + hashSet);
        Iterator<Integer> iterator = hashSet.iterator();
        System.out.println("HashSet Iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        linkedHashSet.add(900);
        linkedHashSet.add(300);
        linkedHashSet.add(800);
        linkedHashSet.add(200);
        linkedHashSet.add(200);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println("LinkedHashSet =>" + linkedHashSet);

        treeSet.add(900);
        treeSet.add(300);
        treeSet.add(800);
        treeSet.add(200);
        treeSet.add(200);
        System.out.println("TreeSet =>" + treeSet);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(9);
        linkedList.add(i1);
        linkedList.add(3);
        linkedList.add(8);

        linkedList2.add(10);
        linkedList2.add(20);
        linkedList2.add(40);
        linkedList2.add(90);
        linkedList2.add(i1);
        linkedList2.add(30);
        linkedList2.add(80);




        System.out.println("linkedList => "+linkedList);
        linkedList.add(3,11);
        System.out.println("linkedList => "+linkedList);
        System.out.println(linkedList.get(2));
        linkedList.remove(6);
        System.out.println("linkedList => "+linkedList);
        linkedList.remove(i1);
        System.out.println("linkedList => "+linkedList);
        System.out.println("linkedList2 => "+linkedList2);
        linkedList.addAll(2,linkedList2);
//        linkedList.addAll(linkedList2);
        System.out.println("linkedList => "+linkedList);
        System.out.println(linkedList.contains(i1));
        linkedList.set(9,44);
        linkedList.set(8,88);
        linkedList.add(80);
        linkedList.add(80);
        linkedList.add(87);
        System.out.println("linkedList => "+linkedList);
        System.out.println(linkedList.containsAll(linkedList2));
        System.out.println(linkedList.indexOf(i1));
//        linkedList.removeAll(linkedList2);
        System.out.println(linkedList);
        linkedList.retainAll(linkedList2);
        System.out.println("linkedList => "+linkedList);
        System.out.println(linkedList.size());
        Iterator<Integer> iterator1 = linkedList.iterator();
        System.out.println("linkedList Iterator");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Comparator<Integer> comparator = new ComparatorSample<>();
        linkedList.sort(comparator);
        System.out.println("Sorted linkedList => "+linkedList);


        // Map
        Map<String,Integer> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        hashMap.put("paranoid",3);
        hashMap.put("are",9);
        hashMap.put("because",5);
        hashMap.put("Paranoids",null);
        hashMap.put("they",7);
        hashMap.put("be",2);
        hashMap.put("be",5);
        hashMap.put(null,34);
        hashMap.put(null,56);
        System.out.println("hashMap =>" + hashMap);


        linkedHashMap.put(1,"ABC");
        linkedHashMap.put(4,"LMN");
        linkedHashMap.put(6,"XYZ");
        linkedHashMap.put(2,null);
        linkedHashMap.put(3,"EFG");
        linkedHashMap.put(5,"PQR");
        linkedHashMap.put(5,"VMN");
        linkedHashMap.put(null,"ZNM");
        linkedHashMap.put(null,"KKH");
        System.out.println("linkedHashMap =>" + linkedHashMap);


        treeMap.put(1,null);
        treeMap.put(4,"LMN");
        treeMap.put(6,"XYZ");
        treeMap.put(2,"BCD");
        treeMap.put(3,"EFG");
        treeMap.put(5,"PQR");
        treeMap.put(5,"VMN");
//        treeMap.put(null,"VFN");
//        treeMap.put(null,"VDN");
        System.out.println("treeMap =>" + treeMap);

        linkedList2.addAll(arrayList);
        System.out.println(linkedList2);

        System.out.println(arrayList);
    }
}
