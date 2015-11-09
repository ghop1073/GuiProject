package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFrame extends JFrame
{

	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
