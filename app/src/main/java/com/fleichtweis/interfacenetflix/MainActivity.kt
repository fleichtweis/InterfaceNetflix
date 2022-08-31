package com.fleichtweis.interfacenetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fleichtweis.interfacenetflix.databinding.ActivityMainBinding
import com.fleichtweis.interfacenetflix.databinding.BottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val bindingBSD by lazy {
        BottomSheetDialogBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Layout em tela cheia - Display content edge-to-edge
        //https://developer.android.com/develop/ui/views/layout/edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(binding.root)

        //RecyclerView "Em Alta"
        binding.rvEmAlta.adapter = FilmesSeriesAdapter{
            showBottomSheetDialog(it)
        }
        binding.rvEmAlta.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        //RecyclerView "Lançamentos"
        binding.rvLancamentos.adapter = LancamentosAdapter{
            showBottomSheetDialog(it)
        }
        binding.rvLancamentos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


    }

    fun showBottomSheetDialog(filmeSerie: FilmesSeries){

        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog)

        val imageBSD = bottomSheetDialog.findViewById<ImageView>(R.id.imageBSD)
        val textTituloBSD = bottomSheetDialog.findViewById<TextView>(R.id.textTituloBSD)
        val textAnoBSD = bottomSheetDialog.findViewById<TextView>(R.id.textAnoBSD)
        val textInfoBSD = bottomSheetDialog.findViewById<TextView>(R.id.textInfoBSD)
        val textDescricaoBSD = bottomSheetDialog.findViewById<TextView>(R.id.textDescricaoBSD)
        val btnMaisInfoBSD = bottomSheetDialog.findViewById<Button>(R.id.btnMaisInfoBSD)
        val btnCloseBSD = bottomSheetDialog.findViewById<Button>(R.id.btnCloseBSD)

        imageBSD?.setImageResource(filmeSerie.resIdImagemThumb)
        textTituloBSD?.text = filmeSerie.titulo
        textAnoBSD?.text = filmeSerie.ano.toString()
        textInfoBSD?.text = filmeSerie.info
        textDescricaoBSD?.text = filmeSerie.descricao


        btnMaisInfoBSD?.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra("filme_serie", filmeSerie)
            startActivity(intent)
            bottomSheetDialog.dismiss()
        }

        btnCloseBSD?.setOnClickListener {
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.show()


        /*
        * Usando com o binding ocorre um erro.
        * no primeiro clique abre o bottom sheet dialog normal, ao voltar e clicar novamente,
        * ao abrir pela segunda vez ocorre o erro.
        * Mensagem do erro: The specified child already has a parent. You must call removeView() on the child's parent first.

        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(bindingBSD.root)

        bindingBSD.imageBSD.setImageResource(filmeSerie.resIdImagemThumb)
        bindingBSD.textTituloBSD.text = filmeSerie.titulo
        bindingBSD.textAnoBSD.text = filmeSerie.ano.toString()
        bindingBSD.textInfoBSD.text = filmeSerie.info

        //Clique nos botões do layout
        bindingBSD.btnMaisInfoBSD.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)
            startActivity(intent)
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.show()

        */

    }
}