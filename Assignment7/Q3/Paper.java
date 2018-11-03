public class Paper extends Tool{
	Paper(int strength){
		super(strength, 'p');
	}
	
	public boolean fight(Tool tool){
		if(tool instanceof Rock){
			return strength * 2 > tool.strength;
		}else if(tool instanceof Scissors){
			return strength / 2 > tool.strength;
		}else{
			return strength > tool.strength;
		}
	}
}