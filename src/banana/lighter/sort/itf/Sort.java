package banana.lighter.sort.itf;

import java.util.LinkedList;

public interface Sort {

	/**
	 * from min to max
	 * @param toSort
	 * @return
	 */
	public abstract LinkedList<Integer> sort(LinkedList<Integer> toSort);

}