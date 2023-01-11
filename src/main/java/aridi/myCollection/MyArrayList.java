package aridi.myCollection;

public class MyArrayList<E> implements MyList<E> {
    private Object[] array;
    private int counter = 0;
    private int capacity = 10;

    public MyArrayList(){
        array = new Object[capacity];
    }

    @Override
    public void add(E element) {
        if(counter == array.length){
            Object[] array2 = new Object[(capacity = capacity * 2)];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[counter++] = element;
    }

    @Override
    public void addAll(MyCollection<E> args) {
        if(capacity - counter - args.size() > 0){
            
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }
}
