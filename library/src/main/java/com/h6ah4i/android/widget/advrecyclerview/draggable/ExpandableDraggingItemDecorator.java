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

import android.support.v7.widget.RecyclerView;

class ExpandableDraggingItemDecorator extends DraggingItemDecorator {
    @SuppressWarnings("unused")
    private static final String TAG = "ExpandableDraggingItemDecorator";

    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mExpandedScaleX = 1.2f;
    private float mExpandedScaleY = 1.2f;


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

//    @Override
//    public void start(MotionEvent e, DraggingItemInfo draggingItemInfo) {
//        Log.w("MY_TEST", "start");
//        updateDraggingItemScale(mExpandedScaleX, mExpandedScaleY);
//        ViewCompat.postInvalidateOnAnimation(mRecyclerView);
//
//        super.start(e, draggingItemInfo);
//    }

//    @Override
//    public boolean refresh(boolean force)
//    {
//        final int prevTranslationX = mTranslationX;
//        final int prevTranslationY = mTranslationY;
//
//        updateTranslationOffset();
//
//        final boolean updated = (prevTranslationX != mTranslationX) || (prevTranslationY != mTranslationY);
//
//        if (updated || force) {
//            updateDraggingItemPosition(mTranslationX, mTranslationY);
//            ViewCompat.postInvalidateOnAnimation(mRecyclerView);
//        }
//
//        return updated;
//    }


//    @Override
//    public boolean refresh(boolean force)
//    {
//        Log.w("MY_TEST", "refresh_");
//        boolean updated = super.refresh(force);
//        updateDraggingItemScale(mExpandedScaleX, mExpandedScaleY);
//        ViewCompat.postInvalidateOnAnimation(mRecyclerView);
//        return updated;
//    }

    //    @Override
//    public void finish(boolean animate) {
//        Log.w("ExpandableDraggingI", "finish");
//        updateDraggingItemScale(1.0f, 1.0f);
//        super.finish(animate);
//    }

//    private void updateDraggingItemScale(float scaleX, float scaleY) {
//        final boolean updated = (mScaleX != scaleX) || (mScaleY != scaleY);
//        Log.w("MY_TEST", "updateDraggingItemScale - updated: " + updated);
//        // NOTE: Need to update the view position to make other decorations work properly while dragging
//        if (mDraggingItemViewHolder != null && updated) {
//            Log.w("MY_TEST", "updateDraggingItemScale.setItemScale x: " + scaleX + ", y: " + scaleY);
//            setItemScale(
//                    mRecyclerView, mDraggingItemViewHolder,
//                    scaleX,
//                    scaleY);
//
//            mScaleX = scaleX;
//            mScaleY = scaleY;
//        }
//    }
}