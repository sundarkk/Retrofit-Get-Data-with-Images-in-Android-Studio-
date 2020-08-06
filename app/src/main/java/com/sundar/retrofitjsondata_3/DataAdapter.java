package com.sundar.retrofitjsondata_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.xml.sax.Parser;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{

    Context context;
    List<DataModel>dataModelList;

     //Create Constructor
    public DataAdapter(Context context, List<DataModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false);

        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {

               holder.TvAlbumid.setText(String.valueOf(dataModelList.get(position).getAlbumId()));
               holder.TvId1.setText(String.valueOf(dataModelList.get(position).getId()));



                 holder.TvTitle1.setText(String.valueOf(dataModelList.get(position).getTitle()));

                 Picasso.with(context).load(dataModelList.get(position).getUrl())//https://img.icons8.com/plasticine/2x/image.png
                         .error(R.drawable.ic_launcher_background)
                         //.placeholder(R.drawable.ic_launcher_foreground)
                         .into(holder.profilepic1);
        Picasso.with(context).load("https://img.icons8.com/plasticine/2x/image.png")//https://img.icons8.com/plasticine/2x/image.png
                .error(R.drawable.ic_launcher_background)
                .into(holder.profilepic2);

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TvAlbumid,TvId1,TvTitle1;
        ImageView profilepic1,profilepic2;
          public ViewHolder(@NonNull View itemView) {
            super(itemView);

         TvAlbumid = (TextView) itemView.findViewById(R.id.TvAlbumid);
         TvId1 = (TextView) itemView.findViewById(R.id.TvId1);
         TvTitle1 = (TextView) itemView.findViewById(R.id.TvTitle1);
         profilepic1 = (ImageView) itemView.findViewById(R.id.profilepic1);
         profilepic2 = (ImageView) itemView.findViewById(R.id.profilepic2);


        }
    }
}
