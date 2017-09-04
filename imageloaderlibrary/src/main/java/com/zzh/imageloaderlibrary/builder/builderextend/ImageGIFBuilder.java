package com.zzh.imageloaderlibrary.builder.builderextend;

import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.zzh.imageloaderlibrary.builder.ImageLoaderBuilder;
import com.zzh.imageloaderlibrary.loadconfig.BaseLoadImage;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadGifImage;

/**
 * 车主邦
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/9/4.
 */

public class ImageGIFBuilder extends ImageLoaderBuilder<ImageGIFBuilder> {

    public DiskCacheStrategy strategy = DiskCacheStrategy.NONE;

    /**
     * 要加载到的 位置
     */
    private ImageView imageView;

    /**
     * 加载本地的gif图
     */
    private int gifResourceId;

    /**
     * 设置是否淡入淡出效果
     */
    private boolean isCrossFade = true;

    /**
     * 设置cenercrop
     */
    private boolean centercrop = false;

    @Override
    public ImageGIFBuilder strategy(DiskCacheStrategy strategy) {
        this.strategy = DiskCacheStrategy.NONE;
        return this;
    }

    public ImageGIFBuilder imageView(ImageView imageView) {
        this.imageView = imageView;
        return this;
    }

    public ImageGIFBuilder gifResourceId(int gifResourceId) {
        this.gifResourceId = gifResourceId;
        return this;
    }

    public ImageGIFBuilder crossFade(boolean crossFade) {
        isCrossFade = crossFade;
        return this;
    }

    public ImageGIFBuilder centercrop(boolean centercrop) {
        this.centercrop = centercrop;
        return this;
    }

    @Override
    public BaseLoadImage build() {
        return new LoadGifImage(url, placeholderResource, errorImageResource, strategy,
                bitmapTransformation, imageView, gifResourceId, isCrossFade, centercrop);
    }
}
