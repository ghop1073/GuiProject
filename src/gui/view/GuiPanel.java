package gui.view;

import gui.controller.GuiController;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

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
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 117, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 80, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, firstButton);
	}
	
	private void setupListeners()

	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("dont click it");
				
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				firstButton.setText("Mouse X: " + moved.getX() + " Mouse Y: " + moved.getY());
				if((moved.getX() > 25 && moved.getX() < 40) && (moved.getY() > 50 && moved.getY() < 70))
				{
					changeRandomColor();
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				if(dragged.isAltDown())
				{
					firstTextField.setText("you held alt and dragged!");
				}
			}
		});
		
	}
	

	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
