
package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("MMM Yummy!");

        ImageView statusImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        statusImageView.setImageDrawable(getDrawable(R.drawable.after_cookie));

        // TODO: Find a reference to the TextView in the layout. Change the text.

        //Hides EAT COOKIE button
        View hideButton = findViewById(R.id.eat_cookie);
        hideButton.setVisibility(view.GONE);

        //reveals eat again button
        View resetButton = findViewById(R.id.reset_cookie);
        resetButton.setVisibility(view.VISIBLE);
    }

    public void resetImage (View view) {
        //displays another message
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("More, I say!");

        //resets image
        ImageView repeatedImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        repeatedImageView.setImageDrawable(getDrawable(R.drawable.before_cookie));

        //reveals EAT COOKIE button
        View hideButton = findViewById(R.id.eat_cookie);
        hideButton.setVisibility(view.VISIBLE);

        //hides eat again button
        View resetButton = findViewById(R.id.reset_cookie);
        resetButton.setVisibility(view.GONE);
    }
}