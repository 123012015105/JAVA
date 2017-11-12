package fcfs;

import java.util.*;

public class fcfs_single {
	public List<task> fcfs(List<task> list){
		int weightTurnAroundTime=0;  
		int turnAroundTime=0;        
		int finishingTime=0;		 
		int startingTime=0;			 
		int serviceTime=0;			 
		int arrivalTime=0;			
		int taskID=0;				 
		task t = new task();		 
		int i=0;					
		int j=0;					 
		int s=0;					 
		for(int time=0;j<list.size();time++){
			if (taskID==0){          
				t=new task();  
				t=list.get(j);       
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
				j++;			
			}
			else{				
			}
			if (i<list.size()){			
				i++;
			}
			s--;		
		}
		return list;
	}
	public void printList(List<task> list){		
		task t=new task();
		System.out.println("任务编号\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间\t带权周转时间");
		for(int i=0;i<list.size();i++){
			t=list.get(i);
			System.out.println(t.getTaskID()+"\t"+t.getArrivalTime()+"\t"+t.getServiceTime()+"\t"+
			t.getStartingTime()+"\t"+t.getFinishingTime()+"\t"+t.getTurnAroundTime()+"\t"+t.getWeightTurnAroundTime());
		}
	}
}
