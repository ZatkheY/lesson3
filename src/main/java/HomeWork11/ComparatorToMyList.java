package HomeWork11;

import java.util.Comparator;

public class ComparatorToMyList implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        MyList first = (MyList) o1;
        MyList second = (MyList) o2;
        return compare(first,second);
    }
}

