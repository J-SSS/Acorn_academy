package ch02.ex03_Generic;

public interface MyList<T> {
	
	void add(T t);	
	void insert(int index, T t);
	
	T get(int index);
	int indexOf(T t);
	
	boolean remove(T t);	
	boolean remove(int index);
	
	int size();	
	void clear();
	boolean isEmpty();
	boolean contains(T t);
}
