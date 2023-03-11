package generics;

public class MultipleClassName <E extends Number,T extends String>{
    private E element;
    private T name;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
