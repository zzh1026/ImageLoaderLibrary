package com.zzh.imageloaderlibrary.loadconfig;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.zzh.imageloaderlibrary.imagestrategy.BaseImageLoaderStrategy;
import com.zzh.imageloaderlibrary.imagestrategy.strategyimpl.GlideImageLoaderStrategy;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/30.
 */

public abstract class BaseLoadImage {
    protected static BaseImageLoaderStrategy mStrategy = getDefaultStrategy();

    public String url;
    public int placeholderResource;
    public int errorImageResource;
    public DiskCacheStrategy strategy;
    public BitmapTransformation bitmapTransformation;

    public BaseLoadImage(String url, int placeholderResource, int errorImageResource,
                         DiskCacheStrategy strategy, BitmapTransformation bitmapTransformation) {
        this.url = url;
        this.placeholderResource = placeholderResource;
        this.errorImageResource = errorImageResource;
        this.strategy = strategy;
        this.bitmapTransformation = bitmapTransformation;
    }

    protected void setLoadImgStrategy(BaseImageLoaderStrategy strategy) {
        this.mStrategy = strategy;
    }

    /**
     * 获取默认的 图片加载器
     *
     * @return
     */
    protected static BaseImageLoaderStrategy getDefaultStrategy() {
        return new GlideImageLoaderStrategy();
    }

    public abstract void load(Context cxt);

    public abstract void load(Activity cxt);

    public abstract void load(Fragment cxt);
}
