package com.crg.bitmapillegalargumentexceptiondemo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView originalImageView;
    private ImageView cutImageView;
    private Button cutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        originalImageView = (ImageView) findViewById(R.id.image_original);
        cutButton = (Button) findViewById(R.id.cut_bt);
        cutImageView = (ImageView) findViewById(R.id.image_cut);
        cutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bitmap originalBitmap = ((BitmapDrawable) originalImageView.getDrawable()).getBitmap();
        int width = 0;
        int height = 0;


        //注释部分为解决方案
        /*if (width > 0 && height > 0){

            Bitmap cutBitmap = originalBitmap.createBitmap(100, 0, Bitmap.Config.ALPHA_8);
        } else{
            // 传入参数有问题，做容错处理
            //。。。。。。。。。。。
        }*/

        //异常的原因在  第二个参数 0上
        Bitmap cutBitmap = originalBitmap.createBitmap(100, 0, Bitmap.Config.ALPHA_8);
        cutImageView.setImageBitmap(cutBitmap);
    }
}
