package LinkedList_Attempt;

public class LinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(list.head == null){
            list.head = newNode;
        }else{
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }

    public LinkedList deleteByKey(LinkedList list, int key){
        
        Node currNode = list.head, prev = null;
        //If key is located at the head
        if(currNode != null && currNode.data == key){
            list.head = currNode.next;
        }
        //Search for key
        //Keep track of prev Node 
        while(currNode != null && currNode.data != key){
            //If currNode does not contain any key 
            //proceed to next Node
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null){
            prev.next = currNode.next;
            //Disconnect the currNode as it holds the key
        }
        if(currNode == null){
            //Key not found
        }
        return list;
    }

    public LinkedList deleteByPosition(LinkedList list,int index){
        Node currNode = list.head, prev = null;

        if(index == 0 &&  currNode != null){
            list.head = currNode.next;
        }
        //If the index is greater than 0
        int counter = 0;
        while(currNode != null){
            if(index == counter){
                prev.next = currNode.next;
                break;
                //Break after completing the operation
            }else{
                counter++;
                prev = currNode;
                currNode = currNode.next;
            }
        }
        if(currNode == null){
            //Key not found
        }

        return list;
    }
}
