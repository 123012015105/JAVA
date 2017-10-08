package test_public;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		System.out.println("public data : "+t.a);
		t.t_protected();
		t.t_default();
		t.t_private();
		t.t_public();
	}

}
