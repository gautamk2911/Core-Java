package collectionsInJava;

import java.util.Stack;

class Author{
	String name;
	int count;
	public Author(String name, int count) {
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", count=" + count + "]";
	}
	
	
}

class CatalogBooks{
	String author;
	int count;
	public CatalogBooks(String author, int count) {
		this.author = author;
		this.count = count;
	}
	public int countBooks() {
		
		return count;
	}
	
	@Override
	public String toString() {
		return "CatalogBooks [author=" + author + ", count=" + count + "]";
	}
	
	
}
public class StackOfBooks {
	public static void main(String[] args) {
		Stack<Author> books = new Stack<Author>(); 
		books.add(Author new ("John",2));
	}
}
