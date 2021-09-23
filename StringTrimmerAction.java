
public class StringTrimmerAction {
	Command useTrimmer;
	
	public StringTrimmerAction() {
		
	}
	public void setCommand(Command command) {
		useTrimmer=command;
	}
	public void usingTrimmer() {
		useTrimmer.execute();
	}	

}
