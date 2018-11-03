public class Rock extends Tool{
	Rock(int strength){
		super(strength, 'r');
	}

	public boolean fight(Tool tool){
		if(tool instanceof Scissors){
			return strength * 2 > tool.strength;
		}else if(tool instanceof Paper){
			return strength / 2 > tool.strength;
		}else{
			return strength > tool.strength;
		}
	}
}