package gui.view;

import gui.controller.GuiController;
import javax.swing.JPanel;

public class GuiPanel extends JPanel
{

	private GuiController baseController;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
	}
	
}
