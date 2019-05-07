package com.projetfilm.appfilm.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FilmViewAdapter extends RecyclerView.Adapter<FilmViewAdapter.ViewHolder>{

    private List<Film> films;

    public FilmViewAdapter(List<Film> films) {this.films = films;}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Film film = films.get(position);

        TextView textView = holder.titreFilm;
        textView.setText(film.getTitre());
        ImageView imageView = holder.posterFilm;
        Picasso.get().load(film.getLienImage()).fit().into(imageView);
    }

    @Override
    public int getItemCount() {return films.size();}

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titreFilm;
        public ImageView posterFilm;
        public LinearLayout carteFilm;


        public ViewHolder(View itemView) {
            super(itemView);

            titreFilm = (TextView) itemView.findViewById(R.id.titreFilm);
            posterFilm = (ImageView)itemView.findViewById(R.id.posterFilm);
            carteFilm = (LinearLayout) itemView.findViewById(R.id.carteFilm);
        }
    }
}
