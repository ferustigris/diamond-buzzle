package ferus.tigris.diamonds.views;

import ferus.tigris.diamonds.GameManager;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.R;
import android.graphics.BitmapFactory;

public class ShowResultsButton extends ButtonView{
	GameView view;

	public ShowResultsButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.top));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		gameManager.view().showTopTable();
	}

}
