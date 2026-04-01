static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode a = head1;
        while(a != null){
            SinglyLinkedListNode b = head2;
            while(b != null){
                if (a == b){
                    return a.data;
                }
                b = b.next;
            }
            a = a.next;
        }
        return -1;

    }
