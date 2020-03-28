package unit2;


public class LinkedList271<E> {
    Node head;
    Node tail;

    static class Node<T> {
        T value = null;
        Node next = null;

        public String toString() {
//            return this.value.toString();
            return "" + this.value;
        }

        Node(T value) {
            this.value = value;
        }

        Node() {
            this.value = null;
        }

    }

    public static void main(String[] args) {
        LinkedList271<Integer> app = new LinkedList271<>();
        app.run();
    }

    public void run() {
        LinkedList271<Integer> numberList = new LinkedList271<>();
        Node newIntNode;

        for(int i = 0; i < 10; i++) {
            newIntNode = new Node();
            newIntNode.value = i;
            numberList.append(newIntNode);
        }

        for(int i = -1; i > -10; i--) {
            newIntNode = new Node();
            newIntNode.value = i;

            numberList.prepend(newIntNode);
        }

        numberList.print();

        System.out.print("\n\n");

        LinkedList271<Person> personList = new LinkedList271<>();
        Node newPersonNode;

        for(int i = 0; i < 10; i++) {
            Person newPerson = new Person("Elly", i);
            newPersonNode = new Node(newPerson);
            personList.append(newPersonNode);
        }

        for(int i = -1; i > -10; i--) {
            Person newPerson = new Person("Elly", i);
            newPersonNode = new Node(newPerson);
            personList.prepend(newPersonNode);
        }

        personList.print("\n");

        // example -- doesn't do anything
        LinkedList271<LinkedList271<E>> myNestedList = new LinkedList271<>();

    }


    //append
    public void append(Node n) {
        // check if there is a current head, if not this is also the head and the tail
        if (this.head == null) {
            this.head = n;
        }

        // get a copy of our current tail before appending
        Node tmp = this.tail;
        // overwrite the list reference to tail with a new reference to the new node
        this.tail = n;
        // make the previous tail (which is now 2nd to last) point to the new tail (which is now last)
        if (tmp != null) {
            tmp.next = n;
        }
    }

    //prepend
    public void prepend(Node n) {
        // check if there is a current tail, if not this is also the head and the tail
        if (this.tail == null) {
            this.tail = n;
        }

        // get a copy of our current head before prepending
        Node tmp = this.head;
        // overwrite the list reference to head with a new reference to the new node
        this.head = n;
        // make the previous head (which is now 2nd element--was the 1st) point to the new head (which is now 1st)
        if (tmp != null) {
            this.head.next = tmp;
        }
    }

    //print
    public void print() {
        this.print(" ");
    }

    public void print(String delim) {
        // get the first element in the list
        // print the value of that element
        // then move to the next element in the list, if its not null
        // repeat steps 2-4

        Node n = this.head;
        if (n == null) {
            System.out.println("List is empty");
            return;
        }

        while(n != null) {
            System.out.print(n.value + delim);
            n = n.next;
        }
    }
}
