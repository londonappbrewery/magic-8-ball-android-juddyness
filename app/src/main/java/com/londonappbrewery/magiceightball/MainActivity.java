package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        //Create a variable called ballArray.
        // Set ballArray to contain the references to the 5 images in the drawable folder.
        // Refer to the ball pictures using R.drawable.ball1, R.drawable.ball2 ...etc.

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        Button Button;
        Button=(Button)findViewById(R.id.askButton);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Random object generator
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                Log.d("8ball","AskButtonPressed. Number generated is: "+ number);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });


    }
}
