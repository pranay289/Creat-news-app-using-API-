package com.pranay.mynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class Postadpter extends Adapter<postviewholder> {
    private List<Article> articles;
    private Context context;

    public class postviewholder extends ViewHolder {
        TextView description;
        ImageView imageView;
        TextView posttitle;

        public postviewholder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(C0548R.C0550id.postimg);
            this.posttitle = (TextView) itemView.findViewById(C0548R.C0550id.posttitle);
            this.description = (TextView) itemView.findViewById(C0548R.C0550id.description);
        }
    }

    public Postadpter(Context context2, List<Article> articles2) {
        this.context = context2;
        this.articles = articles2;
    }

    public postviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new postviewholder(LayoutInflater.from(this.context).inflate(C0548R.layout.item, parent, false));
    }

    public void onBindViewHolder(postviewholder holder, int position) {
        Article article = (Article) this.articles.get(position);
        holder.posttitle.setText(article.getTitle());
        holder.description.setText(article.getDescription());
        new ArrayList();
        Glide.with(this.context).load(article.getUrlToImage()).into(holder.imageView);
    }

    public int getItemCount() {
        return this.articles.size();
    }
}
