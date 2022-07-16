package org.learnjava;
import java.util.List;

public abstract class nonImplementedMethods<E> implements  List<E> {
    public Object[] toArray() {
        throw new methodNonImplementedException();
    }
    public <T1> T1[] toArray(T1[]a) {
        throw new methodNonImplementedException();
    }
}
