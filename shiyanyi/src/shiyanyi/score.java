package shiyanyi;
import java.util.Scanner;
public class score {
	public void ToGradeScore(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("������ɼ�(����-1�������ɼ�¼�룡):");
		for(int i=0;i!=-1;i++){
			int s=sc.nextInt();//
			if(s>=90 && s<=100)
				System.out.println("��");
			else if(s>=80 && s<=89)
				System.out.println("��");
			else if(s>=70 && s<=79)
				System.out.println("��");
			else if(s>=60 && s<=69)
				System.out.println("����");
			else if(s==-1)
				break;
			else 
				System.out.println("������");
		}
	}

}
