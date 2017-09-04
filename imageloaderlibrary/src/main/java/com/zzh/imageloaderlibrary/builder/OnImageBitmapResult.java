package com.zzh.imageloaderlibrary.builder;

import android.graphics.drawable.Drawable;

import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;

/**
 * 车主邦
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/9/4.
 */

public interface OnImageBitmapResult {

    /**
     * 获取bitmap 成功的回调
     *
     * @param resource
     * @param glideAnimation
     */
    void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation);

    /**
     * 获取bitmap 失败的回调
     *
     * @param e
     * @param errorDrawable
     */
    void onLoadFailed(Exception e, Drawable errorDrawable);
}
