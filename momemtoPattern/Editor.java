package momemtoPattern;

public class Editor {
	private String content;
	History history = new History();
	
//	public EditorState createState() {
//		return new EditorState(content);
//	}
	
	public void createState() {
		history.push(new EditorState(content).getContent());
	}
	
	public void restore(EditorState state) {
		content = state.getContent();
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
