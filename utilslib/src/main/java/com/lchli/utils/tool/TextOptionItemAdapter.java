package com.lchli.utils.tool;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lchli.utils.R;
import com.lchli.utils.base.AbsAdapter;


/**
 * Created by lichenghang on 2018/5/20.
 */

public class TextOptionItemAdapter extends AbsAdapter<String> {


    @Override
    public AbsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new H(viewType, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull AbsViewHolder holder, int position) {
        H h = (H) holder;
        h.text_view.setText(getItem(position));
    }


    private class H extends AbsAdapter.AbsViewHolder {
        private TextView text_view;
        private View itemView;

        public H(int viewType, Context context) {
            super(viewType);
            itemView = View.inflate(context, R.layout.list_item_insert_image_dialog, null);
            text_view = (TextView) itemView.findViewById(R.id.text_view);

        }

        @Override
        protected View getItemView() {
            return itemView;
        }
    }
}
