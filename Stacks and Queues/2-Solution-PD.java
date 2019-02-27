public class StacksInterviewQuestions {
	
	private int[] arr;
	private int min;
	private int size;
	
	public StacksInterviewQuestions() {
		arr = new int[10];
		size = 0;
		min = Integer.MAX_VALUE;
	}
	
	public void push(int x) {
		arr[size] = x;
		size++;
		
		if(x < min)
			min = x;
		
		if(size >= arr.length/2) {
			int[] nArr = new int[2*arr.length];
			
			for(int i=0;i<size;i++)
				nArr[i] = arr[i];
			
			arr = nArr;
		}
	}
	
	public void pop() {
		size--;
	}
	
	public int min() {
		return min;
	}
	
	public void show() {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" | ");
	}
}
