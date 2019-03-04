
public class MyQueue {

	private Stack s1;
	private Stack s2;
	
	public MyQueue() {
		s1 = new Stack();
		s2 = new Stack();
	}
	
	public void add(int x) {
		s1.push(x);
	}
	
	public int size() {
		return s1.size();
	}
	
	public int capacity() {
		return s1.capacity();
	}
	
	public int remove() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		
		int temp = -1;
		
		if(!s2.isEmpty()) {
			temp = s2.pop();
		}
		
		return temp;
	}
	
	public int top() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		
		int temp = -1;
		
		if(!s2.isEmpty()) {
			temp = s2.peek();
		}
		
		return temp;
	}
	
}
