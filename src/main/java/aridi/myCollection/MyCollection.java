package aridi.myCollection;

public interface MyCollection<E> extends MyIterator {
    void add(E element);
    void addAll(MyCollection<E> args);
    E remove(int index);
    int size();
}
