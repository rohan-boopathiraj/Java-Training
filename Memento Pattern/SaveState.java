package Memento;

import java.util.Stack;

/**
 * <p>
 * The SaveState class is used to keep track the states. It has a method called
 * saveState which saves the current state and a method called restoreState
 * where we can go back to the previous state and a method called getState which
 * will return the current state
 * </p>
 */

class SaveState {
	private String state;
	private final Stack<Memento> mementoStack = new Stack<>();

	public void setState(String state) {
		this.state = state;
		saveState();
	}

	public String getState() {
		return state;
	}

	public void saveState() {
		mementoStack.push(new Memento(state));
	}

	public void restoreState() throws Exception {
		if (!mementoStack.isEmpty()) {
			state = mementoStack.pop().getState();
		}
		else {
			throw new Exception("No more state to restore");
		}
	}
}
