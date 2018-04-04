public class LinkedList<T> {
     private Node<T> head;
     private int size;

     public LinkedList(){
         this.head = null;
         this.size = 0;
     }

     public void add(T data){
        if (head == null)
            head = new Node<>(data);
        else{
            Node<T> tmp = head;

            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<T>(data, null));
        }
        size++;
     }

     public T get(int index){
         if (head != null){
             if (index == 0)
                 return head.getData();
             else{
                 Node<T> tmp = head;
                 int cont = 0;

                 while (tmp != null){
                     if (cont == index)
                         return tmp.getData();
                     tmp = tmp.getNext();
                     cont++;
                 }
             }
         }
         return null;
     }

     public void remove(int index){
         if (head != null){
             if (index == 0){
                 head = head.getNext();
                 size--;
             } else{
                 Node<T> tmp = head;
                 int counter = 1;

                 while(tmp.getNext() != null){
                     if (counter == index){
                         tmp.setNext(tmp.getNext().getNext());
                         size--;
                         return;
                     }
                     tmp = tmp.getNext();
                     counter++;
                 }
             }
         }
     }

     public int length(){
         return size;
     }
}
