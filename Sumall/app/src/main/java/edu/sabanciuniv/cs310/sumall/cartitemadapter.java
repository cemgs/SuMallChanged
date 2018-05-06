package edu.sabanciuniv.cs310.sumall;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.sql.Array;
import java.util.List;

/**
 * Created by Cemges on 5/6/2018.
 */

public class cartitemadapter  extends ArrayAdapter<cartitem> {

    private Activity context;

    cartitemadapter(Activity context, List<cartitem> tasklist) {
        super(context, R.layout.cartitem, tasklist);
        this.context = context;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        if(rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.cartitem, null);
        }

        final cartitem citem = getItem(position);

        TextView textViewName = rowView.findViewById(R.id.itemname);
        TextView textViewPrice = rowView.findViewById(R.id.itemprice);
        TextView textViewCount = rowView.findViewById(R.id.itemcount);



        textViewName.setText(citem.name);
        textViewPrice.setText(citem.price);
        textViewCount.setText(citem.count);


        return rowView;
    }





}
