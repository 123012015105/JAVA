package sjf;

import java.io.IOException;
import java.util.*;


import sjf.sjf_double;
import sjf.sjf_single;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer=0;
		int reset=0;
		List<task> list = new ArrayList<task>();
		String FilePath="./demo/demo.txt";
		read_data rd = new read_data();
		list=rd.read(FilePath);
		System.out.println("��ʼִ�ж���ҵ���ȵ�����...");
		sjf_single f=new sjf_single();
		f.sjf(list);
		f.printList(list);
		System.out.println("��ʼִ�ж���ҵ����˫����...");
		sjf_double f1=new sjf_double();
		f1.fcfs(list);
		f1.printList(list);
		System.out.println("��ϸ�����result�ļ���");
	}
}
