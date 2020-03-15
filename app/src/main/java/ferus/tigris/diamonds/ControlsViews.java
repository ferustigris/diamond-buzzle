package ferus.tigris.diamonds;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import ferus.tigris.diamonds.views.ButtonView;
import ferus.tigris.diamonds.views.CommonStatisticView;
import ferus.tigris.diamonds.views.ForegroundView;
import ferus.tigris.diamonds.views.NumberView;
import ferus.tigris.diamonds.views.ShowResultsButton;
import ferus.tigris.diamonds.views.SoundToggle;
import ferus.tigris.diamonds.views.StopGameButton;
import ferus.tigris.diamonds.views.TopResultsView;

public class ControlsViews {
	SoundToggle soundToggleButton;
	ButtonView resetButton;
	CommonStatisticView statistic;
	ForegroundView foreground;
	TopResultsView topResults;
	ShowResultsButton showResultsButton;
	NumberView number;
	
	GameManager gameManager;
	SoundManager sounds;

	public ControlsViews(GameManager gameManager, SoundManager sounds) {
		this.gameManager = gameManager;
		this.sounds = sounds;

		this.soundToggleButton = new SoundToggle(gameManager.view());
		this.resetButton = new StopGameButton(gameManager.view());
		this.statistic = new CommonStatisticView(gameManager);
		this.foreground = new ForegroundView(gameManager.view());
		this.topResults = new TopResultsView(gameManager.view());
		this.showResultsButton = new ShowResultsButton(gameManager.view());
		this.number = new NumberView(gameManager.view());
	}

	public void draw(Canvas canvas) {
		foreground.draw(canvas);
		soundToggleButton.draw(canvas, sounds.enable());
		resetButton.draw(canvas);
		statistic.draw(canvas);
		topResults.draw(canvas);
		showResultsButton.draw(canvas);
		number.draw(gameManager.scope(), canvas);
	}

	public void layout(int width, int height) {
		int x = width;
		int y = height - showResultsButton.height();
		
		x -= soundToggleButton.width();
		y = height - soundToggleButton.height();
		soundToggleButton.setPosition(new Point(x, y));

		x -= showResultsButton.width();
		y = height - showResultsButton.height();
		showResultsButton.setPosition(new Point(x, y));
		
		x -= resetButton.width(); 
		y = height - resetButton.height();
		resetButton.setPosition(new Point(x, y));
		
		y = height - number.height();
		number.setPosition(new Point(0, y));
	}

	public boolean onTouch(View v, MotionEvent event) {
		int act = event.getAction();
		if (act == MotionEvent.ACTION_DOWN) {
			if(topResults.isCollition((int)event.getX(), (int)event.getY())) {
				topResults.show(false);
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("market://details?id=com.example.android"));
				gameManager.startActivity(intent);
				return false;
			}
		} else if (act == MotionEvent.ACTION_UP) {
			if(soundToggleButton.isCollition(event.getX(),event.getY())) {
				sounds.setEnabled(!sounds.enable());
			}
			if(resetButton.isCollition(event.getX(),event.getY())) {
				resetButton.press(gameManager);
			}
			if(showResultsButton.isCollition(event.getX(), event.getY())) {
				showResultsButton.press(gameManager);
			}
		}
		return true;
	}
}