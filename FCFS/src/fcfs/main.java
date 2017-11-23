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
		System.out.println("开始执行先来先服务单队列...");
			fcfs_single f=new fcfs_single();
			f.fcfs(list);
			f.printList(list);
		System.out.println("开始执行先来先服务双队列...");
			fcfs_double f1=new fcfs_double();
			f1.fcfs(list);
			f1.printList(list);
		System.out.println("详细结果见result文件夹");
	}
}
