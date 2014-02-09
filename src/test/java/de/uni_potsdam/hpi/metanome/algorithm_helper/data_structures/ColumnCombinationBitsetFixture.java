package de.uni_potsdam.hpi.metanome.algorithm_helper.data_structures;

import java.util.LinkedList;
import java.util.List;

public class ColumnCombinationBitsetFixture {

	public ColumnCombinationBitset getColumnCombination1() {
		ColumnCombinationBitset columnCombination1 = new ColumnCombinationBitset();
		
		for (int columnIndex : getSetBitList1()) {
			columnCombination1.addColumn(columnIndex);
		}
		
		return columnCombination1;
	}
	
	public ColumnCombinationBitset getColumnCombination2() {
		ColumnCombinationBitset columnCombination2 = new ColumnCombinationBitset();
		
		for (int columnIndex : getSetBitList2()) {
			columnCombination2.addColumn(columnIndex);
		}
		
		return columnCombination2;
	}
	
	public Integer[] getExpectedBits1() {		
		return convertToArray(getSetBitList1());
	}
	
	public Integer[] getExpectedClearedBits1() {
		return convertToArray(getClearedBitList1());
	}
	
	protected Integer[] convertToArray(List<Integer> integerList) {
		return integerList.toArray(new Integer[integerList.size()]);
	}
	
	protected List<Integer> getSetBitList1() {
		List<Integer> setBits1 = new LinkedList<Integer>();
		
		setBits1.add(0);
		setBits1.add(2);
		setBits1.add(3);
		setBits1.add(4);
		
		return setBits1;
	}
	
	protected List<Integer> getClearedBitList1() {
		List<Integer> clearedBits1 = new LinkedList<Integer>();
		
		clearedBits1.add(1);
		clearedBits1.add(5);
		clearedBits1.add(6);
		
		return clearedBits1;
	}
	
	public ColumnCombinationBitset[] getExpectedSubsetArray1() {

        return new ColumnCombinationBitset[]{
                new ColumnCombinationBitset(0, 2, 3),
                new ColumnCombinationBitset(0, 2, 4),
                new ColumnCombinationBitset(0, 3, 4),
                new ColumnCombinationBitset(2, 3, 4),
                new ColumnCombinationBitset(0, 2),
                new ColumnCombinationBitset(0, 3),
                new ColumnCombinationBitset(0, 4),
                new ColumnCombinationBitset(2, 3),
                new ColumnCombinationBitset(2, 4),
                new ColumnCombinationBitset(3, 4),
                new ColumnCombinationBitset(0),
                new ColumnCombinationBitset(2),
                new ColumnCombinationBitset(3),
                new ColumnCombinationBitset(4),
                new ColumnCombinationBitset()};
	}
	
	public ColumnCombinationBitset getExpectedSupersetOfColumn1() {
		// 012345678
		// 111110011
		return new ColumnCombinationBitset(0, 1, 2, 3, 4, 7, 8);
	}
	
	public ColumnCombinationBitset[] getExpectedDirectSupersetsColumnCombinationBitset() {
        return new ColumnCombinationBitset[]{
                new ColumnCombinationBitset(0, 1, 2, 3, 4),
                new ColumnCombinationBitset(0, 2, 3, 4, 7),
                new ColumnCombinationBitset(0, 2, 3, 4, 8)};
	}
	
	protected List<Integer> getSetBitList2() {
		List<Integer> setBits2 = new LinkedList<Integer>();
		
		setBits2.add(1);
		setBits2.add(4);
		setBits2.add(842);
		
		return setBits2;
	}
	
	public ColumnCombinationBitset getExpectedUnionColumnCombination() {
		ColumnCombinationBitset unionColumnCombination = new ColumnCombinationBitset();
		
		for (int columnIndex : getSetBitList1()) {
			unionColumnCombination.addColumn(columnIndex);
		}
		
		for (int columnIndex : getSetBitList2()) {
			unionColumnCombination.addColumn(columnIndex);
		}
		
		return unionColumnCombination;
	}
	
	public ColumnCombinationBitset getExpectedIntersectionColumnCombination() {
		return new ColumnCombinationBitset(4);
	}
	
	public ColumnCombinationBitset[] getExpectedOneColumnCombinations1() {
		List<ColumnCombinationBitset> oneColumnCombinations = new LinkedList<ColumnCombinationBitset>();
		
		for (int columnIndex : getSetBitList1()) {
			oneColumnCombinations.add(new ColumnCombinationBitset(columnIndex));
		}
		
		return oneColumnCombinations.toArray(new ColumnCombinationBitset[oneColumnCombinations.size()]);
	}
	
	public int getMaxNumberOfColumns() {
		return 7;
	}
	
	public ColumnCombinationBitset[] getExpectedDirectSupersets1() {
        return new ColumnCombinationBitset[]{
                new ColumnCombinationBitset(0, 2, 3, 4, 1),
                new ColumnCombinationBitset(0, 2, 3, 4, 5),
                new ColumnCombinationBitset(0, 2, 3, 4, 6)};
	}
	
	public ColumnCombinationBitset[] getExpectedDirectSubsets1() {
        return new ColumnCombinationBitset[]{
                new ColumnCombinationBitset(2, 3, 4),
                new ColumnCombinationBitset(0, 3, 4),
                new ColumnCombinationBitset(0, 2, 4),
                new ColumnCombinationBitset(0, 2, 3)};
	}
	
	public int getExpectedSize1() {
		return getSetBitList1().size();
	}
}
