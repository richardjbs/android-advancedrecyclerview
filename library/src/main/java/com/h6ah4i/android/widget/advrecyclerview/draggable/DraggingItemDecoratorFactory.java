package com.h6ah4i.android.widget.advrecyclerview.draggable;

import android.support.v7.widget.RecyclerView;

public class DraggingItemDecoratorFactory {

    public DraggingItemDecorator getItemDecorator(RecyclerView recyclerView,
                                                  RecyclerView.ViewHolder viewHolder,
                                                  ItemDraggableRange itemDraggableRange){
        return new DraggingItemDecorator(recyclerView, viewHolder, itemDraggableRange);
    }
}