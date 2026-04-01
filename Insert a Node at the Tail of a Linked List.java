static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        if(head == null){
            return newNode;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newNode;
        
        return head;

    }
