package csc130.data.arraystack;

public class ArrayStack<E> implements StackADT<E>{

	private E[] stack;
	private int top;
	private final static int SIZE_LIMIT = 50;

	public ArrayStack() {
		this.stack = (E[]) new Object[SIZE_LIMIT];
		this.top = 0;
	}
	
	@Override
	public void push(E element) {
		if (this.size() == stack.length) {
		     doubleLimit();
		}
		stack[top] = element;
		top++;
	}
	
	private void doubleLimit() {
		@SuppressWarnings("unchecked")
		E[] doubled = (E[])(new Object[this.stack.length*2]);
		for (int i=0; i < this.stack.length; i++) {
			doubled[i] = this.stack[i];
		}
		this.stack = doubled;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			throw new RuntimeException("Not possible when stack is empty");
		}
		top--;
		E result = this.stack[this.top];
		this.stack[this.top] = null;
		return result;
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			throw new RuntimeException("Not possible when stack is empty");
		}
		return this.stack[this.top-1];
	}

	@Override
	public boolean isEmpty() {
		return this.top == 0;
	}

	@Override
	public int size() {
		return this.top;
	}
	
	@Override
	public String toString() {
		String elements = "[";
		for (int i = 0; i < this.top; i++) {
			if (i == this.top-1){
				elements += this.stack[i];
			}
			if (i < this.top-1) {
				elements += this.stack[i] + ", ";
			}
		}
		elements += "]";
		return elements;
	}

}
