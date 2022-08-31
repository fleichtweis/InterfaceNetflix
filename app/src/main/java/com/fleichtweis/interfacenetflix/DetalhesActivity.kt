package com.fleichtweis.interfacenetflix

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.fleichtweis.interfacenetflix.databinding.ActivityDetalhesBinding
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.upstream.RawResourceDataSource
import java.io.IOException

class DetalhesActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesBinding.inflate(layoutInflater)
    }

    lateinit var player: ExoPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Layout em tela cheia
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(binding.root)

        val bundle = intent.extras
        val filmeSerie = bundle?.getParcelable<FilmesSeries>("filme_serie")

        if (filmeSerie != null){
            binding.textTituloDetalhesActivity.text = filmeSerie.titulo
            binding.textAnoDetalhesActivity.text = filmeSerie.ano.toString()
            binding.textInfoDetalhesActivity.text = filmeSerie.info
        }

        //RecyclerView "Episódios"
        binding.rvEpisodios.adapter = filmeSerie?.episodios?.let {
            EpisodiosAdapter(it){
                Toast.makeText(this, it.titulo, Toast.LENGTH_SHORT).show()
            }
        }
        binding.rvEpisodios.layoutManager = LinearLayoutManager(this)


        inicializaPlayer(filmeSerie?.trailer)

    }

    override fun onStop() {
        player.stop()
        player.release()
        super.onStop()
    }

    fun inicializaPlayer(trailer: String?) {
        try {
            player = ExoPlayer.Builder(this).build()


            val streamURL = if (trailer.isNullOrEmpty()){
                Uri.parse("https://static.vecteezy.com/system/resources/previews/007/515/196/mp4/drone-top-view-of-beautiful-turquoise-sea-waves-breaking-on-sandy-coastline-flying-aerial-shot-of-golden-beach-meeting-deep-blue-ocean-water-and-foamy-waves-nature-seascape-relaxing-and-summer-free-video.mp4")
            } else if (trailer == "local") {
                Uri.parse(RawResourceDataSource.buildRawResourceUri(R.raw.cobrakaitrailer).toString())
            } else{
                Uri.parse(trailer)
            }


            binding.playerViewTrailer.player = player

            val mediaItem = MediaItem.fromUri(streamURL)
            player.setMediaItem(mediaItem)
            player.prepare()
            player.play()

        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        } catch (e: SecurityException) {
            e.printStackTrace()
        } catch (e: IllegalStateException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
            Log.e("TAG", "Error : $e")
        }





        /*
        TENTATIVA COM PLAYERVIEW

        //val videoURL = "https://www.youtube.com/watch?v=M3S_h4yiqm4"
        val videoURL = "https://developers.google.com/training/images/tacoma_narrows.mp4"
        val uri = Uri.parse(videoURL)
        binding.videoTrailerDetalhesActivity.setVideoURI(uri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoTrailerDetalhesActivity)
        mediaController.setMediaPlayer(binding.videoTrailerDetalhesActivity)

        binding.videoTrailerDetalhesActivity.setMediaController(mediaController)

        binding.videoTrailerDetalhesActivity.requestFocus()
        binding.videoTrailerDetalhesActivity.start()


        *//*val url = "https://developers.google.com/training/images/tacoma_narrows.mp4" // your URL here
        val mediaPlayer: MediaPlayer? = MediaPlayer().apply {
            //setAudioStreamType(AudioManager.STREAM_MUSIC)
            setDataSource(url)
            //prepare() // might take long! (for buffering, etc)
            prepareAsync()
        }

        mediaPlayer?.start()*/

    }
}