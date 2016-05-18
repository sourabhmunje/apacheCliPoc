package apacheCli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class TestCli {

	public static void main(String[] args) 
	{
		
		Options options = new Options();		
		options.addOption("apiTester.inputFile", true, "display current time");
		CommandLine cmd = null;
		    
		CommandLineParser parser = new DefaultParser();
		try {
			cmd = parser.parse( options, args);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String countryCode = cmd.getOptionValue("apiTester.inputFile");
		System.out.println(countryCode);
		if(cmd.hasOption("apiTester.inputFile")) {
		   System.out.println("Found apiTester.inputFile.");
		}
		else {
			 System.out.println("apiTester.inputFile not found.");
		}
	

}
}