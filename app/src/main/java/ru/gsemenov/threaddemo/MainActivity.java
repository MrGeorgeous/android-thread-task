package ru.gsemenov.threaddemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn1;
    Button btn2;
    Button btn3;

    PictureService pictureService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pictureService = new PictureService();

        imageView = findViewById(R.id.imageView);
        btn1 = findViewById(R.id.btn_option1);
        btn2 = findViewById(R.id.btn_option2);
        btn3 = findViewById(R.id.btn_option3);

        View.OnClickListener click = new MyClickListener();

        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            new Thread(() -> {
                final Bitmap img;
                switch (view.getId()) {
                    // TODO: на новом потоке Thread запустить в зависимости от view.getId()
                    //  получить картинку котика, собачки или птички, используя pictureService
                    // чтобы вызвать методы getImageWith...(), передавайте туда MainActivity.this
                }
                MainActivity.this.runOnUiThread(() -> {
                    // TODO: запишите все, что вы хотите сделать на главном потоке
                });
            }).start();
        }

    }

}