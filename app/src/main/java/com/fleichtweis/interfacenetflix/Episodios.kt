package com.fleichtweis.interfacenetflix

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Episodios (
    var titulo: String,
    var duracao: String,
    var descricao: String,
) : Parcelable