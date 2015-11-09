package gui.view;

import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class GuiPanel extends JPanel
{

	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button.");
		firstTextField = new JTextField("you can type words in here");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	/**
	 * Loads content into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
