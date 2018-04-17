package goltsov.roman.galleryforyandexschool;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context context;

    // Массив изображений
    public Integer[] images = {
            R.drawable.cat, R.drawable.moscow,
            R.drawable.cat, R.drawable.moscow,
            R.drawable.cat, R.drawable.moscow,
            R.drawable.cat, R.drawable.moscow,
            R.drawable.cat, R.drawable.moscow,
            R.drawable.cat, R.drawable.moscow
    };

    public ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        // CENTER_INSIDE - Изображение в натуральную величину
        // CENTER_CROP - Изображение по размеру сетки
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return imageView;
    }
}
