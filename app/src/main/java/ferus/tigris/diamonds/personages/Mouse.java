package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Mouse extends Mark {

	public Mouse(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
