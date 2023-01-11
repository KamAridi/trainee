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
            grow();
        }
        array[counter++] = element;
    }

    @Override
    public void addAll(MyCollection<E> args) {
        Object[] array1 = args.toArray();
        while(capacity - counter - array1.length > 0){
            grow();
        }
        for (int i = 0; i < args.size(); i++) {
            array[counter + i] = array1[i];
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
    public Object[] toArray() {
        return this.array;
    }

    @Override
    public E get(int index) {
        if(index < capacity && index > 0) {
            return (E) array[index];
        }
        throw new RuntimeException();
    }

    private void grow() {
        Object[] array2 = new Object[(capacity = capacity * 2)];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
