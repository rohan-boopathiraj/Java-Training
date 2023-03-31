package Memento;

/**
 * <p>The Memento pattern is a behavioral design pattern that allows an object's state to be saved and restored</p>
 * <p>Main class is used to set and restore the state of the editor. First we will setState and then we can restore the state if needed</p>
 * 
 * @author rohanboopathiraj
 */

public class Main {

	public static void main(String[] args) {
		SaveState state = new SaveState();

		state.setState("a");
		state.setState("b");
		state.setState("c");
		state.setState("d");
		state.setState("e");
		state.setState("f");
		
		try {

		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());
		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());
		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());

		state.restoreState();
		System.out.println(state.getState());
		
		state.restoreState();
		System.out.println(state.getState());
		
		state.restoreState();
		System.out.println(state.getState());
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
