public class PsychiatristObject{
	public void examine(MoodyObject moodyObject){
		System.out.println("How are you feeling today?");
		System.out.println(moodyObject.getMood() + "\n");
	}

	public void observe(MoodyObject moodyObject){
		moodyObject.expressFeelings();
		System.out.println("Observation: " + moodyObject.toString() + "\n");
	}

}