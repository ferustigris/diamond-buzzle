package ferus.tigris.diamonds.views;

import ferus.tigris.diamonds.GameManager;
import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.R;
import android.graphics.BitmapFactory;

public class ResetLevelButton extends ButtonView{
	GameView view;

	public ResetLevelButton(GameView view) {
		super(BitmapFactory.decodeResource(view.getResources(), R.drawable.restart));
		this.view = view;
	}

	public void press(GameManager gameManager) {
		gameManager.restartLevel();
		if(gameManager.isLovesFinish()) {
			view.setResetButton(new StopGameButton(view));
		}
	}

}
