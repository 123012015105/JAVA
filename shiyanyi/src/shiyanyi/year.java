package shiyanyi;

public class year {
	public void number(){
		System.out.println("Êä³öÈòÄê£º");
	int yearstart=1990;
	int yearend=2007;
	int year=0;
	for(int i=yearstart;i<yearend;i++){
		if(year==2){
			System.out.print("\n");
			year=0;
		}
		if((i%4==0 && i%100!=0) || i%400==0){
			System.out.print(i+" ");
			i++;
			year++;
		}
		else{
			i++;
			continue;
		}
		
	}

	}
	
}
