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

import java.util.Random;
public class RoundRobbin 
{
	static float throughput=0.0f;
	static float t2 = 0.0f;
	static float t3 = 0.0f;
	static float t4 = 0.0f;
	
	static void turnAround_t(int no_of_p, int p[], int bursts[], int waitTime[], int turnAround[])
	{
		for(int i = 0; i < no_of_p; i++)
		{
			turnAround[i] = bursts[i] + waitTime[i];
		}
	}
	static int wait_t(int no_of_p, int p[], int bursts[], int waitTime[], int quantum)
	{
		int time = 0;
		int dec_bursts[] = new int [no_of_p];
		for(int i = 0; i < no_of_p; i++)
			dec_bursts[i] = bursts[i];
		
		while(true)
		{
			boolean flag = true;
			for(int i = 0; i < no_of_p; i++)
			{
				if(dec_bursts[i] > 0)
				{
					flag = false;
					if(dec_bursts[i] > quantum)
					{
						time = time + quantum;
						dec_bursts[i] = dec_bursts[i] - quantum;
					}
					else
					{
						time = time + dec_bursts[i];
						waitTime[i] = time - bursts[i];
						dec_bursts[i] = 0;
					}
				}
				
			}
			if(flag == true)
				return time;
		}
	}
	static void round_robbin(int no_of_p)
	{
		int processes[] = new int [no_of_p], bursts[] = new int [no_of_p], 
				turnAround[] = new int [no_of_p], waitTime[] = new int [no_of_p];
		int quantum = 3, time = 0, tot_wait_t = 0, tot_turnAround_t = 0, tot_burst_t = 0;
		Random num= new Random();
		
		
		for(int i = 0; i < no_of_p; i++)
        {
        	processes[i] = i+1;
        	bursts[i] = 1 + num.nextInt(10);
        }
		
		time = wait_t(no_of_p,processes,bursts,waitTime,quantum);
		turnAround_t(no_of_p,processes,bursts,waitTime,turnAround);
		
		for(int i = 0; i < no_of_p; i++)
		{
			tot_wait_t += waitTime[i];
			tot_turnAround_t += turnAround[i];
			tot_burst_t += bursts[i];
		}
		
		throughput = (float)no_of_p/(float) time;
		
		//System.out.printf("System throughput = %.1f\n", throughput);
		//System.out.println("Average burst time = " + (float)tot_burst_t / (float)no_of_p);
		t2 = (float)tot_burst_t / (float)no_of_p;
		//System.out.println("Average waiting time = " + (float)tot_wait_t / (float)no_of_p);
		t3 = (float)tot_wait_t / (float)no_of_p;
		//System.out.println("Average turn_around time = " + (float)tot_turnAround_t / (float)no_of_p);
		t4 = (float)tot_turnAround_t / (float)no_of_p;
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
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int no_of_processes=0;
		//round_robbin(no_of_processes);
	}
}
