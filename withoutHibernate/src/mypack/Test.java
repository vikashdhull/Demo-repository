package mypack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.setId(6);
		 e.setName("sandeep");
		 e.setCmpname("truck private ltd.");
		 	
		Operation o = new Operation();
		o.save(e);
	}

}
