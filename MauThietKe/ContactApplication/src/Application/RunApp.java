package Application;

import javax.swing.JFrame;


public class RunApp {
	private static RunApp uniqueinstance;
	public void run() {
		ReadData testData = new ReadData();
//		if(testData.readData() == true) {
//			testData.readData();
//		}else {
//			System.out.print("File lỗi rồi ĐỨC ơiiiii!");
//		}
		
		testData.readData();
		Screen screen = new Screen();
		
		screen.controlScreen();
		screen.mainFrame.revalidate();
		
		screen.mainFrame.revalidate();
		screen.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		screen.mainFrame.setSize(500,200);
		screen.mainFrame.setBounds(400, 200, 500, 200);
		screen.mainFrame.setVisible(true);
		screen.mainFrame.revalidate();
	}
	
	public static RunApp getinstance() {
		if (uniqueinstance == null) {
			uniqueinstance = new RunApp();
		}
		return uniqueinstance;
	}
	
}
