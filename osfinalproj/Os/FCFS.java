package Os;

/***
 * ************************GROUP MEMBERS*********************
 * ****NAMES********************CMS-IDS
 * AISHA NAZ 	: 021-19-0004
 * ANUSHA 	: 021-19-0010
 * AQSA MAJEED 	: 021-19-0014
 * MADIHA 	: 021-19-0001 
 * NIMARTA DEVI : 021-19-0035
 * **********************************************************
 */

import java.lang.Thread;
import java.util.*;

public class FCFS extends Thread{
	int num_process;
	int burst[];
	int arrival_time[];
	int wait[];
	int turnaround[]; 
	//float throughput;
        int total_wait, total_turnaround, total_burst;
        static float throughput=0.0f;
    	static float t2 = 0.0f;
    	static float t3 = 0.0f;
    	static float t4 = 0.0f;
    	FCFS(int num_process)
    	{
    		this.num_process = num_process;
    		burst = new int[num_process];
    		arrival_time = new int[num_process];
    		wait = new int[num_process];
    		turnaround = new int[num_process];
    		throughput = 0;
                    total_turnaround = total_burst = total_wait = 0;  
                    start();
            }
	void generateprocess()
	{
		 for(int i = 0; i < num_process; i++)
         {
		burst[i] = (int)(Math.random() * 10);
		arrival_time[i] = (int)(Math.random() * 15);
		turnaround[i] = burst[i] + wait[i];
             total_burst = total_burst + burst[i];
		                
         }
         wait[0]= 0;
         for(int i = 1; i < num_process; i++)
         {
             wait[i] = wait[i-1] + burst[i];
             total_wait = total_wait + wait[i];
             total_turnaround = wait[i] + burst[i];
         }
            
            throughput = (float)(num_process)/(float)(total_wait);
            
            t2=  total_burst/num_process;
            t3= total_wait/num_process;
           t4= total_turnaround/num_process;
	}
	
	
                
	
	public float getThroughput()
	{
		
		return throughput;
	}
	public float getBurstTime()
	{
		
		return t2;
	}
	public float getWaitTime()
	{
		
		return t3;
	}
	public float getTurnAroundTime()
	{
		
		return t4;
	}
	
	
	public void setThroughput(float t)
	{
		
		this.throughput=t;
	}
	public void setBurstTime(float t)
	{
		
		this.t2=t;
	}
	public void setWaitTime(float t)
	{
		
		this.t3=t;
	}
	public void setTurnAroundTime(float t)
	{
		
		this.t4=t;
	}
	public static void main(String[] args) {
		//FCFS f = new FCFS(10);
               
	}

}
