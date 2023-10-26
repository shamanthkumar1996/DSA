package USt;

public class Test {

	public static void main(String[] args) {
		
		//sachine scores 6 runs in 12 balls
		
		String st1 = "sachine scores 6 runs in 12 balls";
		
		String str = st1.replaceAll("[^0-9]", " ");
		
		//st1.replaceAll(0, 0)
		
		str = str.replaceAll(" +", " ");
		
		String[] res = str.split(" ");
		
		int v1 = Integer.parseInt(res[1].trim());
		
		int v2 = Integer.parseInt(res[2].trim());
		
		System.out.println(v1*v2);
		

	}

}
