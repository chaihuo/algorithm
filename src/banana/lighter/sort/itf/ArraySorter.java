package banana.lighter.sort.itf;

import java.util.Comparator;

public interface ArraySorter {

	public <E> void sort(E[] array, Comparator<? super E> cmp);
}
