public interface Stack {

    void push(Object item);
    Object pop() throws MyEmtyStackException;
    void peek();
    boolean isEmpty();


}
