import javax.swing.JFrame;

public class Client {
private JFrame j = new JFrame("Nordic Race");


public JFrame getFrame(){
return j;	
}



	public Client(int width, int height) {
		j.setSize(width, height);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(3);
		j.show();
	
	}
	
}
