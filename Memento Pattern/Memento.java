package Memento;

/**
 * <p>
 * The Memento class is used to hold the state of the editor
 * </p>
 */
public class Memento {
	private final String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
