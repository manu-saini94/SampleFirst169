package com.bridgelabz.datastructures;

public class LinkedListMain {


    // LinkedList vs ArrayList(array)
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.print();
        System.out.println();
        System.out.println("***************************");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList2.print();
        System.out.println();
        Node<Integer> searchedNode = linkedList2.search(40);
        if(searchedNode == null){
            System.out.println("Data not found");
        }else{
            System.out.println("Data Found");
        }


        linkedList2.insertAfter(100,30);





//        System.out.println();
//        Integer poppedData = linkedList2.pop();
//        System.out.println("Popped Data :" + poppedData);
//        System.out.println("------------");
//        linkedList2.print();

        System.out.println();
        Integer poppedData2 = linkedList2.popLast();
        System.out.println("Popped Data1 :" + poppedData2);
        linkedList2.print();
        System.out.println();
        System.out.println("Stack operation");
        Stack<Integer> stack1 = new Stack();
        stack1.push(30);
        stack1.push(56);
        stack1.push(70);
        stack1.print();
        System.out.println();
        Integer poppedData3 = stack1.pop();
        System.out.println(poppedData3);
        stack1.print();




    }
}
