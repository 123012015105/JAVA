package fcfs;

import java.io.IOException;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer=0;
		int reset=0;
		List<task> list = new ArrayList<task>();
		String FilePath="./demo/input.txt";
		read_data rd = new read_data();
		list=rd.read(FilePath);
		System.out.println("��ʼִ�������ȷ��񵥶���...");
			fcfs_single f=new fcfs_single();
			f.fcfs(list);
			f.printList(list);
		System.out.println("��ʼִ�������ȷ���˫����...");
			fcfs_double f1=new fcfs_double();
			f1.fcfs(list);
			f1.printList(list);
		System.out.println("��ϸ�����result�ļ���");
	}
}
