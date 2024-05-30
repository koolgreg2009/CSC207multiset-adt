public abstract class Multiset {
    public abstract boolean add(Object item);
    public abstract void remove(Object item);
    public abstract boolean contains(Object item);
    public abstract boolean is_empty();
    public abstract int count(Object item);
    public abstract int size();
}
