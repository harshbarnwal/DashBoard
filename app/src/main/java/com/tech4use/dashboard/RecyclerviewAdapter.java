package com.tech4use.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerviewAdapter extends
        RecyclerView.Adapter<RecyclerviewAdapter.CustomViewholder> {


    // creating the items of the recyclerview
    List<ModelItems> listitems;
    Context context;

    public RecyclerviewAdapter(List<ModelItems> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //creating and inflating the view
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.child_view, null);
        //creating the object of custom viewholder class to return it
        return new CustomViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewholder customViewholder, int i) {
        /**creating the object of Items class
         * to add Items and
         * binding the data
         */
        ModelItems modelItems = listitems.get(i);
        customViewholder.text_tile.setText(modelItems.getText());
        customViewholder.count_text.setText(modelItems.getCount());
        customViewholder.image.setImageResource(modelItems.getImg());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    /**this is the custom viewholder
     * it must extend Viewholder
     */
    public class CustomViewholder extends RecyclerView.ViewHolder {
        //creating the widget to bind the data
        ImageView image;
        TextView text_tile;
        TextView count_text;

        public CustomViewholder(@NonNull View itemView) {
            super(itemView);
            //finding and adding the xml objects
            image = (ImageView) itemView.findViewById(R.id.image);
            text_tile = (TextView) itemView.findViewById(R.id.text_title);
            count_text = (TextView) itemView.findViewById(R.id.count_text);

        }
    }
}
