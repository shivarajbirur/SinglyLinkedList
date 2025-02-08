class LinkedList{
   
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next= null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insert at the start
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    //Insert At End
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        //if list has no node
        if(head == null){
            head = newNode;
        } 
        else 
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("\nList is empty");
            return;
        }

        Node currentNode = head;
        System.out.print("\nhead--> ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    //Insert at a Specific Position
    public void insertAtPosition(int data, int position){
        if(position < 1){
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        //Insert a position 1
        if(position == 1){
            insertAtStart(data);
            return;
        }
        
        Node currentNode = head;
        int currentPosition = 1;

        while (currentPosition < position -1  && currentNode != null) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        // If the currentNode is null, it means the position is out of bounds
        if (currentNode == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node at the specified position
        newNode.next = currentNode.next;
        currentNode.next = newNode;


    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtPosition(10, 1);
        list.printList();
        list.insertAtEnd(5);
        list.printList();
        list.insertAtStart(4);
        list.insertAtStart(3);
        list.printList();
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.printList();
        list.insertAtEnd(5);
        list.printList();
        list.insertAtPosition(10, 8);
        list.printList();
    }

}
