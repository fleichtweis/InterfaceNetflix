package com.fleichtweis.interfacenetflix

class DadosFilmesSeries {

    companion object{
        //Lista Em Alta
        fun carregarFilmesSeries(): List<FilmesSeries> {

            val listaFilmesSeries = mutableListOf<FilmesSeries>()

            with(listaFilmesSeries) {
                add(FilmesSeries(
                    "Game of Thrones",
                    2019,
                    "73 episódios",
                    "Situada nos continentes fictícios de Westeros e Essos, a série centra-se no Trono de Ferro dos Sete Reinos e segue um enredo de alianças e conflitos entre as famílias nobres dinásticas, seja competindo para reivindicar o trono ou lutando por sua independência.",
                    R.drawable.thumb_game_of_thrones,
                    "",
                    carregarEpisodios("Game of Thrones")))
                add(FilmesSeries(
                    "Westworld",
                    2022,
                    "36 episódios",
                    "No futuro, o parque temático Westworld oferece a seus visitantes a oportunidade de conhecer o Velho Oeste em um gigantesco terreno, incluindo a cidade fronteiriça de Sweetwater. A cidade e todo o terreno são ocupados por anfitriões.",
                    R.drawable.thumb_westworld,
                    "",
                    carregarEpisodios("Westworld")))
                add(FilmesSeries(
                    "Breaking Bad",
                    2013,
                    "62 episódios",
                    "Breaking Bad é uma série de televisão americana criada e produzida por Vince Gilligan. Ela retrata a vida do químico Walter White, um homem brilhante frustrado em dar aulas para adolescentes do ensino médio enquanto lida com um filho sofrendo de paralisia cerebral, uma esposa grávida e dívidas intermináveis.",
                    R.drawable.thumb_breaking_bad,
                    "",
                    carregarEpisodios("Breaking Bad")))
                add(FilmesSeries(
                    "Back the Future I",
                    1985,
                    "1h56min",
                    "O filme conta a história de Marty McFly (Michael J. Fox), um adolescente que inevitavelmente volta no tempo até 1955.",
                    R.drawable.thumb_back_future_i,
                    "",
                    carregarEpisodios("Back the Future I")))
                add(FilmesSeries(
                    "Back the Future II",
                    1989,
                    "1h48min",
                    "O filme segue Marty McFly (Fox) e seu amigo Dr. Emmett Doc. Brown (Lloyd), que viajam de 1985 a 2015 para evitar que o filho de Marty estrague o futuro da família McFly",
                    R.drawable.thumb_back_future_ii,
                    "",
                    carregarEpisodios("Back the Future II")))
                add(FilmesSeries(
                    "Back the Future III",
                    1990,
                    "1h58min",
                    "O longa continua a história deixada em aberto na Part II (1989).",
                    R.drawable.thumb_back_future_iii,
                    "",
                    carregarEpisodios("Back the Future III")))
                add(FilmesSeries(
                    "Sonic - O Filme",
                    2020,
                    "1h39min",
                    "Sonic se une a um xerife da cidade chamado Tom para escapar do governo e derrotar o desprezível Dr. Robotnik, que quer roubar os poderes de Sonic por sua robótica.",
                    R.drawable.thumb_sonic,
                    "",
                    carregarEpisodios("Sonic - O Filme")))
                add(FilmesSeries(
                    "Sonic 2",
                    2022,
                    "2h02min",
                    "É o segundo título da planejada série de filmes Sonic the Hedgehog. Meses após os eventos do primeiro filme, Dr. Robotnik retorna do Planeta Cogumelo enquanto Sonic conhece Tails.",
                    R.drawable.thumb_sonic_ii,
                    "",
                    carregarEpisodios("Sonic 2")))
                add(FilmesSeries(
                    "Lupin",
                    2021,
                    "10 episódios",
                    "Inspirado pelas aventuras de Arsène Lupin, o ladrão gentil Assane Diop quer se vingar de uma família rica por uma injustiça cometida contra o pai dele.",
                    R.drawable.thumb_lupin,
                    "",
                    carregarEpisodios("Lupin")))
                add(FilmesSeries(
                    "Silicon Valley",
                    2019,
                    "53 episódios",
                    "Silicon Valley é um sitcom dos Estados Unidos, que conta a história de seis programadores que tentam construir uma carreira bem sucedida no Vale do Silício, Califórnia.",
                    R.drawable.thumb_silicon_valley,
                    "",
                    carregarEpisodios("Silicon Valley")))

            }

            return listaFilmesSeries
        }

        //Lista Lançamentos
        fun carregarLancamentos(): List<FilmesSeries>{

            val listaLancamentos = mutableListOf<FilmesSeries>()

            with(listaLancamentos){
                add(
                    FilmesSeries(
                        "Angry Birds 2",
                        2019,
                        "1h36min",
                        "O Rei Barba de Barro, o governante dos maus porcos, trinhou a sua terra de refrigerantes, e que arrasaram a sua terra, em uma batalha, que, levando a uma guerra roxa, ameaçando - os, e os seus próprios planos para transformar em uma nova era do gelo.",
                        R.drawable.thumb_angry_birds,
                        "https://movietrailers.apple.com/movies/sony_pictures/the-angry-birds-movie-2/the-angry-birds-movie-2-trailer-1_h480p.mov",
                        carregarEpisodios("Angry Birds 2")
                    )
                )
                add(
                    FilmesSeries(
                        "Cobra Kai",
                        2021,
                        "40 episódios",
                        "Décadas depois da competição que mudou suas vidas, a rivalidade entre Johnny e Daniel está de volta nesta sequência da trilogia Karatê Kid.",
                        R.drawable.thumb_cobra_kai,
                        "local",
                        carregarEpisodios("Cobra Kai")
                    )
                )
                add(
                    FilmesSeries(
                        "Alma",
                        2022,
                        "9 episódios",
                        "Após perder a memória em um acidente que matou a maioria de seus colegas, Alma tenta descobrir o que aconteceu naquele dia e recuperar sua identidade.",
                        R.drawable.thumb_alma,
                        "",
                        carregarEpisodios("Alma")
                    )
                )
                add(
                    FilmesSeries(
                        "Sandman",
                        2022,
                        "11 episódios",
                        "Após anos aprisionado, Morpheus, o Rei dos Sonhos, embarca em uma jornada entre mundos para recuperar o que lhe foi roubado e restaurar seu poder.",
                        R.drawable.thumb_sandman,
                        "",
                        carregarEpisodios("Sandman")
                    )
                )
                add(
                    FilmesSeries(
                        "A Grande Muralha",
                        2016,
                        "1h43min",
                        "Mercenários europeus à procura de pólvora durante a dinastia Song, na China, descobrem que uma guerra está sendo travada entre os heróis do país e monstros selvagens.",
                        R.drawable.thumb_grande_muralha,
                        "",
                        carregarEpisodios("A Grande Muralha")
                    )
                )
                add(
                    FilmesSeries(
                        "Stranger Things",
                        2022,
                        "34 episódios",
                        "Quando um garoto desaparece, a cidade toda participa nas buscas. Mas o que encontram são segredos, forças sobrenaturais e uma menina.",
                        R.drawable.thumb_stranger_things,
                        "",
                        carregarEpisodios("Stranger Things")
                    )
                )
            }

            return listaLancamentos
        }

        //Lista Episódios
        fun carregarEpisodios(titulo: String): List<Episodios>{
            val listaEpisodios = mutableListOf<Episodios>()

            with(listaEpisodios){
                when(titulo){
                    "Game of Thrones" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "Westworld" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "Breaking Bad" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "Back the Future I" -> add(Episodios("Filme", "1h56min", "O filme conta a história de Marty McFly (Michael J. Fox), um adolescente que inevitavelmente volta no tempo até 1955."))

                    "Back the Future II" -> add(Episodios("Filme", "1h48min", "O filme segue Marty McFly (Fox) e seu amigo Dr. Emmett Doc. Brown (Lloyd), que viajam de 1985 a 2015."))

                    "Back the Future III" -> add(Episodios("Filme", "1h58min", "O longa continua a história deixada em aberto na Part II (1989)."))

                    "Sonic - O Filme" -> add(Episodios("Filme", "1h39min", "Sonic se une a um xerife da cidade chamado Tom para escapar do governo e derrotar o desprezível Dr. Robotnik."))

                    "Sonic 2" -> add(Episodios("Filme", "2h02min", "É o segundo título da planejada série de filmes Sonic the Hedgehog."))

                    "Lupin" -> {
                        add(Episodios("Capítulo 1", "48min", "Anos depois de uma trágica injustiça, Assane tenta acertar as contas – e quitar uma dívida – roubando um colar de diamante, mas o roubo não sai como esperado."))
                        add(Episodios("Capítulo 2", "53min", "Assane bola um plano para entrar em contato com Comet, um preso que o leva a uma pista sobre a morte de Babakar. Anne Pellegrini se abre sobre o passado."))
                        add(Episodios("Capítulo 3", "43min", "Assane confronta o comissário Dumont e dá um jeito de despistar a polícia. A ligação de Hubert Pellegrini com o destino de Babakar vem à tona."))
                        add(Episodios("Capítulo 4", "48min", "Assane pede ajuda a uma jornalista para conseguir provas contra Hubert. O policial Guédira liga os pontos no caso do assalto ao Louvre."))
                        add(Episodios("Capítulo 5", "44min", "A caminho de Étretat com Claire e Raoul, Assane encontra uma figura inoportuna. Encurralado, Assane manda uma mensagem ao capitão Laugier."))
                    }

                    "Silicon Valley" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "Angry Birds 2" -> add(Episodios("Filme", "1h36min", "O Rei Barba de Barro, o governante dos maus porcos, trinhou a sua terra de refrigerantes, e que arrasaram a sua terra, em uma batalha, levando a uma guerra roxa."))

                    "Cobra Kai" -> {
                        add(Episodios("1. Degenerado", "29min", "Enchendo a cara e vivendo à sombra do antigo rival, Johnny chega ao fundo do poço e decide reabrir o dojô de caratê Cobra Kai."))
                        add(Episodios("2. Acerte primeiro", "28min", "Daniel fica abalado ao ver o novo dojô Cobra Kai. Mais tarde, ele descobre que o crush de Sam se envolveu numa briga violenta."))
                        add(Episodios("3. Esqueleto", "24min", "Daniel tenta ir em uma festa para ficar de olho em Sam. Johnny tenta conseguir mais alunos para seu novo empreendimento."))
                        add(Episodios("4. Cobra Kai para sempre", "28min", "Um outdoor de Daniel é pichado. Miguel é proibido pela mãe de continuar com as aulas de caratê. Johnny descobre que Robby anda matando aula."))
                        add(Episodios("5. Contrapeso", "34min", "O Cobra Kai tem uma nova aluna. Daniel bola um plano para se vingar de Johnny. Traída por Kyler, Sam recebe o apoio de Miguel na escola."))
                        add(Episodios("6. Alunos novos", "31min", "As matrículas no Cobra Kai aumentam após a luta de Miguel, mas Johnny destrata os alunos. Robby começa a trabalhar para Daniel."))
                        add(Episodios("7. A competição", "30min", "Para inscrever o Cobra Kai em um torneio, Johnny precisa convencer o comitê, que tem Daniel como um dos membros. Miguel e Sam saem juntos."))
                        add(Episodios("8. Transformação", "31min", "Johnny prepara seus alunos para o torneio. Daniel treina Robby em Miyagi-Do sem se dar conta de que ele é filho de Johnny."))
                        add(Episodios("9. Diferentes, mas iguais", "32min", "Uma discussão entre Johnny e Daniel desperta lembranças do passado. Os alunos do Cobra Kai tramam vingança contra uma garotada."))
                        add(Episodios("10. Compaixão – Parte 1", "38min", "No começo do torneio, Johnny ensina a seus alunos a terceira regra do Cobra Kai. Um rosto familiar do passado dá as caras."))
                    }

                    "Alma" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "Sandman" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    "A Grande Muralha" -> add(Episodios("Filme", "1h43min", "Mercenários europeus à procura de pólvora durante a dinastia Song, na China, descobrem que uma guerra está sendo travada entre os heróis do país e monstros selvagens."))

                    "Stranger Things" -> {
                        add(Episodios("Episódio 01", "59min", "Breve descrição do episódio 1."))
                        add(Episodios("Episódio 02", "57min", "Breve descrição do episódio 2."))
                        add(Episodios("Episódio 03", "58min", "Breve descrição do episódio 3."))
                    }

                    else -> add(Episodios("Episódio 00", "0min", "Descrição do episódio."))
                }

            }

            return listaEpisodios
        }

    }
}