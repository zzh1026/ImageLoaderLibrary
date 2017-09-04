package com.zzh.imageloaderlibrary.imagestrategy;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadBitmap;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadGifImage;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadImage;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/29.
 */

public interface BaseImageLoaderStrategy {
    void loadImage(Context ctx, LoadImage img);

    void loadImage(Activity ctx, LoadImage img);

    void loadImage(Fragment ctx, LoadImage img);

    void loadBitmap(Context ctx, LoadBitmap img);

    void loadBitmap(Activity ctx, LoadBitmap img);

    void loadBitmap(Fragment ctx, LoadBitmap img);

    void loadGif(Context cxt, LoadGifImage img);

    void loadGif(Activity cxt, LoadGifImage img);

    void loadGif(Fragment cxt, LoadGifImage img);
}
