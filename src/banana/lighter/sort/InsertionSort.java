package banana.lighter.sort;

import java.util.Arrays;
import java.util.LinkedList;

import banana.lighter.sort.itf.SortInteger;

public class InsertionSort implements SortInteger {
	
	@Override
	public LinkedList<Integer> sort(LinkedList<Integer> toSort) {
		LinkedList<Integer> sorted = new LinkedList<Integer>();
		if (!toSort.isEmpty()) {
			sorted.addFirst(toSort.getFirst());
			toSort.removeFirst();
		}
		if (!toSort.isEmpty()) {
			for (Integer toInsert : toSort) {
				int index = 0;
				for (Integer item : sorted) {
					if (item >= toInsert && (index < sorted.size())) {
						sorted.add(index, toInsert);
						break;
					} else if (item < toInsert && index + 1 == sorted.size()) {
						sorted.addLast(toInsert);
						break;
					} else {
						index++;
						continue;
					}
				}
			}
		}
		return sorted;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> toSort = new LinkedList<Integer>();
		LinkedList<Integer> sorted = new LinkedList<Integer>();
		Integer[] intToSort = {7, 3, 2, 1, 4, 5, 9, 0, 8, 6};
		toSort.addAll(Arrays.asList(intToSort));
		InsertionSort is = new InsertionSort();
		sorted = is.sort(toSort);
		
		for (Integer item : sorted) {
			System.out.print(item);
		}
		
	}
	
}
