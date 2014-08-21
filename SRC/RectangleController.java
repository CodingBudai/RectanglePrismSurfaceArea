import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RectangleController {
	RectangleModel model = new RectangleModel();
	RectangleView view = new RectangleView();
	
	public RectangleController(RectangleModel model, RectangleView view){
		this.model = model;
		this.view = view;
		this.view.addListener(new ComputeListener());
	}
	
	class ComputeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == view.computeButton){
				double height, width, depth;
				
				height = view.getRectangleHeight();
				width = view.getRectangleWidth();
				depth = view.getRectangleDepth();
				
				if(depth == 0)
					model.computeSurfaceArea(height, width);
				else
					model.computeSurfaceArea(height, width, depth);
				
				view.setResult(model.getSurfaceArea());
			}
			
			if(e.getSource() == view.clearButton){
				view.setRectangleHeight(model.clrText());
				view.setRectangleWidth(model.clrText());
				view.setRectangleDepth(model.clrText());
				view.setResult(model.clrResultLabel());
			}
		}
	}
}
