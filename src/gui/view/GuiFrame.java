package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFrame extends JFrame
{

	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
	}
}
