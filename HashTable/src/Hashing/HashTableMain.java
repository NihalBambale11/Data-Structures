package Hashing;

import java.util.Scanner;

public class HashTableMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashTable hash = new HashTable();
		
		hash.put(1, "Optimus Prime");
		hash.put(6, "BulkHead");
		hash.put(8, "Arcee");
		hash.put(10, "UltraMagnus");
		hash.put(25, "WillJack");
		hash.put(44, "BumbleBee");
		hash.put(88, "Rachet");
		hash.put(14, "SmokeScream");
		hash.put(23, "Lord Megatron");
		
		System.out.println("Enter the key to get the value");
		int roll = scan.nextInt();
		String name = hash.get(roll);
		System.out.println("Name found : "+name);
	}
	
}
