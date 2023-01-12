package aridi.myCollection;

public class MyLinkedList<E> implements MyList<E>, MyDeque<E> {

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size = 0;

    public MyLinkedList() {
    }

    @Override
    public void add(E element) {
        if(size == 0){
            head = new MyNode<>(element, null, null);
        } else if(size == 1){
            tail = new MyNode<>(element, head, null);
            head.next = tail;
        } else {
            MyNode<E> tmp = tail;
            tail = new MyNode<>(element, tmp, null );
            tmp.next = tail;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if(index == 0){
            return head.value;
        }
        if(index > 0 && index == size){
            return tail.value;
        }
        MyNode<E> tmp;
        if(index < size >> 1) {
            tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } else {
            tmp = tail;
            for (int i = size - 1; i > index ; i--) {
                tmp = tmp.prev;
            }
        }
        return tmp.value;
    }

    @Override
    public void addAll(MyCollection<E> args) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    private static class MyNode<E> {
        private E value;
        private MyNode<E> prev;
        private MyNode<E> next;

        public MyNode(E value, MyNode<E> prev, MyNode<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
