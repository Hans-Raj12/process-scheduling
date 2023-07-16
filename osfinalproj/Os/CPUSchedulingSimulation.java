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

import java.awt.BasicStroke;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.event.ChangeEvent;
import javax.swing.JInternalFrame;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.EventQueue;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class CPUSchedulingSimulation extends javax.swing.JFrame {

    /**
     * Creates new form CPUSchedulingSimulation
     */
	int val;
	int n ;
	
	 float  throughput;
     float burst;
     float wait;
     float turnaround;
     
    
	SJF k ;
	RoundRobbin R;
	FCFS f;
	FirstCome l1;
	
	 CPUSchedulingSimulation cp;
    public CPUSchedulingSimulation() {
    	setTitle("CPU SCHEDULING SIMULATION PROGRAM");
    	setResizable(false);
        initComponents();
        jButton1.setBackground(Color.cyan);
        jLabel2.setBackground(Color.black);
        jLabel3.setBackground(Color.black);
        jPanel1.setLayout(null);
        jPanel1.add(jRadioButton2);
        jPanel1.add(jRadioButton1);
        jPanel1.add(jLabel3);
        jPanel1.add(jRadioButton3);
        jPanel1.add(jPanel2);
        jPanel1.add(jLabel2);
        jPanel1.add(NoOfProcessTF);
        jPanel1.add(jButton1);
        jPanel1.add(jScrollPane2);
        jPanel1.add(jButton2);
       
        JCheckBox chckbxNewCheckBox = new JCheckBox("Graphical Output");
        chckbxNewCheckBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Boolean f = false;
        		if(chckbxNewCheckBox.isSelected()&&jRadioButton1.isSelected())
        		{
        			double d1 = f.getThroughput();
        			double d2 = f.getBurstTime();
        			double d3 = f.getWaitTime();
        			double d4 = f.getTurnAroundTime();
        			
        			
        			SwingUtilities.invokeLater(new Runnable() {
        				@Override
        				public void run() {
        					new FirstCome(d1,d2,d3,d4).setVisible(true);
        				}
        			});
        			 
        		}
        		if(chckbxNewCheckBox.isSelected()&&jRadioButton2.isSelected())
        		{
        			double d1 = f.getThroughput();
        			double d2 = f.getBurstTime();
        			double d3 = f.getWaitTime();
        			double d4 = f.getTurnAroundTime();
        			
        			
        			SwingUtilities.invokeLater(new Runnable() {
        				@Override
        				public void run() {
        					new Shortestjob(d1,d2,d3,d4).setVisible(true);
        				}
        			});
        			 
        			//if(JFrame.DISPOSE_ON_CLOSE == 0)
        				// chckbxNewCheckBox.setSelected(false);
        			 
        		}
        		if(chckbxNewCheckBox.isSelected()&&jRadioButton3.isSelected())
        		{
        			double d1 = f.getThroughput();
        			double d2 = f.getBurstTime();
        			double d3 = f.getWaitTime();
        			double d4 = f.getTurnAroundTime();
        			
        			
        			SwingUtilities.invokeLater(new Runnable() {
        				@Override
        				public void run() {
        					new RoundRR(d1,d2,d3,d4).setVisible(true);
        				}
        			});
        		}
        	}
        });
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
        chckbxNewCheckBox.setBounds(402, 435, 144, 23);
        jPanel1.add(chckbxNewCheckBox);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C://Users//DELL//Documents//OS_FINALPROJECT//images//1.jpg"));
        lblNewLabel.setBounds(0, 0, 659, 498);
        jPanel1.add(lblNewLabel);
    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    public double getThroughPut()
    {
    	return throughput;
    }
    
    public double getBurst()
    {
    	return burst;
    }
    
    public double getWait()
    {
    	return wait;
    }
    
    public double getTurnaround()
    {
    	return turnaround;
    }
    
    
    public void setThroughPut(float t)
    {
    	this.throughput=t;
    }
    
    public void setBurst(float t)
    {
    	this.burst=t;
    }
    
    public void setWait(float t)
    {
    	this.wait=t;
    }
    
    public void setTurnaround(float t)
    {
    	this.turnaround=t;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(108, 0, 442, 46);
        jLabel1 = new javax.swing.JLabel();
        NoOfProcessTF = new javax.swing.JTextField();
        NoOfProcessTF.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        NoOfProcessTF.setBounds(141, 64, 105, 39);
        jButton1 = new javax.swing.JButton();
       
        
       
       // JLabel l = new JLabel(icon);
        jButton1.addMouseListener(new MouseAdapter() {
        	
        	
        	
			@Override
        	public void mousePressed(MouseEvent e) {
        	}
        	@Override
        	public void mouseReleased(MouseEvent e) {
        		if( NoOfProcessTF.getText().isEmpty())
        		{
        			JOptionPane.showMessageDialog(NoOfProcessTF, "TEXT FIELD REQUIRED", "WARNING", JOptionPane.WARNING_MESSAGE);

        		}
        		else
        		{
        			
        			String getValue = NoOfProcessTF.getText();
        			val = Integer.parseInt(getValue);
        			
        			//calling all three algorithms' constructor
        			k = new SJF();
        			R = new RoundRobbin();
        			
        			
        			n = val;
        			f = new FCFS(n);
        			
        			//JOptionPane.showMessageDialog(null,  getValue);
        		}
        		
        	}
        });
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        			
        	}
        });
        jButton1.setBounds(290, 61, 243, 39);
        jButton2 = new javax.swing.JButton();
        jButton2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseReleased(MouseEvent e) {
        		
        		
        	}
        });
        
       
       
     
        	
        		
        		
        		
        	
        	
        
    		
    		
       
        jButton2.setBackground(new Color(0, 255, 255));
        jButton2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jButton2.setBounds(297, 265, 96, 34);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		f.generateprocess();
        	}
        });
       
        
        
       
        jRadioButton1.setForeground(new Color(64, 224, 208));
        
        jRadioButton1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jRadioButton1.setBounds(153, 173, 263, 23);
        jRadioButton2 = new javax.swing.JRadioButton();
        
        jRadioButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 k.calculate(n);
        		
     
        	}
        });
        
        
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 if( jRadioButton2.isSelected())
        		 {
        			 
	        		   
	        		   float a = k.getavgBurstTime();
	        			String s1 = Float. toString(a);
	        			
	        			float b = k.getavgturnAround();
	        			String s2 = Float. toString(b);
	        			
	        			
	        			float c = k.getthroughput();
	        			String s3 = Float. toString(c);
	        			
	        			
	        			float d = k.getavgwaitingTime();
	        			String s4 = Float. toString(d);
	        			
	        			String t ="ThroughPut Time : "+s1+"\n"
	    	        			+"Average Burst Time : "+s2+"\n"
	    	        		    +"Average Waiting Time :"+s3+"\n"
	    	        			+"Average Turn Around Time : "+s4;
	        			
	        			areaa.setText(t);
	        			
	        			throughput= a;
	        			burst= b;
	        			wait= c;
	        			turnaround= d;
	        			
	        			
	        			f.setThroughput(throughput);
	        			f.setBurstTime(burst);
	        			f.setWaitTime(wait);
	        			f.setTurnAroundTime(turnaround);
	        			
        		 }
        		 else if(jRadioButton1.isSelected())
        		 {
        			 float a = f.getThroughput();
        			 
        			 String s1 = Float. toString(a);
	        			
	        			float b = f.getBurstTime();
	        			
	        			
	        			String s2 = Float. toString(b);
	        			
	        			
	        			float c = f.getWaitTime();
	        		
	        			
	        			String s3 = Float. toString(c);
	        			
	        			
	        			float d = f.getTurnAroundTime();
	        		    String s4 = Float. toString(d);
	        			
	        			String t ="ThroughPut Time : "+s1+"\n"
	        			+"Average Burst Time : "+s2+"\n"
	        		    +"Average Waiting Time :"+s3+"\n"
	        			+"Average Turn Around Time : "+s4;
	        			
	        			areaa.setText(t);
	        			
	        			
	        			throughput= a;
	        			burst= b;
	        			wait= c;
	        			turnaround= d;
	        			
	        			
	        			f.setThroughput(throughput);
	        			f.setBurstTime(burst);
	        			f.setWaitTime(wait);
	        			f.setTurnAroundTime(turnaround);
	        			
	        		//System.out.println(f.getThroughput()+" "+f.getBurstTime()+" "+f.getWaitTime()+" "+f.getTurnAroundTime());
	        					
	        			
	        				
	        			
	        			  
	        		       
	        		      
	        		       
        		 }
        		 else
        		 {
        			 if( jRadioButton3.isSelected())
            		 {
            			 
    	        		   
    	        		   float a = R.getThroughput();
    	        			String s1 = Float. toString(a);
    	        			
    	        			float b = R.getBurstTime();
    	        			String s2 = Float. toString(b);
    	        			
    	        			
    	        			float c = R.getWaitTime();
    	        			String s3 = Float. toString(c);
    	        			
    	        			
    	        			float d = R.getTurnAroundTime();
    	        			String s4 = Float. toString(d);
    	        			
    	        			String t ="ThroughPut Time : "+s1+"\n"
    	        			+"Average Burst Time : "+s2+"\n"
    	        		    +"Average Waiting Time :"+s3+"\n"
    	        			+"Average Turn Around Time : "+s4;
    	        			
    	        			areaa.setText(t);
    	        			
    	        			throughput= a;
    	        			burst= b;
    	        			wait= c;
    	        			turnaround= d;
    	        			
    	        			
    	        			f.setThroughput(throughput);
    	        			f.setBurstTime(burst);
    	        			f.setWaitTime(wait);
    	        			f.setTurnAroundTime(turnaround);
    	        			
            		 }
        		 }
       		
        			
        	}
        });
		
        jRadioButton2.setForeground(new Color(64, 224, 208));
        jRadioButton2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jRadioButton2.setBounds(153, 199, 240, 23);
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		R.round_robbin(n);
        		
        	}
        });
        jRadioButton3.setForeground(new Color(64, 224, 208));
        jRadioButton3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jRadioButton3.setBounds(153, 225, 240, 23);
        
        
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 191, 255));
        jLabel2.setBounds(141, 131, 430, 35);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(0, 191, 255));
        jLabel3.setBounds(108, 315, 144, 36);
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(108, 362, 288, 125);
        areaa = new javax.swing.JTextField();
        areaa.setHorizontalAlignment(SwingConstants.LEFT);
        areaa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        
        
       
        
      
       
        
     
        areaa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("  CPU Scheduling Simulation Program");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        jButton1.setText("Add number of processes");

        jButton2.setText("Execute");

        jRadioButton1.setText("FIRST COME FIRST SERVE");
        jRadioButton1.setActionCommand("FIRST COME FIRST SERVE");

        jRadioButton2.setText("SHORTEST JOB FIRST");
        jRadioButton2.setActionCommand("SHORTEST JOB FIRST");

        jRadioButton3.setText("ROUND ROBIN");
        jRadioButton3.setActionCommand("ROUND ROBIN");
        

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("SELECT THE  SCHEDULING ALGORITHM");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel3.setText("OUTPUT");

        //areaa.setColumns(20);
        //areaa.setRows(5);
        jScrollPane2.setViewportView(areaa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void ButtonGroup() {
		// TODO Auto-generated method stub
    	ButtonGroup bg1 = new ButtonGroup( );

        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);
        bg1.add(jRadioButton3);
	}
  
   

	/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CPUSchedulingSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPUSchedulingSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPUSchedulingSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPUSchedulingSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPUSchedulingSimulation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoOfProcessTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField areaa;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JLabel lblNewLabel;
}
