public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
        SinglyLinkedListNode fast = llist;
        SinglyLinkedListNode slow = llist;
        
        for(int i=0; i<positionFromTail; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;

    }
