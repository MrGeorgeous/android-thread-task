package ru.gsemenov.threaddemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class PictureService {

    /**
     * Получить картиночку с котиками
     * @param context контекст (активность), из которой будет вызван строковый ресурс
     * @return картинка с котиками или null, если произошла ошибка
     */
    @Nullable
    public Bitmap getImageWithCats(Context context) {
        // TODO: используя контекст, получить ссылку на картинку (строковый ресурс R.string.cat)
        // TODO: вернуть картинку, используя getImage()
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Получить картиночку с собачками
     * @param context контекст (активность), из которой будет вызван строковый ресурс
     * @return картинка с собачками или null, если произошла ошибка
     */
    @Nullable
    public Bitmap getImageWithDogs(Context context) {
        // TODO: используя контекст, получить ссылку на картинку (строковый ресурс R.string.dog)
        // TODO: вернуть картинку, используя getImage()
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Получить картиночку с птичками
     * @param context контекст (активность), из которой будет вызван строковый ресурс
     * @return картинка с птичками или null, если произошла ошибка
     */
    @Nullable
    public Bitmap getImageWithBirds(Context context) {
        // TODO: используя контекст, получить ссылку на картинку (строковый ресурс R.string.bird)
        // TODO: вернуть картинку, используя getImage()
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Получить картинку по ссылке в интернете
     * @param path путь к картинке в интернете
     * @return картинка или null, если произошла ошибка
     */
    @Nullable
    public Bitmap getImage(String path) {
        // TODO: создать экземпляр класса URL, передав path через конструктор
        // TODO: раскомментировать в AndroidManifest.xml строчку о разрешении ходить в Интернет
        // TODO: получить содержимое картинки, используя метод URL.getContent()
        // TODO: если содержимое == null, то вернуть null
        // TODO: иначе вернуть BitmapFactory.decodeStream((InputStream) data);
        throw new UnsupportedOperationException("not implemented");
    }
}
