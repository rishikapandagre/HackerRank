
public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    
    if (llist == null) {
        return newNode;
    }
    
     if (data <= llist.data) {
        newNode.next = llist;
        llist.prev = newNode;
        return newNode;
    }
    
    DoublyLinkedListNode curr = llist;
    
    while (curr.next != null && curr.next.data < data) {
        curr = curr.next;
    }
    
    newNode.next = curr.next;
    newNode.prev = curr;

    if (curr.next != null) {
        curr.next.prev = newNode;
    }

    curr.next = newNode;

    return llist;

}
