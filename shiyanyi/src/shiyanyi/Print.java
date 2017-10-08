package shiyanyi;

public class Print {
	public void new_print(){
		int num=7;
		for (int i=1;i<=num;i=i+2){
			for (int j=1;j<=(7-i)/2;j++){
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		num-=2;
		for (int z=num;z>=1;z=z-2){
			for (int j=(7-z)/2;j>=1;j--){
				System.out.print(" ");
			}
			for (int k=1;k<=z;k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
