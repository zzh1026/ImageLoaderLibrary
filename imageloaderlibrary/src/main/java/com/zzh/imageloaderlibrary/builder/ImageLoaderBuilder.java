package com.zzh.imageloaderlibrary.builder;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.zzh.imageloaderlibrary.loadconfig.BaseLoadImage;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/29.
 */

public abstract class ImageLoaderBuilder<T extends ImageLoaderBuilder> {
    /**
     * 请求图片地址
     */
    protected String url;

    /**
     * 加载失败的 resource 图
     */
    protected int errorImageResource;

    /**
     * 加载中的 占位图
     */
    protected int placeholderResource;

    /**
     * 设置缓存模式
     */
    protected DiskCacheStrategy strategy = DiskCacheStrategy.ALL;

    /**
     * 设置bitmap 的显示效果
     */
    protected BitmapTransformation bitmapTransformation;

    public T url(String url) {
        this.url = url;
        return (T) this;
    }

    public T errorImageResource(int errorImageResource) {
        this.errorImageResource = errorImageResource;
        return (T) this;
    }

    public T placeholderResource(int placeholderResource) {
        this.placeholderResource = placeholderResource;
        return (T) this;
    }

    public T strategy(DiskCacheStrategy strategy) {
        this.strategy = strategy;
        return (T) this;
    }

    public T bitmapTransformation(BitmapTransformation bitmapTransformation) {
        this.bitmapTransformation = bitmapTransformation;
        return (T) this;
    }

    public abstract BaseLoadImage build();
}
