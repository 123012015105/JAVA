package pizza;

public class peperoniPizza extends pizza {
	public boolean prepare() {
		System.out.println("prepared");
		return true;
	}
	public boolean box() {
		System.out.println("boxed");
		return true;
	}
	public boolean bake() {
		System.out.println("baked");
		return true;
	}
	public boolean cut() {
		System.out.println("cuted");
		return true;
	}
}
