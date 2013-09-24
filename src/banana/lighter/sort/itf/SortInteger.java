package banana.lighter.sort.itf;

import java.util.LinkedList;

public interface SortInteger {

	/**
	 * from min to max
	 * @param toSort
	 * @return
	 */
	public LinkedList<Integer> sort(LinkedList<Integer> toSort);

}