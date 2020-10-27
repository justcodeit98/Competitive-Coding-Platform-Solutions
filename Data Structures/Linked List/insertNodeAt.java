

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int d, int position) {
        int currentpos=0;
        SinglyLinkedListNode ptr=head;
        SinglyLinkedListNode temp=new SinglyLinkedListNode(d);
        while(ptr.next!=null)
        {
            if(currentpos+1==position)
            {
                break;
            }
            else
            {
            ptr=ptr.next;
            currentpos++;
            }
        }
        temp.next=ptr.next;
        ptr.next=temp;
        return head;

    }

