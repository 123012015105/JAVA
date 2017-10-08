package qiaokeli;

public class chocolateBoiled {
private static chocolateBoiled c=null;
private boolean empty;
private boolean boiled;
chocolateBoiled() {
	empty=true;
	boiled=false;
}
public static chocolateBoiled getchocolate() {
	if(c==null) {
		c=new chocolateBoiled();
	}
	return c;
}
public void fill() {
	if(empty==true) {
		System.out.println("Fill the mix");
		empty=false;
	}
	else {
		System.out.println("full");
	}
}
public void boil() {
	if(empty==false && boiled==false) {
		System.out.println("boil the mix");
		boiled=true;
	}
	else if(empty==true) {
		System.out.println("nothing");
	}
	else if(empty==false && boiled==true)
		System.out.println("boiled");
}
public void drain() {
	if(empty==false && boiled==true) {
		System.out.println("Draining");
		empty=true;
		boiled=false;
	}
	else if(empty==true) {
		System.out.println("nothing");
	}
	else if(empty==false && boiled==false) {
		System.out.println("boil the mix");
	}
}
public static void main(String args[]) {
	chocolateBoiled c=getchocolate();
	c.fill();
	c.boil();
	c.drain();
}
}
