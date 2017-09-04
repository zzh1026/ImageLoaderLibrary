package com.zzh.imageloaderlibrary.imagestrategy.strategyimpl;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.GifRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.zzh.imageloaderlibrary.builder.OnImageBitmapResult;
import com.zzh.imageloaderlibrary.imagestrategy.BaseImageLoaderStrategy;
import com.zzh.imageloaderlibrary.loadconfig.BaseLoadImage;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadBitmap;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadGifImage;
import com.zzh.imageloaderlibrary.loadconfig.loadextend.LoadImage;

/**
 * ---------------------------
 * <p>
 * Created by zhaozh on 2017/8/29.
 */

public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy {

    @Override
    public void loadImage(Context context, LoadImage img) {
        loadImage(Glide.with(context), img);
    }

    @Override
    public void loadImage(Activity activity, LoadImage img) {
        loadImage(Glide.with(activity), img);
    }

    @Override
    public void loadImage(Fragment fragment, LoadImage img) {
        loadImage(Glide.with(fragment), img);
    }

    @Override
    public void loadBitmap(Context context, LoadBitmap img) {
        loadImage(Glide.with(context), img);
    }

    @Override
    public void loadBitmap(Activity activity, LoadBitmap img) {
        loadImage(Glide.with(activity), img);
    }

    @Override
    public void loadBitmap(Fragment fragment, LoadBitmap img) {
        loadImage(Glide.with(fragment), img);
    }

    @Override
    public void loadGif(Context cxt, LoadGifImage img) {
        loadImage(Glide.with(cxt), img);
    }

    @Override
    public void loadGif(Activity activity, LoadGifImage img) {
        loadImage(Glide.with(activity), img);
    }

    @Override
    public void loadGif(Fragment fragment, LoadGifImage img) {
        loadImage(Glide.with(fragment), img);
    }

    private void loadImage(RequestManager requestManager, LoadImage img) {
        DrawableRequestBuilder<String> requestBuilder = getRequestBuilder(requestManager, img);
        requestBuilder.thumbnail(0.1f);
        if (img.centercrop) {
            requestBuilder.centerCrop();
        } else {
            requestBuilder.fitCenter();
        }
        if (img.isCrossFade) {
            requestBuilder.crossFade();
        }
        requestBuilder.into(img.imageView);
    }

    private void loadImage(RequestManager requestManager, final LoadBitmap img) {
        DrawableRequestBuilder<String> requestBuilder = getRequestBuilder(requestManager, img);
        final OnImageBitmapResult imageBitmapResult = img.onImageBitmapResult;
        if (img.onImageBitmapResult != null) {
            requestBuilder.into(new SimpleTarget<GlideDrawable>() {
                @Override
                public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                    imageBitmapResult.onResourceReady(resource, glideAnimation);
                }

                @Override
                public void onLoadFailed(Exception e, Drawable errorDrawable) {
                    imageBitmapResult.onLoadFailed(e, errorDrawable);
                }
            });
        }
    }

    private void loadImage(RequestManager requestManager, LoadGifImage img) {
        DrawableTypeRequest request;
        if (!TextUtils.isEmpty(img.url)) {
            request = requestManager.load(img.url);
        } else {
            request = requestManager.load(img.gifResourceId);
        }
        GifRequestBuilder gifBuilder = request.asGif()
                .error(img.errorImageResource)
                .diskCacheStrategy(img.strategy)
                .placeholder(img.placeholderResource);
        if (img.bitmapTransformation != null) {
            gifBuilder.transformFrame(img.bitmapTransformation);
        }
        if (img.centercrop) {
            gifBuilder.centerCrop();
        } else {
            gifBuilder.fitCenter();
        }
        if (img.isCrossFade) {
            gifBuilder.crossFade();
        }
        gifBuilder.into(img.imageView);
    }

    private DrawableRequestBuilder<String> getRequestBuilder(RequestManager requestManager, BaseLoadImage img) {
        DrawableRequestBuilder<String> requestBuilder = requestManager.load(img.url)
                .placeholder(img.placeholderResource)
                .error(img.errorImageResource)
                .diskCacheStrategy(img.strategy);
        if (img.bitmapTransformation != null) {
            requestBuilder.bitmapTransform(img.bitmapTransformation);
        }
        return requestBuilder;
    }
}
