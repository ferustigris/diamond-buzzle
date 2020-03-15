package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Bird extends Mark {

	public Bird(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
