package ferus.tigris.diamonds.Builders;

import java.util.ArrayList;
import java.util.List;

import ferus.tigris.diamonds.GameView;
import ferus.tigris.diamonds.personages.Cat;
import ferus.tigris.diamonds.personages.Mark;
import ferus.tigris.diamonds.views.ComposeSprite;
import ferus.tigris.diamonds.views.LinearSprite;
import android.graphics.Bitmap;

public class CatBuilder extends EmptyMarkBuilder {

	protected Mark createPersonage(GameView view) {
		return new Cat(null, view, view.gameField());
	}

	protected ComposeSprite createSprite(GameView view) {
		List<LinearSprite>sprites = new ArrayList<LinearSprite>();
		
		Bitmap img = ImagesPool.instance(view).getCat1();
		sprites.add(new LinearSprite(img, 15, 10, 10000));
		ComposeSprite sprite = new ComposeSprite(sprites);
		return sprite;
	}
	
	protected boolean checkType(String type) {
		return type.contains("Cat");
	}
}
