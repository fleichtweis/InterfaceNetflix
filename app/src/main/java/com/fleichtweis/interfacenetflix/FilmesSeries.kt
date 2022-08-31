package com.fleichtweis.interfacenetflix

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmesSeries(
    var titulo: String,
    var ano: Int,
    var info: String,
    var descricao: String,
    var resIdImagemThumb: Int,
    var trailer: String,
    var episodios: List<Episodios>
) : Parcelable