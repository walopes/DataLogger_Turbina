/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipack;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import oracle.jrockit.jfr.events.Bits;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;

public class LineChart_AWT extends ApplicationFrame
{
   public LineChart_AWT( String applicationTitle , String chartTitle, Double[] Dbl, String[] ts, int count, String val)
   {
       //XYSeries series = new XYSeries(applicationTitle);
       
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Tempo","Amplitude",
         createDataset(Dbl,ts,count,val),
         PlotOrientation.VERTICAL,
         true,true,false);
      
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 800 , 600 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset(Double Dbl[], String[] ts, int count, String val)
   {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      int i;
      int[] vet = new int[count];
      //for(i=0;i<count;i++) vet[i] = i;
      for(i=0;i<count;i++){
          //dataset.addValue(1,"schools",ts[i]);
          //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
          //sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
          //String formattedDate = sdf.format(ts[i]);
          
          String exe = ts[i].substring(11,19);
          
          //dataset.addValue(Dbl[i],val,exe);
          dataset.addValue(Dbl[i],val,exe);
          //System.out.println(i);
          //System.out.println(Dbl[i]+"  "+formattedDate);
      }
      
      /*
      dataset.addValue( 15 , "schools" , "1970" );
      dataset.addValue( 30 , "schools" , "1980" );
      dataset.addValue( 60 , "schools" ,  "1990" );
      dataset.addValue( 120 , "schools" , "2000" );
      dataset.addValue( 240 , "schools" , "2010" );
      dataset.addValue( 300 , "schools" , "2014" );*/
      return dataset;
   }
   
   
}