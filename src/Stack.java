public class Stack<T> {

    private Element lastElement;

    private int size = 0;

    public int size(){
        return size;
    }

    public void push(T a) {
        lastElement = new Element(a, lastElement);
        size++;
    }

    public T peek() {
        return lastElement != null ? lastElement.value : null;
    }

    public T pop() {
        T result = peek();
        if (result != null) {
            lastElement = lastElement.backElement;
            size--;
        }
        return result;
    }

    public boolean isEmpty() {
        return lastElement == null;
    }

    public void clear(){
        lastElement = null;
        size = 0;
    }

    @Override
    public String toString() {
        String result = "";
        Element element = lastElement;
        while (element != null) {
            result += element.value + " ";
            element = element.backElement;
        }
        return result;
    }

    private class Element {
        T value;
        Element backElement;

        Element(T value, Element backElement) {
            this.value = value;
            this.backElement = backElement;
        }
    }
}