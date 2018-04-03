public class CircularList<T> {
    private CircularNode<T> head;

    private int size;

    public CircularList(){
        this.head = null;
        this.size = 0;
    }

    public void add(T data){
        CircularNode<T> newNode = new CircularNode<>(data);

        if (this.head != null){
            if (size == 1){
                this.head.setNext(newNode);
                newNode.setNext(this.head);
            } else{
                CircularNode<T> tmp = head;

                while (tmp.getNext() != head){
                    tmp = tmp.getNext();
                }
                tmp.setNext(newNode);
                newNode.setNext(this.head);
            }
        } else {
            this.head = newNode;
            this.head.setNext(this.head);
        }
        size++;
    }

    public void remove(int index){
        if (head != null){
            CircularNode<T> tmp = head;
            int cont = 0;

            if (index == 0){
                this.head = this.head.getNext();

                while (tmp.getNext() != head){
                    tmp = tmp.getNext();
                }

                tmp.setNext(this.head.getNext());
                size--;
            } else {
                cont++;

                while (tmp.getNext() != head){
                    if (cont == index){
                        tmp.setNext(tmp.getNext().getNext());
                        size--;
                        return;
                    }

                    cont++;
                    tmp = tmp.getNext();
                }
            }
        }
    }

    @SuppressWarnings("Duplicates")
    public T get(int index){
        int count = 0;

        if (this.head != null){
            CircularNode<T> tmp = head;

            while (count <= size){
                if (count == index){
                    return tmp.getData();
                }
                tmp = tmp.getNext();
                count++;
            }
        }
        return null;
    }

    public CircularNode<T> getNode(int index){
        int cont = 0;

        if (this.head != null){
            CircularNode<T> tmp = head;

            while (cont <= size){
                if (cont == index){
                    return tmp;
                }
                tmp = tmp.getNext();
                cont++;
            }
        }
        return null;
    }

    public int length(){
        return size;
    }
}