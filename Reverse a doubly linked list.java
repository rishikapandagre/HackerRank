public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
        DoublyLinkedListNode curr = llist;
        DoublyLinkedListNode temp = null;
        
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            
            curr = curr.prev;
        }
        
        if(temp != null){
            llist = temp.prev;
        }
        
        return llist;

    }
