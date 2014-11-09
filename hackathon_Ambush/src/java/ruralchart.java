
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class ruralchart {
    public static void main(String[] arg)
    {
        final DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Housing(35%)($350)", new Double(35));
        data.setValue("Debt(15%)($150)", new Double(15));
        data.setValue("transportation(15%)($150)", new Double(15));
        data.setValue("Food(15%)($250)", new Double(25));
        data.setValue("Saving(10%)($100)", new Double(10));
            JFreeChart chart = ChartFactory.createPieChart("Average Distribution of expenses on income assuming 1000$/month (Rural areas)", data, true, true, false);
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection()); 
                final File file1 = new File("E:\\java projects\\hackathon1\\web\\piechartrural.jpg");
        try {
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
        } catch (IOException ex) {
            Logger.getLogger(urbanchart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
