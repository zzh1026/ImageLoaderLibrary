package com.zzh.imageloaderlibrary.builder.builderextend;

import android.widget.ImageView;

import com.zzh.imageloaderlibrary.builder.ImageLoaderBuilder;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadImage;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/29.
 * <p>
 * 图片加载 的builder
 */

public class ImageBuilder extends ImageLoaderBuilder<ImageBuilder> {

    /**
     * 要加载到的 位置
     */
    private ImageView imageView;

    /**
     * 设置是否淡入淡出效果
     */
    private boolean isCrossFade = true;

    /**
     * 设置cenercrop
     */
    private boolean centercrop = true;

    public ImageBuilder imageView(ImageView imageView) {
        this.imageView = imageView;
        return this;
    }

    public ImageBuilder crossFade(boolean crossFade) {
        isCrossFade = crossFade;
        return this;
    }

    public ImageBuilder centercrop(boolean centercrop) {
        this.centercrop = centercrop;
        return this;
    }

    /**
     * @return
     */
    @Override
    public LoadImage build() {
        return new LoadImage(url, placeholderResource, errorImageResource, imageView,
                isCrossFade, strategy, bitmapTransformation, centercrop);
    }
}
