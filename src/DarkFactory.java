import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DarkFactory implements ThemeFactory {

	@Override
	public JPanel makePanel() {
		return new JPanel() {
			{
				setBackground(Color.white);
			}
		};
	}

	@Override
	public JLabel makeLabel(String text) {
		return new JLabel(text){
			{
				setForeground(Color.black);
			}
		};
	}

}
