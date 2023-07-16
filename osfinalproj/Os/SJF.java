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

public class SJF {
	   
	   
	
	
	  // f means it is flag it checks process is completed or not
	
	int systemTime=0, tot=0;
	float avgwaitingTime=0, avgturnAround=0;
	float avgBurstTime=0;
	float throughput= 0;
	long totalTime=0;

	void calculate(int x){
		
		
		int pid[]= new int[x];
		int arrival[] = new int[x]; 
		int burst[] = new int[x]; 
		int completeTime[] = new int[x]; 
		int turnAroundTime[] = new int[x]; 
		int wt[] = new int[x];  //wt means waiting time
		int f[] = new int[x];
	for(int i=0;i<x;i++)
	{
	
		arrival[i] = (int)((Math.random()) * 10)+1;
		//System.out.println ("enter process " + (i+1) + " brust time:");
		burst[i] = (int)((Math.random()) * 10)+6;
		avgBurstTime = avgBurstTime + burst[i];
		pid[i] = i+1;
		f[i] = 0;
	}
	
	boolean a = true;
	while(true)
	{
		int c=x, min=999;
		if (tot == x) // total no of process = completed process loop will be terminated
			break;
		
		for (int i=0; i<x; i++)
		{
			/*
			 * If i'th process arrival time <= system time and its flag=0 and burst<min 
			 * That process will be executed first 
			 */ 
			if ((arrival[i] <= systemTime) && (f[i] == 0) && (burst[i]<min))
			{
				min=burst[i];
				c=i;
			}
		}
		
		/* If c==n means c value can not updated because no process arrival time< system time so we increase the system time */
		if (c==x) 
			systemTime++;
		else
		{
			completeTime[c]=systemTime+burst[c];
			systemTime+=burst[c];
			turnAroundTime[c]=completeTime[c]-arrival[c];
			wt[c]=turnAroundTime[c]-burst[c];
			f[c]=1;
			tot++;
		}
		
		
	}
	long end = System.currentTimeMillis()/1000;
	//System.out.println("\npid  arrival brust  complete turn waiting");
	
	for(int i=0;i<x;i++)
	{
		//System.out.println(pid[i]+"\t"+arrival[i]+"\t"+burst[i]+"\t"+completeTime[i]+"\t"+turnAroundTime[i]+"\t"+wt[i]);
		avgwaitingTime+= wt[i];
		avgturnAround+= turnAroundTime[i];
		totalTime +=completeTime[i];
		
	}
	
	
	
	
	
	avgturnAround= (float)(avgturnAround/x);
	avgwaitingTime= (float)(avgwaitingTime/x);
	throughput = totalTime/x;
//System.out.println(throughput);
	avgBurstTime= (float) (avgBurstTime/x);
	}
	
	
float getavgturnAround()
{
	  return avgturnAround;
	  
}

float getavgwaitingTime()
{
	  return avgwaitingTime;
	  
}

float getthroughput()
{
	  return throughput;
	  
}

float getavgBurstTime()
{
	  return avgBurstTime;
	  
}




	
	
}