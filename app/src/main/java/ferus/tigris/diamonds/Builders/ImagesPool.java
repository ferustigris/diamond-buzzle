package ferus.tigris.diamonds.Builders;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.R;

public class ImagesPool {
	public Bitmap bug1;
	public Bitmap cat1;
	public Bitmap mouse1;
	public Bitmap bird1;
	private Bitmap frog1;
	private Bitmap rabbit1;
	private Bitmap pig1;
	private Bitmap sky;
	private Bitmap grass;
	private Bitmap cage;
	private Bitmap cloud, transporentCloud;
	private Bitmap bear;
	private Bitmap progressBarBackground, progressBar, digits;
	private Bitmap backgroundOfResultsForm;
	
	private static ImagesPool pool = null;
	private Bitmap box;

	protected ImagesPool(GameView view) {
		bug1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_blue);
		cat1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_green);
		mouse1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_pink);
		bird1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_red);
		frog1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_yellow);
		rabbit1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_bir);
		pig1 = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_violet);
		bear = BitmapFactory.decodeResource(view.getResources(), R.drawable.diamond_orange);
		box = BitmapFactory.decodeResource(view.getResources(), R.drawable.empty);
		sky = BitmapFactory.decodeResource(view.getResources(), R.drawable.curve);
		grass = BitmapFactory.decodeResource(view.getResources(), R.drawable.grass);
		cage = BitmapFactory.decodeResource(view.getResources(), R.drawable.ring);
		cloud = BitmapFactory.decodeResource(view.getResources(), R.drawable.izumrud);
		transporentCloud = BitmapFactory.decodeResource(view.getResources(), R.drawable.izumrud_schema);
		backgroundOfResultsForm = BitmapFactory.decodeResource(view.getResources(), R.drawable.results_background);
		
		progressBarBackground = BitmapFactory.decodeResource(view.getResources(), R.drawable.progressbar_background);
		progressBar = BitmapFactory.decodeResource(view.getResources(), R.drawable.progressbar);
		digits = BitmapFactory.decodeResource(view.getResources(), R.drawable.digits);
	}
	
	static public ImagesPool instance(GameView view) {
		if(pool == null) {
			pool = new ImagesPool(view);
		}
		return pool;
	}

	public Bitmap getBird1() {
		return bird1;
	}

	public Bitmap getCat1() {
		return cat1;
	}

	public Bitmap getMouse1() {
		return mouse1;
	}

	public Bitmap getFrog1() {
		return frog1;
	}

	public Bitmap getRabbit1() {
		return rabbit1;
	}

	public Bitmap getBackground() {
		return sky;
	}

	public Bitmap getForeground() {
		return grass;
	}

	public Bitmap getBug1() {
		return bug1;
	}

	public Bitmap getCage() {
		return cage;
	}

	public Bitmap getDigits() {
		return digits;
	}

	public Bitmap getBear() {
		return bear;
	}

	public Bitmap getBackgroundOfResultsForm() {
		return backgroundOfResultsForm;
	}

	public Bitmap getPig1() {
		return pig1;
	}

	public Bitmap getCloud() {
		return cloud;
	}

	public Bitmap getTransporentCloud() {
		return transporentCloud;
	}

	public Bitmap getBox() {
		return box;
	}
}
