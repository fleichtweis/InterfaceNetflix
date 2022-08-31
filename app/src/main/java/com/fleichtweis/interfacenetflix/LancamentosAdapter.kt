package com.fleichtweis.interfacenetflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LancamentosAdapter(private val onClick: (FilmesSeries) -> Unit) : RecyclerView.Adapter<LancamentosAdapter.LancamentosViewHolder>() {

    private val lancamentos = DadosFilmesSeries.carregarLancamentos()

    inner class LancamentosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val imageLancamento: ImageView
        private val textAno: TextView
        private val textInfo: TextView

        init {
            imageLancamento = itemView.findViewById(R.id.imageLancamento)
            textAno = itemView.findViewById(R.id.textAno)
            textInfo = itemView.findViewById(R.id.textInfo)
        }

        fun bind(lancamento: FilmesSeries, onClick: (FilmesSeries) -> Unit){

            itemView.setOnClickListener {
                onClick(lancamento)
            }

            imageLancamento.setImageResource(lancamento.resIdImagemThumb)
            textAno.text = lancamento.ano.toString()
            textInfo.text = lancamento.info
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LancamentosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_lancamentos, parent, false)
        return LancamentosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LancamentosViewHolder, position: Int) {
        val lancamento = lancamentos[position]
        holder.bind(lancamento, onClick)
    }

    override fun getItemCount(): Int {
        return lancamentos.size
    }
}