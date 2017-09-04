package com.zzh.imageloaderlibrary;

import com.zzh.imageloaderlibrary.builder.builderextend.ImageBitmapBuilder;
import com.zzh.imageloaderlibrary.builder.builderextend.ImageBuilder;
import com.zzh.imageloaderlibrary.builder.builderextend.ImageGIFBuilder;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/29.
 * <p>
 * 图片加载框架隔离封装的 使用主体
 */

public class ImageLoader {

    private ImageLoader() {
    }


    public static ImageBuilder loadImage() {
        return new ImageBuilder();
    }

    public static ImageBitmapBuilder loadBitmap() {
        return new ImageBitmapBuilder();
    }

    public static ImageGIFBuilder loadGif() {
        return new ImageGIFBuilder();
    }
}
