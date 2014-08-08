
public class RectangleMVC_main {

	public static void main(String[] args) {
		RectangleView view = new RectangleView();
		RectangleModel model = new RectangleModel();
		RectangleController controller = new RectangleController(model, view);
		
		view.setVisible(true);
	}

}
