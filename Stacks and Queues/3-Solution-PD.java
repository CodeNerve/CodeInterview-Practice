import java.util.ArrayList;

public class SetOfStacks {
	
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	private Stack mainStack;
	private int count;
	
	public SetOfStacks() {
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		Stack s3 = new Stack();
		Stack s4 = new Stack();
		Stack s5 = new Stack();
		
		stacks.add(s1);
		stacks.add(s2);
		stacks.add(s3);
		stacks.add(s4);
		stacks.add(s5);
		
		mainStack = s1;
		count = 0;
	}
	
	public void push(int x) {
		if(mainStack.size() >= mainStack.capacity()) {
			count++;
			mainStack = stacks.get(count);
		}
		
		mainStack.push(x);
	}
	
	public void pop() {
		mainStack.pop();
		
		mainStack.show();
	}
	
	public void popAt(int n) {
		if(mainStack.size() < n)
			return;
		
		int[] arr = mainStack.array();
		int[] nArr = new int[arr.length];
		
		for(int i=0;i<n;i++) {
			nArr[i] = arr[i];
		}
		
		for(int i=n+1;i<arr.length;i++) {
			nArr[i-1] = arr[i];
		}
		
		mainStack.setArray(nArr);
		mainStack.show();
	}
}
