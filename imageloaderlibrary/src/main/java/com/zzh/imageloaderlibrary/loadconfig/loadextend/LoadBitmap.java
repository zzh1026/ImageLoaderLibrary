package com.zzh.imageloaderlibrary.loadconfig.loadextend;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.zzh.imageloaderlibrary.builder.OnImageBitmapResult;
import com.zzh.imageloaderlibrary.loadconfig.BaseLoadImage;

/**
 * 车主邦
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/9/4.
 */

public class LoadBitmap extends BaseLoadImage {
    public OnImageBitmapResult onImageBitmapResult;

    public LoadBitmap(String url, int placeholderResource, int errorImageResource,
                      DiskCacheStrategy strategy, BitmapTransformation bitmapTransformation,
                      OnImageBitmapResult onImageBitmapResult) {
        super(url, placeholderResource, errorImageResource, strategy, bitmapTransformation);
        this.onImageBitmapResult = onImageBitmapResult;
    }

    @Override
    public void load(Context context) {
        mStrategy.loadBitmap(context, this);
    }

    @Override
    public void load(Activity activity) {
        mStrategy.loadBitmap(activity, this);
    }

    @Override
    public void load(Fragment fragment) {
        mStrategy.loadBitmap(fragment, this);
    }
}
