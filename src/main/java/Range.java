
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Range{
    private Long[] elements;

    public Range(int from, int to){
        elements = new Long[to - from + 1];
        for (int i = from; i <= to; i ++){
            elements[i - from] = (long) i;
        }
    }

    public long getLowerBound(){
        return elements[0];
    }

    public long getUpperBound(){
        return elements[elements.length - 1];
    }

    public boolean isConcurrent(Range other){
        return getUpperBound() == other.getUpperBound() &&
                getLowerBound() == other.getLowerBound();
    }

    public boolean isBefore(Range other){
        return getUpperBound() < other.getLowerBound();
    }

    public boolean isAfter(Range other){
        return getLowerBound() > other.getUpperBound();
    }

    public boolean contains(long val){
        return val >= getLowerBound() &&
                val <= getUpperBound();
    }

    public List<Long> asList(){
        return Arrays.asList(elements);
    }

    public Iterator<Long> asIterator(){
        return asList().iterator();
    }

}
