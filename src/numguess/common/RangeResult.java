package numguess.common;

/**
 * This bean is used to represent range results going back from the game to the user. 
 * It is an example of the ValueObject (TransferObject) pattern. 
 */

public class RangeResult implements Constants {

	private int min;
	private int max;

	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
}