public class SortedStack {
	
	private Stack stack;
	
	public void push(int x) {
		stack.push(x);
	}
	
	public void show() {
		stack.show();
	}
	
	public int pop() {
		return stack.pop();
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public int min() {
		return stack.min();
	}
	
	public SortedStack() {
		stack = new Stack();
	}
	
	public void sort() {
		Stack s = new Stack();
		
		while(!stack.isEmpty()) {
			int num = stack.pop();
			
			while(!s.isEmpty() && s.peek() > num) {
				stack.push(s.pop());
			}
			
			s.push(num);
		}
		
		stack = s;
	}
}
