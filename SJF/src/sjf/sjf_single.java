package sjf;

import java.util.*;

public class sjf_single {
	public List<task> sjf(List<task> list){
		List<task> l=new ArrayList<task>();
		int result=0;
		int weightTurnAroundTime=0;  
		int turnAroundTime=0;        
		int finishingTime=0;		 
		int startingTime=0;			 
		int serviceTime=0;			 
		int arrivalTime=0;			
		int taskID=0;				 
		task t = new task();		 
		int i=0;					 
		int s=0;					 
		int number=0;
		l.add(list.get(i));
		
		for(int time=0;number<list.size();time++){
			if (taskID==0){         
				t=new task();  
				result=judge(l);
				delete(l,result);
				t=list.get(result-1);       
				taskID=t.getTaskID();
				arrivalTime=t.getArrivalTime();
				serviceTime=t.getServiceTime();
				startingTime=time;
				s=serviceTime;
				
			}
			else if (s==0){        
				
				finishingTime=time;			
				turnAroundTime=finishingTime-arrivalTime;
				weightTurnAroundTime=turnAroundTime/serviceTime;
				t.setStartingTime(startingTime);
				t.setFinishingTime(finishingTime);
				t.setTurnAroundTime(turnAroundTime);
				t.setWeightTurnAroundTime(weightTurnAroundTime);
				list.set(taskID-1,t);
				taskID=0;		
				number++;
			}
			else{				
				
			}
			if (i<list.size()){			//若任务还未全部到达，i++表示到达任务下标后移一位
				i++;
			}
			if (i<list.size()){
				l.add(list.get(i));
			}
			s--;		//当前任务服务时间减少1
		}
		return list;
	}
	public void delete(List<task> list,int taskID){
		for (int i=0;i<list.size();i++){
			 if (list.get(i).getTaskID()==taskID){
				 list.remove(i);
			 }
		}
	}
	public int judge(List<task> list){
		int	[] result=new int[100];
		int shortest=100000;
		int number=0;
		int n=0;
		int first=100000;
		for(int i=0;i<list.size();i++){
			if (list.get(i).getServiceTime()<shortest){
				shortest=list.get(i).getServiceTime();
			}
		}
		for (int j=0;j<list.size();j++){
			if (list.get(j).getServiceTime()==shortest){
				result[number]=list.get(j).getTaskID();
				if (first>list.get(j).getArrivalTime()){
					first=list.get(j).getArrivalTime();
					n=number;
				}
				number++;
			}
		}
		return result[n];			//返回任务编号
	}
	public void printList(List<task> list){		//打印输出各任务的属性
		task t=new task();
		System.out.println("任务编号\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间\t带权周转时间");
		for(int i=0;i<list.size();i++){
			t=list.get(i);
			System.out.println(t.getTaskID()+"\t"+t.getArrivalTime()+"\t"+t.getServiceTime()+"\t"+
			t.getStartingTime()+"\t"+t.getFinishingTime()+"\t"+t.getTurnAroundTime()+"\t"+t.getWeightTurnAroundTime());
		}
	}
}
