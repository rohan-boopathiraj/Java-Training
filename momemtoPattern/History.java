package momemtoPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class History {
	private Stack<EditorState> states = new Stack<EditorState>(); 
	
	public void push(EditorState state) {
		states.add(state);
	}
	
	public EditorState pop() {
		return states.pop();
//		int lastIndex = states.size() - 1;
//		EditorState lastState =  states.get(lastIndex);
//		states.remove(lastState);
//		return lastState;
	}
}
 