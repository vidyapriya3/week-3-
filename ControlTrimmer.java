
public class ControlTrimmer {
	public static void main(String []args) {
		StringTrimmerAction trimmerAction=new StringTrimmerAction();
		StringTrimmerState trimmerState=new StringTrimmerState();
		trimmerAction.setCommand(trimmerState::trimmerON);
		trimmerAction.usingTrimmer();
		trimmerAction.setCommand(trimmerState::trimmerOFF);
		trimmerAction.usingTrimmer();
		trimmerAction.setCommand(trimmerState::Automatic);
		trimmerAction.usingTrimmer();
		trimmerAction.setCommand(trimmerState::Manual);
		trimmerAction.usingTrimmer();
		
		
	}

}
