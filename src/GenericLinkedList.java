//https://stackoverflow.com/questions/41845548/implementing-a-generic-type-java-linkedlist
public class GenericLinkedList<T> {
    Node<T> head;

    public  void insertNode(T data){

        Node<T> newNode = new Node<>( data );
        if ( head == null ) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }


    // recorrer lista enlazada
    public void printList() {
        Node<T> currentNode = head;
        if (currentNode == null) {
            System.out.println( "No hay estudiantes registrados." );
        }
        while (currentNode != null) {
            System.out.println( currentNode.data );
            currentNode = currentNode.next;
        }
        System.out.println();
    }




}
