package Lesson7;

public class MyTable {
	private Entry[] entries;
	private final int iCodeStart = 97;//a
	private final int iMaxSize = 26;
	
	
	public MyTable() {
		super();
		this.entries = new Entry[26];
	}
	private int calculateIndex(char ch) {
		ch = Character.toLowerCase(ch); 
		return (int)ch - iCodeStart;
		
	}
	// returns the String that is matched with char c in the table
	public String get(char c) {
		int index = calculateIndex(c);
		
		if (index <0 || index > 25) return null;
		if (entries[index] !=null)
			return entries[index].content;
		else
			return "Item not found";
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		
		int index = calculateIndex(c);
		entries[index] = new Entry(c,s);
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		String str = "";
		
		for(Entry e: entries) {
			if (e != null) str += "\n" + e.toString();
		}
		
		return str;
	}

	private class Entry {
		char key;
		String content;
		
		Entry(char ch, String str) {
			key = Character.toLowerCase(ch);
			content = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			
			return key +"->"+ content;
		}
	}
	
	public static void main(String[] a) {
		MyTable mytable = new MyTable();
		
		 mytable.add('a', "Andrew");
		 mytable.add('b', "Billy");
		 mytable.add('c', "Charlie");
		 mytable.add('f', "Faltima");
		 mytable.add('w', "Willie");
		 
		 System.out.println("Entry list: \n"+mytable.toString()+"\n");
		 
		 System.out.println("Search for \'b\': ");
		 
		 String s = mytable.get('b');
		 System.out.println(s);
	}
	
}
