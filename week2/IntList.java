// John McBride - 61b
// Creating an arbitrary integer list
// Week 2 - 2.1

public class IntList {
	public int first;
	public IntList rest;

	// Recursive solution
	// Returns the size of the list using recursion
	public int size() {

		// Base case - list is one full
		if(rest == null) {
			return 1;
		}

		// Recursive call - get the previous sizes 
		// up the the base case
		return 1 + this.rest.size();
	}

	// Iterative solution
	// Goes through the int list and gets the size
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;

		// Iterate through the list
		while(p != null) {
			totalSize += 1;
			p = p.rest;
		}

		return totalSize;
	}

	// Recursive solution
	// Returns the ith item of the IntList
	// No error checking, just goes through and returns the list
	public int get(int i) {
		// base case
		if(first == 0) {
			return first;
		}

		// recursive call
		return rest.get(i - 1);
	}

	public IntList(int f, IntList r) {
		first = f; 
		rest = r;
	}

	public static void main(String[] args) {
		IntList L = new intList(15, null);
		L = new IntList(10, L);
		L = new IntList(15, L);

		System.out.println(L.size());
		System.out.println(L.iterativeSize());
	}
}