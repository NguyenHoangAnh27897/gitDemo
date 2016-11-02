import javax.swing.JButton;
import javax.swing.JFrame;


public class aNh extends JFrame {
	JButton btnDe = new JButton("hOaNgAnHdEpTrAi");
		public aNh(){
			setSize(400,400);
			setTitle("hOaNgAnH");
			setLayout(null);
			
			this.add(btnDe);
			btnDe.setBounds(20, 20, 150, 35);
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aNh main = new aNh();
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setVisible(true);
	}

}
