package ferus.tigris.diamonds.personages;

import ferus.tigris.diamonds.GameView;

public class Rabbit extends Mark {

	public Rabbit(BehaviorDelegate delegate, GameView gameView) {
		super(delegate, gameView, gameView.gameField());
	}

}
