package findSumOfValuesMoreThan;

public class Main {

	public static void main(String[] args) {
		TestFindSumOfValues t = new TestFindSumOfValues();
		t.mySet.add(12);
		t.mySet.add(13);
		t.mySet.add(2);
		t.mySet.add(1);
		t.mySet.add(7);
		t.findSumOfValuesMoreThan(10);

		TestFindSumOfValues z = new TestFindSumOfValues();
		z.mySet.add(12);
		z.mySet.add(13);
		z.mySet.add(2);
		z.mySet.add(1);
		z.mySet.add(7);
		z.findSumOfValuesMoreThan(13);
	}

}
