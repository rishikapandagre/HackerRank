public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if(position == 0){
            llist.next = null;
            llist = llist.next;
            return llist;
        }
        SinglyLinkedListNode temp = llist;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        SinglyLinkedListNode dummy = temp.next;
        temp.next = temp.next.next;
        dummy.next = null;
        
        return llist;

    }
