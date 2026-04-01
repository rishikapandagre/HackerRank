public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(position == 0){
            newNode.next = llist;
            return newNode;
        }
        
        SinglyLinkedListNode temp = llist;
        
        for(int i=0; i < position-1; i++){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        
        return llist;

    } 
