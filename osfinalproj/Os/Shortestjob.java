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
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * This program demonstrates how to draw line chart with CategoryDataset
 * using JFreechart library.
 * @author www.codejava.net
 *
 */
public class Shortestjob extends JFrame {

	SJF f;
	double d;
	double d1;
	double d2;
	double d3;
	double d4;
	public Shortestjob(double d1,double d2,double d3,double d4) {
		super("SHORTEST JOB FIRST");
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
		this.d4=d4;
		
		JPanel chartPanel = createChartPanel( d1,d2,d3, d4);
		add(chartPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private JPanel createChartPanel(double d1,double d2,double d3,double d4) {
		String chartTitle = "SHORTEST JOB FIRST";
		String categoryAxisLabel = "OPTIMIZATION CRITERIA";
		String valueAxisLabel = "TIME-T";
		
		//double d1,d2,d3,d4;
		CategoryDataset dataset = setValues (d1,d2,d3,d4);
		
		JFreeChart chart = ChartFactory.createLineChart(chartTitle, 
				categoryAxisLabel, valueAxisLabel, dataset);
		

		customizeChart(chart);
		
		// saves the chart as an image files
		
		
		return new ChartPanel(chart);
	}

	
	public CategoryDataset setValues (double d1,double d2 , double d3 , double d4)
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String series1 = "SHORTEST JOB FIRST";
		
		dataset.addValue(d1, series1, "ThroughPut");
		dataset.addValue(d2, series1, "Burst Time");
		dataset.addValue(d3, series1, "Wait Time");
		dataset.addValue(d4, series1, "Turn around time");
		
		
		
		return dataset;
	}
	public void setThp(double d)
	{
		this.d=d;
	}
	public void setB(double d)
	{
		this.d=d;
	}
	public void setW(double d)
	{
		this.d=d;
	}
	public void setTu(double d)
	{
		this.d=d;
	}
	private void customizeChart(JFreeChart chart) {
		CategoryPlot plot = chart.getCategoryPlot();
		LineAndShapeRenderer renderer = new LineAndShapeRenderer();

		// sets paint color for each series
		renderer.setSeriesPaint(0, Color.MAGENTA);
		renderer.setSeriesPaint(1, Color.GREEN);
		renderer.setSeriesPaint(2, Color.BLUE);
		renderer.setSeriesPaint(3, Color.YELLOW);

		// sets thickness for series (using strokes)
		renderer.setSeriesStroke(0, new BasicStroke(4.0f));
		renderer.setSeriesStroke(1, new BasicStroke(3.0f));
		renderer.setSeriesStroke(2, new BasicStroke(2.0f));
		renderer.setSeriesStroke(3, new BasicStroke(1.5f));
		
		// sets paint color for plot outlines
		plot.setOutlinePaint(Color.BLUE);
		plot.setOutlineStroke(new BasicStroke(2.0f));
		
		// sets renderer for lines
		plot.setRenderer(renderer);
		
		// sets plot background
		plot.setBackgroundPaint(Color.CYAN);
		
		// sets paint color for the grid lines
		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.BLACK);
		
		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.BLACK);
		
	}
	
	public static void main(String[] args) {
		/*SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FirstCome().setVisible(true);
			}
		});*/
	}
}