package genericsExercises.IteratorsAndComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String>{

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
    }

    public boolean move() {
        if (iterator().hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public void print() {
        validatePrint();
        System.out.println(this.data.get(index));
    }

    public void printAll(){
        validatePrint();
        this.data.forEach(e-> System.out.print(e + " "));
    }

    private void validatePrint() {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return index < data.size() - 1;
            }

            @Override
            public String next() {
                String element = data.get(index);
                index++;
                return element;
            }
        };
    }
}
