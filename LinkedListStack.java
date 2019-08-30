public class LinkedListStack<T> implements Stack<T> {

    int size;
    Node<T> head;
    Node<T> tail;

    // constructor
    public LinkedListStack(){
        size = 0;
        head = null;
        tail = null;
    }

    private static class Node<T>{
        T element;
        Node<T> next;

        private Node(){
            this.element = null;
            this.next = null;
        }

        private Node(T e){
            this.element = e;
            this.next = null;
        }
    }

    // adds element onto the stack
    @Override
    public void push(T object) {
        Node node = new Node<T>(object);
        if(size==0){
            head = node;
            tail = node;
        } else {
            head.next = head;
            head = node;
        }
        size++;
    }

    // removes and returns top element of stack
    // error if stack is empty
    @Override
    public T pop() {
        if(isEmpty()){ throw new StackEmptyException();}

        T tmp = head.element;
        head = head.next;
        size--;
        return tmp;
    }

    // returns top element of the stack without removing it
    // error if stack is empty
    @Override
    public T peek() {
        if(isEmpty()){ throw new StackEmptyException();}
        return head.element;
    }

    // returns size of stack
    @Override
    public int size() {
        return size;
    }

    // returns boolean indicating if stack is empty
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    public String toString(){
        System.out.println("Stack: ");
        Node<T> curr = head;
        while (curr!= null){
            System.out.println(curr.element + " ");
            curr = curr.next;
        }
        return "size: " + size() + "front: " + head.element;
    }
    
}
