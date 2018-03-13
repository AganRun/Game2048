package com.example.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

	private int score = 0;
	private TextView tvScore;
	
	private static MainActivity  mainActity = null;

	
	public MainActivity(){
		mainActity = this;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvScore = (TextView) findViewById(R.id.tvScore);
    }
    
    
    public void clearScore(){
    	score = 0;
    	showScore();
    }
    
    public void showScore(){
    	tvScore.setText(score + "");
    }
    
    public void addScore(int s){
    	score += s;
    	showScore();
    }
    
    public static MainActivity getMainActivity(){
    	return mainActity;
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
