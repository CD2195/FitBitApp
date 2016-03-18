package ca.uwo.csd.cs2212.team10;

import javax.swing.*;

import java.awt.*;

/**
 * This class represents the information for the Dashboard element 'Interactive Map'
 * This will house all the data (as parameters in the constructor) and the graphical elements.
 * As of Stage 2, only data is being supplied
 * 
 * @author Gustavo Murcia
 */
public class MapFrame extends JPanel {
	
	/**
	 * The constructor for the MapFrame. 
	 * The parameters represent information coming from the API
	 * 
	 * @param bestDistance integer that contains best distance count		
	 * @param bestDistanceDate String that contains date best distance was achieved
	 * @param lifeDistance integer that contains lifetime distance count
	 */
	public MapFrame(double bestDistance, String bestDistanceDate, double lifeDistance) {
		// Change GridLayout to better organize the panel
		super(new GridLayout(1, 1));
		
		
		// JLabels to print the text for the testFitBitAPI
		String stringLabel = "<html>" + 
				"<br>Best Distance: " + bestDistance + 
				"<br>	Date achieved: " + bestDistanceDate + 
				"<br>Life Distance: (Goals): " + lifeDistance + 
				"</html>";
		JLabel lblName = new JLabel(stringLabel, JLabel.CENTER);
		
		lblName.setOpaque(false);	
		lblName.setToolTipText("tmp");
		this.setBackground(new Color(150, 150, 150));
		
		
		//this.add(content);
		this.add(lblName);
	}
	
	// TMP test
	public static void main(String[] args) {
		// Test Data 
		double bestDistance = 123.6;
		String bestDistanceDate = "2016.02.03";
		double lifeDistance = 321.6;
		
		// Create the Frames needed 
		MapFrame testMap = new MapFrame(bestDistance, bestDistanceDate, lifeDistance);
		JInternalFrame testFrame = new JInternalFrame("Test");
		testFrame.setLocation(100, 100 );
		testFrame.setSize( 200, 200 );
		testFrame.setVisible( true );
		testFrame.setResizable( false );
		testFrame.setIconifiable( false );
		JDesktopPane testPanel = new JDesktopPane();
		JFrame testOFrame = new JFrame();
		testOFrame.setSize(1000, 800);
		
		// add the elements for the frame
		
		testFrame.setSize(600, 400);
		testFrame.getContentPane().add(testMap, BorderLayout.CENTER);
		
		testPanel.add(testFrame);
		
		testOFrame.add(testPanel);
		testOFrame.setVisible(true);
	}
}
