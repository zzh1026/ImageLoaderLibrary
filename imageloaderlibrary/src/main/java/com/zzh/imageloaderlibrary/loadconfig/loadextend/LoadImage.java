package com.zzh.imageloaderlibrary.loadconfig.loadextend;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.zzh.imageloaderlibrary.loadconfig.BaseLoadImage;

/**
 * 车主邦
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/9/4.
 */

public class LoadImage extends BaseLoadImage {

    public ImageView imageView;
    public boolean isCrossFade;
    public boolean centercrop;

    public LoadImage(String url, int placeholderResource, int errorImageResource,
                     ImageView imageView, boolean isCrossFade, DiskCacheStrategy strategy,
                     BitmapTransformation bitmapTransformation, boolean centercrop) {
        super(url, placeholderResource, errorImageResource, strategy, bitmapTransformation);
        this.imageView = imageView;
        this.isCrossFade = isCrossFade;
        this.centercrop = centercrop;
    }

    @Override
    public void load(Context context) {
        mStrategy.loadImage(context, this);
    }

    @Override
    public void load(Activity activity) {
        mStrategy.loadImage(activity, this);
    }

    @Override
    public void load(Fragment fragment) {
        mStrategy.loadImage(fragment, this);
    }
}
