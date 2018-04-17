package goltsov.roman.galleryforyandexschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        ImageView fullImageView = (ImageView) findViewById(R.id.full_image_view);

        Intent intent = getIntent();

        int position = intent.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);

        fullImageView.setImageResource(adapter.images[position]);

    }
}
