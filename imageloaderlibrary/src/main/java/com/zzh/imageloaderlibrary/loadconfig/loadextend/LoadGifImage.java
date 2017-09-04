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

public class LoadGifImage extends BaseLoadImage {

    public ImageView imageView;
    public int gifResourceId;
    public boolean isCrossFade;
    public boolean centercrop;

    public LoadGifImage(String url, int placeholderResource, int errorImageResource,
                        DiskCacheStrategy strategy, BitmapTransformation bitmapTransformation,
                        ImageView imageView, int gifResourceId, boolean isCrossFade, boolean centercrop) {
        super(url, placeholderResource, errorImageResource, strategy, bitmapTransformation);
        this.imageView = imageView;
        this.gifResourceId = gifResourceId;
        this.isCrossFade = isCrossFade;
        this.centercrop = centercrop;
    }

    @Override
    public void load(Context cxt) {
        mStrategy.loadGif(cxt, this);
    }

    @Override
    public void load(Activity cxt) {
        mStrategy.loadGif(cxt, this);
    }

    @Override
    public void load(Fragment cxt) {
        mStrategy.loadGif(cxt, this);
    }
}
