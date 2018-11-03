public class Scissors extends Tool{
	Scissors(int strength){
		super(strength, 's');
	}
	
	public boolean fight(Tool tool){
		if(tool instanceof Paper){
			return strength * 2 > tool.strength;
		}else if(tool instanceof Rock){
			return strength / 2 > tool.strength;
		}else{
			return strength > tool.strength;
		}
	}
}