package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity{

    private Intent intent;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        displayText = (TextView) findViewById(R.id.displayText);
        intent = getIntent();

        displayText.setText(intent.getStringExtra("TWEET_CONTENTS"));
    }
}
