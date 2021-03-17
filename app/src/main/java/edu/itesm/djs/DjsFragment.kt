package edu.itesm.djs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_djs.*

/**
 * A simple [Fragment] subclass.
 * Use the [DjsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DjsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_djs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        djs_recycler.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = DjsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Dj>{

        val djs = ArrayList<Dj>()
        djs.add(Dj(R.drawable.armin,"Armin Van Buuren", "Leiden, Países Bajos","“Trance and progressive”", "Según el ranking elaborado por DJ Mag, ha sido nombrado DJ número uno del mundo en 2007, 2008, 2009, 2010 y 2012, siendo el único hasta la fecha en conseguir este galardón cuatro veces consecutivas y cinco veces en total. Desde 2001 conduce A State of Trance, un programa de radio semanal con una audiencia estimada en millones a lo largo de decenas de países, lo cual lo convierte en uno de los programas de radio más escuchados a nivel internacional. Su álbum de estudio Imagine lanzado en 2008 entró en el número uno de la lista neerlandesa de álbumes, siendo así la primera vez que un artista de música dance obtiene ese lugar en las listas neerlandesas. En 2014, fue nominado para un Premio Grammy por la mejor grabación dance por su single «This Is What It Feels Like» con Trevor Guthrie. En los Estados Unidos, mantiene el récord de álbumes ingresados en la lista Dance/Electronic Albums de Billboard, con veintiuno.  Actualmente está ubicado en el puesto n.º 4 de la encuesta realizada en 2020 por la revista DJ Mag.",R.raw.inandoutoflove,"In And Out Of Love"))
        djs.add(Dj(R.drawable.davidguetta,"David Guetta", "París, Francia","Dance", "Se inició como tal en varias discotecas durante las décadas de 1980 y de 1990, antes de fundar Gum Productions y lanzar su primer álbum: Just a Little More Love (2002). Años más tarde llegarían Guetta Blaster (2004), Pop Life (2007), el exitoso One love (2009), el cual incluye los sencillos «When love takes over» —junto a Kelly Rowland— lo que le valió para ganar un Grammy y ganar el éxito en todo el mundo , vendiendo más de 5,5 millones de copias en todo el mundo,8 «Sexy Bitch» —junto a Akon e incluido en el top 5 en Estados Unidos— y «Gettin' Over You» —junto a Chris Willis, Fergie y LMFAO—. Estas tres canciones fueron número uno en el Reino Unido. En 2011, Nothing But The Beat lanzado el 29 de agosto en Reino Unido y el 30 del mismo mes en Estados Unidos este nuevo álbum, con Dedos extra que contiene solamente música electrónica y finalmente, decidió re-lanzar su exitoso álbum con 1000 nuevas canciones bajo el nombre de, Nothing But The Beat 2.0 que contiene los dos CD de este último, y uno extra con 10 remixes de sus canciones más populares.",R.raw.titaniumftsia,"Titanium ft. Sia"))
        djs.add(Dj(R.drawable.martingarrix,"Martin Garrix", "Amstelveen, Países Bajos","Electronic/pop music", "Ingresó a la encuesta anual Top 100 DJ's realizada por la revista DJ Magazine, directamente al puesto 40. En 2014, obtuvo el cuarto puesto y en 2015 fue nombrado tercer lugar. En 2016, 2017 y 2018 fue elegido por la revista como mejor DJ del mundo, colocándolo en el puesto número 1. En 2019 descendió al segundo puesto y en 2020 al tercero. Su éxito comenzó con el lanzamiento de la canción Animals, el 17 de junio de 2013 por la discográfica Spinnin Records. La canción alcanzó el puesto #1 en Bélgica y en Reino Unido, y el puesto #3 en Irlanda. El sencillo Wizard, producido con Jay Hardway, también fue un éxito en numerosos países en 2013.",R.raw.inthenameoflove,"In The Name Of Love"))
        djs.add(Dj(R.drawable.alok,"Alok", "Goiânia, Goiás, Brasil","Brazilian bass", "Alok Achkar Peres Petrillo, (Goiânia, 26 de agosto de 1991), más conocido como Alok es un DJ, compositor y productor brasileño. En 2020, Alok fue votado como el quinto mejor DJ del mundo por la revista británica DJ Mag.",R.raw.itfeelslike,"It Feels Like"))
        djs.add(Dj(R.drawable.dondiablo,"Don Diablo", "Coevorden, Países Bajos","Future", "Don Pepijn Schipper (n. Coevorden, Países Bajos, 27 de febrero de 1980), mejor conocido como Don Diablo es un DJ productor y compositor de EDM. Actualmente ocupa el puesto #6 en la encuesta realizada en 2020 por la revista DJmag, y obtuvo el puesto #8 en el sitio web 1001tracklists en 2020. En 2015, fundó su sello discográfico \"HEXAGON\" y el show de radio con el mismo nombre ",R.raw.starlightcould,"Starlight (Could You Be Mine)"))
        djs.add(Dj(R.drawable.afrojack,"Afrojack", "Spijkenisse, Países Bajos","Dance", "Nick van de Wall (Spijkenisse, Países Bajos; 9 de septiembre de 1987), más conocido como Afrojack, es un DJ y productor neerlandés de EDM. En 2020 ocupó el puesto #7 en la encuesta realizada por la DJ Magazine. En 2007 fundó la discográfica Wall Recordings. También es el CEO de LDH Europe.",R.raw.cantstop,"Can't Stop Me (Radio Edit)"))
        djs.add(Dj(R.drawable.steveaoki,"Steve Aoki", "Miami, Florida, Estados Unidos","EDM", "Steven Hiroyuki Aoki (Miami, 30 de noviembre de 1977) más conocido como Steve Aoki, es un DJ y productor estadounidense de EDM y fundador del sello discográfico Dim Mak Records. Actualmente, ocupa el puesto #9, según el ranking de la revista DJ Mag",R.raw.turbulence,"Turbulence (Original Mix)"))
        djs.add(Dj(R.drawable.skrillex,"Skrillex", "Highland Park, Los Ángeles, California, Estados Unidos","Dance", "Sonny John Moore nació en Los Ángeles, California (15 de enero de 1988), más conocido por su nombre artístico Skrillex, es un productor, cantante, disc-jockey, multiinstrumentista, director de videoclips, compositor y músico estadounidense. ",R.raw.bangarang,"Bangarang feat. Sirah"))
        djs.add(Dj(R.drawable.hardwell,"Hardwell", "Breda, Países Bajos","Dance", "Robbert van de Corput nació en Breda, Países Bajos el 7 de enero de 1988, más conocido como Hardwell, es un DJ , productor y remixer neerlandés, dueño de Revealed Recordings. En 2013 y 2014 fue considerado el DJ #1 del mundo según la encuesta anual que realiza la revista DJmag. Actualmente, ocupa el puesto #17 en los 100 mejores DJ's del mundo. ",R.raw.youngagain,"Young Again"))
        djs.add(Dj(R.drawable.calvinharris,"Calvin Harris", " Dumfries, Reino Unido","Dance", "Adam Richard Wiles (Dumfries, 17 de enero de 1984), más conocido como Calvin Harris, es un DJ, productor, cantante, compositor escocés especializado en música electrónica. Actualmente ocupa el puesto #18 en la encuesta anual de la revista DJmag. ",R.raw.summer,"Summer"))
        djs.add(Dj(R.drawable.carlcox,"Carl Cox", "Mánchester, Reino Unido","Techno", "Carl Cox (Oldham, Gran Mánchester; 29 de julio de 1962) es un reconocido DJ y productor inglés especializado en mezclar música electrónica de los géneros house, techno y tech-house. Actualmente reside en Oldham, Gran Mánchester (Reino Unido). Es uno de los DJ más cotizados mundialmente. Fue nombrado el mejor DJ del año en 1997 por la revista DJmag y considerado el decimoctavo mejor DJ del mundo en 2009 por la misma influyente revista. Asimismo, es considerado por la revista electrónica TheDjlist como el quinto mejor DJ del mundo. Según expertos en música electrónica Carl Cox ocupa el puesto No.1 a nivel mundial en calidad musical y técnica.",R.raw.calypsotrack,"Calypso track"))
        djs.add(Dj(R.drawable.kygo,"Kygo", "Singapur","Deep House", "Kyrre Gørvell-Dahll (Ciudad de Singapur, 11 de septiembre de 1991), más conocido por su nombre artístico Kygo, es un DJ y productor noruego. Durante su carrera, fue ganando popularidad gracias a su remix de la pista \"I See Fire\" de Ed Sheeran, que ha recibido más de 50 millones de obras en SoundCloud y 65 millones de visitas en YouTube. ",R.raw.firestone,"Firestone"))
        djs.add(Dj(R.drawable.zedd,"Zedd", "Sarátov, Rusia","Dance", "Anton Zaslavski (en ruso, Антон Заславский; Sarátov, 2 de septiembre de 1989), conocido por su nombre artístico Zedd, es un músico, disc jockey y productor ruso-alemán, orientado hacia el electro house y ganador de un premio Grammy. Su sonido tiene influencias del house progresivo, complextro y el dubstep. Ocupa el puesto número 35 en la encuesta realizada en 2020 por la revista DJ Magazine. ",R.raw.insideout,"Inside Out"))
        djs.add(Dj(R.drawable.alesso,"Alesso", "Estocolmo, Suecia","Dance", "Alessandro Lindblad (Estocolmo, 7 de julio de 1991), más conocido como Alesso, es un DJ y productor sueco. Es considerado el DJ #45 del mundo según la encuesta realizada en 2020, por la revista DJ Mag. En 2011, hizo su ingreso a la lista ubicándose en la posición #70. ",R.raw.theend,"THE END"))
        djs.add(Dj(R.drawable.charlote,"Charlotte de Witte", "Gante, Bélgica","Techno", "Charlotte de Witte (born 21 July 1992) is a Belgian DJ and record producer. Best known for her \"dark and stripped-back\" brand of minimal techno and acid techno music. She has previously performed under the alias Raving George. She is the founder of the label KNTXT.",R.raw.theageoflove,"The Age of Love"))


        return djs
    }


}