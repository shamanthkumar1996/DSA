package Test1;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "My name is abcdz";
		
		char[] ch = s1.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			
			ch[i] = (char) (ch[i] + 1);
			
			System.out.println(ch[i]);
		}

	}

}
