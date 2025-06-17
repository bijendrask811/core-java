package com.core.linkedList;

public class LinkList {
    Node head;
    class Node{

        int value;
        Node next;

        public Node(int data){
            this.value = data;
            this.next = null;
        }

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
               head = newNode;
               return;
            }
            newNode.next = head;
            head= newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;

        }

        public void printList(){
            Node currNode = head;
            if(head == null){
                System.out.println("List is null");
            }
            while(currNode != null){
                System.out.println(currNode.value +"-> ");
                currNode = currNode.next;

            }
        }

        public void removeFirst(){
            if(head == null){
                System.out.println("List is empty !");
                return;
            }
           head= head.next;
        }

        public void removeLast(){

        }
    }

    public static void main(String[] args) {

    }
}
