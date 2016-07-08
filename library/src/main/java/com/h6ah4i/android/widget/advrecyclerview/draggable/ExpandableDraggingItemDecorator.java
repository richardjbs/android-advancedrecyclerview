/*
 *    Copyright (C) 2015 Haruki Hasegawa
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.h6ah4i.android.widget.advrecyclerview.draggable;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class ExpandableDraggingItemDecorator extends DraggingItemDecorator {
    @SuppressWarnings("unused")
    private static final String TAG = "ExpandableDraggingItemDecorator";

    private float mExpandedScaleX = 1.1f;
    private float mExpandedScaleY = 1.1f;


    /**
     * Gets the scaleX used for the item expanded version
     *
     * @return used expanded scaleX
     */
    public float getExpandedScaleX()
    {
        return mExpandedScaleX;
    }

    /**
     * Sets the scaleX used for the item expanded version
     *
     * @param expandedScaleX expanded scaleX to use
     */
    public void setExpandedScaleX(float expandedScaleX)
    {
        this.mExpandedScaleX = expandedScaleX;
    }

    /**
     * Gets the scaleY used for the item expanded version
     *
     * @return used expanded scaleY
     */
    public float getExpandedScaleY()
    {
        return mExpandedScaleY;
    }

    /**
     * Sets the scaleY used for the item expanded version
     *
     * @param expandedScaleY expanded scaleY to use
     */
    public void setExpandedScaleY(float expandedScaleY)
    {
        this.mExpandedScaleY = expandedScaleY;
    }

    public ExpandableDraggingItemDecorator(RecyclerView recyclerView, RecyclerView.ViewHolder draggingItem, ItemDraggableRange range) {
        super(recyclerView, draggingItem, range);
    }

    @Override
    protected Bitmap createDraggingItemImage(View v, NinePatchDrawable shadow)
    {
        Bitmap draggingItemImage = super.createDraggingItemImage(v, shadow);

        int newWidth = (int)(draggingItemImage.getWidth() * mExpandedScaleX);
        int newHeight = (int)(draggingItemImage.getHeight() * mExpandedScaleY);

        return getExpandedDraggingItemImage(draggingItemImage, newWidth, newHeight);
    }

    public Bitmap getExpandedDraggingItemImage(Bitmap bm, int newWidth, int newHeight) {
        int width = bm.getWidth();
        int height = bm.getHeight();

        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;

        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);

        Bitmap resizedBitmap = Bitmap.createBitmap(
                bm, 0, 0, width, height, matrix, false);
        bm.recycle();
        return resizedBitmap;
    }
}