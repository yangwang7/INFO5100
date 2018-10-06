public class Reverse{
	String words[];

	public String reverse(String s){
		String words[] = s.trim().split("\\s++");

		for(int i=0; i<words.length/2; i++){
			String temp = words[i];
			words[i] = words[words.length-1-i];
			words[words.length-1-i] = temp;
		}

		StringBuffer sb = new StringBuffer();

		int length = words.length;
		for(int j=0; j<length-1; j++){
			//System.out.print(words[j]+" ");
			sb.append(words[j] + " ");
		}
		sb.append(words[length-1]);
		String s2 = sb.toString();

		return s2;
	}

	public static void main(String[] args){
		String s1 = "The sky is blue";
		Reverse r = new Reverse();
		String s2 = r.reverse(s1);
		System.out.print(s2);
	}
}