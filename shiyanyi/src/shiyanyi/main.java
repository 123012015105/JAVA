package shiyanyi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.判断闰年：");
		year y=new year();
		y.number();
		
		System.out.println("2.成绩转化：");
		score s=new score();
		s.ToGradeScore();
		
		System.out.println("3.画图");
		Print p=new Print();
		p.new_print();
		
		System.out.println("4.水仙花");
		flower f=new flower();
		f.Flower();
	}
}

