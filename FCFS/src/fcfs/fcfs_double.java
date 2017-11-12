package fcfs;

import java.util.*;

public class fcfs_double {
	public List<task> fcfs(List<task> list){
		int weightTurnAroundTime[]={0,0};		
		int turnAroundTime[]={0,0};
		int finishingTime[]={0,0};
		int startingTime[]={0,0};
		int serviceTime[]={0,0};
		int arrivalTime[]={0,0};
		int taskID[]={0,0};
		task t1 = new task();				
		task t2 = new task();				
		int i=0;							
		int s1=-1;							
		int s2=-1;
		Queue<task> queue=new LinkedList<task>();	
		for(int time=0;;time++){
			
			if (i<list.size()){			
				queue.offer(list.get(i));
			}
			if (queue.peek()==null){	
				if (s1<0){
					if (s2<0){			
						break;
					}
				}
				if (s2<0){
					if (s1<0){
						break;
					}
				}
			}
			if (taskID[0]==0){				
				if (queue.peek()!=null){		
					t1=new task();
					t1=(task)queue.poll();		
					taskID[0]=t1.getTaskID();
					arrivalTime[0]=t1.getArrivalTime();
					serviceTime[0]=t1.getServiceTime();
					startingTime[0]=time;
					s1=serviceTime[0];
					
				}
				else{
					
				}
			}
			else if (s1==0){			
				
				finishingTime[0]=time;
				turnAroundTime[0]=finishingTime[0]-arrivalTime[0];
				weightTurnAroundTime[0]=turnAroundTime[0]/serviceTime[0];
				t1.setStartingTime(startingTime[0]);
				t1.setFinishingTime(finishingTime[0]);
				t1.setTurnAroundTime(turnAroundTime[0]);
				t1.setWeightTurnAroundTime(weightTurnAroundTime[0]);
				list.set(taskID[0]-1,t1);
				taskID[0]=0;
			}
			else{
				
			}
			
			
			
			
			
			if (taskID[1]==0){
				if (queue.peek()!=null){
					t2=new task();
					t2=queue.poll();
					taskID[1]=t2.getTaskID();
					arrivalTime[1]=t2.getArrivalTime();
					serviceTime[1]=t2.getServiceTime();
					startingTime[1]=time;
					s2=serviceTime[1];
					
				}
			}
			else if (s2==0){
				
				finishingTime[1]=time;
				turnAroundTime[1]=finishingTime[1]-arrivalTime[1];
				weightTurnAroundTime[1]=turnAroundTime[1]/serviceTime[1];
				t2.setStartingTime(startingTime[1]);
				t2.setFinishingTime(finishingTime[1]);
				t2.setTurnAroundTime(turnAroundTime[1]);
				t2.setWeightTurnAroundTime(weightTurnAroundTime[1]);
				list.set(taskID[1]-1,t2);
				taskID[1]=0;
			}
			if (i<list.size()){
				i++;
			}
			
			s1--;
			s2--;
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
