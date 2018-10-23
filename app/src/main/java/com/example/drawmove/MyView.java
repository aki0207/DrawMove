package com.example.drawmove;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    Paint paint = new Paint();
    int x = 660;
    int y = 250;
    int width = 710;
    int height = 300;


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    @Override
    protected void onDraw(Canvas canvas) {



        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x,y,width,height, paint);

    }

    public void Move () {


        this.y = this.y + 50;
        this.height = this.height + 50;

    }


}
