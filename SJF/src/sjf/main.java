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
		System.out.println("开始执行短作业优先单队列...");
		sjf_single f=new sjf_single();
		f.sjf(list);
		f.printList(list);
		System.out.println("开始执行短作业优先双队列...");
		sjf_double f1=new sjf_double();
		f1.fcfs(list);
		f1.printList(list);
		System.out.println("详细结果见result文件夹");
	}
}
