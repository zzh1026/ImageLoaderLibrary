package com.zzh.imageloaderlibrary.builder.builderextend;

import com.zzh.imageloaderlibrary.builder.ImageLoaderBuilder;
import com.zzh.imageloaderlibrary.builder.OnImageBitmapResult;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadBitmap;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/30.
 */

public class ImageBitmapBuilder extends ImageLoaderBuilder<ImageBitmapBuilder> {

    private OnImageBitmapResult onImageBitmapResult;

    public ImageBitmapBuilder onImageBitmapResult(OnImageBitmapResult onImageBitmapResult) {
        this.onImageBitmapResult = onImageBitmapResult;
        return this;
    }


    @Override
    public LoadBitmap build() {
        return new LoadBitmap(url, placeholderResource, errorImageResource,
                strategy, bitmapTransformation, onImageBitmapResult);
    }
}
