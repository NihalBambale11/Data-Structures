package Hashing;

import java.util.LinkedList;

public class HashTable {

	static class Pair {
		private int key;
		private String value;

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
	}

	private static final int SLOTS = 10;
	private LinkedList<Pair> table[];

	public int hash(int key) {
		return key % SLOTS;
	}

	public HashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) {
			table[i] = new LinkedList<>();
		}
	}

	public void put(int key, String value) {
		int slot = hash(key);
		LinkedList<Pair> bucket = table[slot];
		for(Pair pair : bucket) {
			if(key == pair.key) {
				pair.value = value;
				return;
			}
		}
		Pair p  = new Pair(key,value);
		bucket.add(p);
		System.out.println(p);
	}

	public String get(int key) {

		// find slot for given key using hash Function
		int slot = hash(key);

		// access the bucket (linked list) in that slot;
		LinkedList<Pair> bucket = table[slot];

		// find the element (key value int he buckets)
		for(Pair p : bucket) {
			if(key == p.key) {
				return p.value;
			}
		}
		 return null;

	}

}
