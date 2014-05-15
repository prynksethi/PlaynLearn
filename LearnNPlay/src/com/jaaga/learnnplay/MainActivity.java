package com.jaaga.learnnplay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton imagebutton;
	MediaPlayer a;
	MediaPlayer apple;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imagebutton=(ImageButton) findViewById(R.id.imageButton1);
		a=MediaPlayer.create(this, R.raw.a);
		apple=MediaPlayer.create(this, R.raw.abc);
		a.start();	
		imagebutton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a.stop();
				apple.start();
				Bitmap image = BitmapFactory.decodeResource(getResources(),R.drawable.apple);  
				imagebutton.setImageBitmap(image);  
				imagebutton.setMinimumWidth(image.getWidth());  
				imagebutton.setMinimumHeight(image.getHeight());
			}
		});
    }
	
	/*private void animated()
	{
		imagebutton.setImageResource(R.anim.move);
		AnimationDrawable animdraw=(AnimationDrawable) imagebutton.getDrawable();
	    animdraw.start();
	}
*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void changes(View v)
	{
		//imagebutton.setImageResource(R.drawable.apple);
		Bitmap image = BitmapFactory.decodeResource(getResources(),R.drawable.apple);  
		  imagebutton.setImageBitmap(image);  
		  imagebutton.setMinimumWidth(image.getWidth());  
		  imagebutton.setMinimumHeight(image.getHeight());
	}
}
