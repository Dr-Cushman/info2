public class SelectionSort implements SortAlg {
	
	@Override
	public String name() {
		return "Selection sort";
	}

	@Override
	public void sort(SortArray a) {
		for (int i = 0; i < a.size() - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.size(); j++) {
				if (a.sorted(j, minIndex)) {
					minIndex = j;
				}
			}
			a.swap(i, minIndex);
		}
	}
}
