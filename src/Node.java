public class Node<T> {

    //clase T generica pueda
    T data;
    Node<T> next;

    //Constructor para crear un nuevo nodo
    //Next is inicializado como nulo por defecto
    public Node(T data) {
        this.data  = data;
        next = null;
    }
}
