package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Bear extends Mark {

	public Bear(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
