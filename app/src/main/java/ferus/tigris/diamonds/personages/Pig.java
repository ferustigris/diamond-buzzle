package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Pig extends Mark {

	public Pig(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
