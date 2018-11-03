
public class MyIndexOutOfBoundException extends Exception {
	int lowerBound, upperBound, index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index){
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString(){
		return "Error Message: Index: " + index 
				+ ", but Lower bound: " + lowerBound 
				+ ", Upper bound: " + upperBound;
	}
	
	public boolean outOfBound(){
		if(index < lowerBound || index > upperBound){ 
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) throws MyIndexOutOfBoundException {
		MyIndexOutOfBoundException e = new MyIndexOutOfBoundException(0, 9, 10);
		if(e.outOfBound()){
			throw e;
		}
	}

}
