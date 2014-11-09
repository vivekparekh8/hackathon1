
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.*;
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
public class urbanchart {
    public static void main(String[] arg)
    {
        final DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Housing(35%)($1050)", new Double(35));
        data.setValue("Debt(15%)($450)", new Double(15));
        data.setValue("transportation(15%)($450)", new Double(15));
        data.setValue("Food(15%)($450)", new Double(25));
        data.setValue("Saving(10%)($300)", new Double(10));
            JFreeChart chart = ChartFactory.createPieChart("Average Distribution of expenses on income assuming 3000$/month (Urban areas)", data, true, true, false);
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection()); 
                final File file1 = new File("E:\\java projects\\hackathon1\\web\\piecharturban.jpg");
        try {
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
        } catch (IOException ex) {
            Logger.getLogger(urbanchart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
