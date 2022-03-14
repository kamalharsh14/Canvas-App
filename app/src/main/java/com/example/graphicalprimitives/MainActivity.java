package com.example.graphicalprimitives;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        //Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        Paint textpaint = new Paint();
        paint.setColor(Color.CYAN);
        textpaint.setColor(Color.WHITE);
        textpaint.setTextSize(50);

        //To draw a Circle
        canvas.drawText("Circle", 120, 350, textpaint);
        canvas.drawCircle(190, 150, 120, paint);

        //To draw a Rectangle
        canvas.drawText("Rectangle", 420, 350, textpaint);
        canvas.drawRect(400, 100, 650, 240, paint);

        //To draw a Square
        canvas.drawText("Square", 120, 780, textpaint);
        canvas.drawRect(70, 450, 310, 675, paint);

        //To draw a Line
        canvas.drawText("Line", 480, 780, textpaint);
        canvas.drawLine(520, 450, 520, 675, paint);

        //To draw a Triangle
//        canvas.drawText("Triangle", 120, 1150, textpaint);
//        canvas.drawRect(190, 900, 190, 1000, paint);

    }
}