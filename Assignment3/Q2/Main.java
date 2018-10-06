public class Main{
	public static void main(String[] args){
		PsychiatristObject p = new PsychiatristObject();
		HappyObject h = new HappyObject();
		SadObject s = new SadObject();
		p.examine(h);
		p.observe(h);
		p.examine(s);
		p.observe(s);
	}
}