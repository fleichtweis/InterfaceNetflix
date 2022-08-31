package com.fleichtweis.interfacenetflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class FilmesSeriesAdapter(private val onClick: (FilmesSeries) -> Unit) : RecyclerView.Adapter<FilmesSeriesAdapter.FilmesSeriesViewHolder>() {

    private val filmesSeries = DadosFilmesSeries.carregarFilmesSeries()

    inner class FilmesSeriesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val imageFilmeSerie: ImageView

        init {
            imageFilmeSerie = itemView.findViewById(R.id.imageFilmeSerie)
        }

        fun bind(filmeSerie: FilmesSeries, onClick: (FilmesSeries) -> Unit){

            itemView.setOnClickListener {
                onClick(filmeSerie)
            }
            imageFilmeSerie.setImageResource(filmeSerie.resIdImagemThumb)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesSeriesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_thumbnails, parent, false)
        return FilmesSeriesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FilmesSeriesViewHolder, position: Int) {
        val filmeSerie = filmesSeries[position]
        holder.bind(filmeSerie, onClick)
    }

    override fun getItemCount(): Int {
        return filmesSeries.size
    }

}