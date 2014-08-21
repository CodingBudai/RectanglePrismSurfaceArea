import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleView extends JFrame {

	JLabel heightLabel = new JLabel("Height");
	JLabel widthLabel = new JLabel("Width");
	JLabel depthLabel = new JLabel("Depth");
	JLabel SurfaceAreaLabel = new JLabel("Surface Area: ");
	JLabel SurfaceAreaResult = new JLabel("----");
	
	
	JTextField heightTextField = new JTextField(10);
	JTextField widthTextField = new JTextField(10);
	JTextField depthTextField = new JTextField(10);
	
	JButton computeButton = new JButton("Compute");
	JButton clearButton = new JButton("Clear");
	
	RectangleView(){
		this.setTitle("Surface Area");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(215, 220);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		Container mainContainer = this.getContentPane();
		SpringLayout mainLayout = new SpringLayout();
		mainContainer.setLayout(mainLayout);
		
		mainContainer.add(heightLabel);
		mainContainer.add(heightTextField);
		mainContainer.add(widthLabel);
		mainContainer.add(widthTextField);
		mainContainer.add(depthLabel);
		mainContainer.add(depthTextField);
		mainContainer.add(SurfaceAreaLabel);
		mainContainer.add(SurfaceAreaResult);
		mainContainer.add(computeButton);
		mainContainer.add(clearButton);
		
		mainLayout.putConstraint(SpringLayout.WEST, heightLabel, 26, SpringLayout.WEST, mainContainer);
		mainLayout.putConstraint(SpringLayout.NORTH, heightLabel, 10, SpringLayout.NORTH, mainContainer);
		mainLayout.putConstraint(SpringLayout.WEST, heightTextField, 5, SpringLayout.EAST, heightLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, heightTextField, 10, SpringLayout.NORTH, mainContainer);
		mainLayout.putConstraint(SpringLayout.WEST, widthLabel, 0, SpringLayout.SOUTH, heightLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, widthLabel, 10, SpringLayout.SOUTH, heightLabel);
		mainLayout.putConstraint(SpringLayout.WEST, widthTextField, 7, SpringLayout.EAST, widthLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, widthTextField, 5, SpringLayout.SOUTH, heightTextField);
		mainLayout.putConstraint(SpringLayout.WEST, depthLabel, -24, SpringLayout.SOUTH, widthLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, depthLabel, 15, SpringLayout.SOUTH, widthLabel);
		mainLayout.putConstraint(SpringLayout.WEST, depthTextField, 6, SpringLayout.EAST, depthLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, depthTextField, 10, SpringLayout.SOUTH, widthTextField);
		mainLayout.putConstraint(SpringLayout.WEST, SurfaceAreaLabel, -55, SpringLayout.SOUTH, depthLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, SurfaceAreaLabel, 20, SpringLayout.SOUTH, depthLabel);
		mainLayout.putConstraint(SpringLayout.WEST, SurfaceAreaResult, 2, SpringLayout.EAST, SurfaceAreaLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, SurfaceAreaResult, 19, SpringLayout.SOUTH, depthTextField);
		mainLayout.putConstraint(SpringLayout.WEST, computeButton, -90, SpringLayout.SOUTH, SurfaceAreaLabel);
		mainLayout.putConstraint(SpringLayout.NORTH, computeButton, 20, SpringLayout.SOUTH, SurfaceAreaLabel);
		mainLayout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.EAST, computeButton);
		mainLayout.putConstraint(SpringLayout.NORTH, clearButton, 19, SpringLayout.SOUTH, SurfaceAreaResult);
	}
	
	public double getRectangleHeight(){
		return Double.parseDouble(heightTextField.getText());
	}
	
	public double getRectangleWidth(){
		return Double.parseDouble(widthTextField.getText());
	}
	
	public double getRectangleDepth(){
		if(depthTextField.getText().isEmpty())
			return 0;
		else
			return Double.parseDouble(depthTextField.getText());
	}
	
	public void setRectangleHeight(String txt){
		heightTextField.setText(txt);
	}
	
	public void setRectangleWidth(String txt){
		widthTextField.setText(txt);
	}
	
	public void setRectangleDepth(String txt){
		depthTextField.setText(txt);
	}
	public void setResult(double result){
			SurfaceAreaResult.setText(Double.toString(result));
	}
	
	public void setResult(String txt){
		SurfaceAreaResult.setText(txt);
	}
	
	public void addListener(ActionListener lisenButton){
		computeButton.addActionListener(lisenButton);
		clearButton.addActionListener(lisenButton);
	}
}
