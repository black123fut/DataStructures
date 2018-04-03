public class DoubleNode<T> {
    public T data;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;

    public DoubleNode(T data){
        this(data, null, null);
    }

    public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData(){
        return this.data;
    }

    public DoubleNode<T> getNext(){
        return next;
    }

    public DoubleNode<T> getPrev(){
        return prev;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }


}
