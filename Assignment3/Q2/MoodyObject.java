public abstract class MoodyObject{
	protected abstract String getMood();

	protected abstract void expressFeelings();

	public void queryMood(){
		System.out.println("I feel happy(or sad) today!");
	}
}