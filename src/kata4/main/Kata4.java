
package kata4.main;

import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;


public class Kata4 {

    
    public static void main(String[] args) {
        //input
        String fileName = new String("emails.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        //process
        Histogram <String> mailHistogram = MailHistogramBuilder.build(mailList);
        //output
        new HistogramDisplay("HISTOGRAMA",mailHistogram).execute();

    }
    
}
