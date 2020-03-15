package ferus.tigris.diamonds.levels;

import java.util.Random;

import ferus.tigris.diamonds.GameManager;
import ferus.tigris.diamonds.Matrix;
import ferus.tigris.diamonds.Builders.ImagesPool;
import ferus.tigris.diamonds.personages.LargePersonage;
import ferus.tigris.diamonds.personages.ViewsManager;
import ferus.tigris.diamonds.views.Sprite;

public class LevelWithLargeMarks extends StaticLevel {
	private GameManager gameManager;
	private LevelManager levelManager;
	private int maxScope = 100;
	private Matrix fixMatrix = new Matrix(3, 3);

	public LevelWithLargeMarks(LevelManager levelManager, GameManager gameManager, int maxScope) {
		super(levelManager, gameManager, maxScope);
		this.gameManager = gameManager;
		this.levelManager = levelManager;
	}

	public AbstractLevel nextLevel() {
		return new LevelWithLargeMarks(levelManager, gameManager, maxScope);
	}

	public AbstractLevel clone() {
		return new LevelWithLargeMarks(levelManager, gameManager, maxScope);
	}

	public void start() {
		super.start();
		onLoad();
	}

	public void onLoad() {
		super.onLoad();
		Random rnd = new Random();
		int x = rnd.nextInt(fixMatrix.columns());
		int y = rnd.nextInt(fixMatrix.rows());

		while(!setLargeMark(x, y));
	}

	protected boolean setLargeMark(int x, int y) {
		Matrix m = marks();
		LargePersonage mark = new LargePersonage(null, gameManager.view(), gameManager.view().gameField());

		Sprite sprite = new Sprite(ImagesPool.instance(gameManager.view()).getCat1(), 1000, 1, 4);
		new ViewsManager(mark, sprite); 

		mark.save(m, x, y);
		
		return true;
	}

}
