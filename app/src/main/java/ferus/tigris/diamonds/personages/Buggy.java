package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Buggy extends Mark {

	public Buggy(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
