package test_public;

public class test {
	private int i=0;
	public int a=1;
	public void t_public(){
		System.out.println("public: "+a);
	}
	public void t_private(){
		System.out.println("private: "+i);
	}
	protected void t_protected(){
		System.out.println("protected");
	}
	void t_default(){
		System.out.println("default");
	}
}
