package ferus.tigris.diamonds.views;

import ferus.tigris.diamonds.GameManager;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.R;
import android.graphics.BitmapFactory;

public class StopGameButton extends ButtonView{
	GameView view;

	public StopGameButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.shutdown));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		gameManager.restartGame();
		if(!gameManager.isLovesFinish()) {
			view.setResetButton(new ResetLevelButton(view));
		}
	}

}
