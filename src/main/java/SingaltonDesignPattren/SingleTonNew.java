package SingaltonDesignPattren;

public class SingleTonNew {
	
	private static SingleTonNew instance;
	
	private String data;
	
	private SingleTonNew(String data) {
		this.data = data;
	}
	
	public static SingleTonNew createInstance(String data) {
		
		if(instance==null) {
		synchronized(SingleTonNew.class){
		if(instance==null) {
			
			instance = new SingleTonNew( data);
		}
		
		
	}
		
	}
		return instance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
