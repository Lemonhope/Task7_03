package Task7_03;

public interface List<T>{
    int size();
    void add(final T data);
    void add(final int index, final T data);
    void remove(T data);
    void remove(int index);
    void insertHead(T data);
}
