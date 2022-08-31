package com.fleichtweis.interfacenetflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EpisodiosAdapter(private val episodios: List<Episodios>, val onClick: (Episodios) -> Unit) : RecyclerView.Adapter<EpisodiosAdapter.EpisodiosViewHolder>() {


    inner class EpisodiosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val textTitulo: TextView
        private val textDuracao: TextView
        private val textDescricao: TextView

        init {
            textTitulo = itemView.findViewById(R.id.textTituloRVEpisodios)
            textDuracao = itemView.findViewById(R.id.textDuracaoRVEpisodios)
            textDescricao = itemView.findViewById(R.id.textDescricaoRVEpisodios)
        }

        fun bind(episodio: Episodios, onClick: (Episodios) -> Unit) {

            itemView.setOnClickListener {
                onClick(episodio)
            }
            textTitulo.text = episodio.titulo
            textDuracao.text = episodio.duracao
            textDescricao.text = episodio.descricao
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodiosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_episodios, parent, false)
        return EpisodiosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EpisodiosViewHolder, position: Int) {
        val episodio = episodios[position]
        holder.bind(episodio, onClick)
    }

    override fun getItemCount(): Int {
        return episodios.size
    }
}