
public class InsufficientProductException extends Exception {
	private Integer remainder;

	public Integer getRemainder() {
		return remainder;
	}

	public void setRemainder(Integer remainder) {
		this.remainder = remainder;
	}

	public InsufficientProductException(String message,Integer remainder) {
		super(message);
		this.remainder=remainder;
		
	}
	
}
