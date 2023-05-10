package creational.singleton;

public class Principal {
	public static void main (String [] args) {
		for(int i = 0 ; i < 1000; i++) {
			Unica objUnica = Unica.getInstance();
			System.out.println(objUnica);
		}
	}

}
