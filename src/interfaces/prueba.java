package interfaces;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Rectangle;

public class prueba extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel2 = null;

	/**
	 * This is the default constructor
	 */
	public prueba() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setLayout(null);
		this.add(getJPanel2(), null);
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new GridBagLayout());
			jPanel2.setBounds(new Rectangle(134, 101, 10, 10));
		}
		return jPanel2;
	}

}
