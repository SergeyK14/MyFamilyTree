package Project_MyFamilyTree;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortHuman implements Iterable<Human>{
    private List<Human> humans;

    @Override
    public Iterator<Human> iterator() {
        return humans.iterator();
    }

    public void sortByName(){
        humans.sort(new HumanComparatorByName());
    }
}
