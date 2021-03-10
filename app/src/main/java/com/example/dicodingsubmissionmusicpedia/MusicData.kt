package com.example.dicodingsubmissionmusicpedia

object MusicData {
    private val names = arrayOf(
        "Nirvana",
        "The Beatles",
        "Guns N' Roses",
        "Queen",
        "Air Supply",
        "The Rolling Stones",
        "Bee Gees",
        "Maroon 5",
        "Coldplay",
        "Radiohead",
    )

    private val img_bands = arrayOf(
        "https://i.pinimg.com/236x/3d/4a/3a/3d4a3a83e184c5817717c08ca1c5b2dc.jpg",
        "https://i.pinimg.com/236x/26/64/21/2664218536866d138c8588a90ff469a9.jpg",
        "https://i.pinimg.com/236x/64/24/05/642405ac1e436b8020dc074d71392697.jpg",
        "https://i.pinimg.com/236x/6e/a1/56/6ea1569fa8c5f450f210257c1b7e6447.jpg",
        "https://i.pinimg.com/236x/49/6b/82/496b82dcda19f13d257a803f3c208222.jpg",
        "https://i.pinimg.com/236x/9e/d3/8f/9ed38f4b8320f4f4a3899e83e76bc390.jpg",
        "https://i.pinimg.com/236x/b7/bb/28/b7bb28bd13499e47adf7c63f4c7416bd.jpg",
        "https://i.pinimg.com/236x/46/81/01/4681013ccbc127258a35e67b3e3534b0.jpg",
        "https://i.pinimg.com/236x/d9/a9/7a/d9a97af9c5af52913fbce85291d920ff.jpg",
        "https://i.pinimg.com/236x/ab/27/0a/ab270a2abd36ebc40d456d4ff0aeb7e6.jpg",
    )

    private val dates = arrayOf(
        "1987",
        "1960",
        "1984",
        "1970",
        "1975",
        "1963",
        "1958",
        "1997",
        "1996",
        "1985",
    )

    private val members = arrayOf(
        "Kurt Cobain (Gitar / Vokal), Krist Novoselic (Bass), Dave Grohl (Drum)",
        "John Lennon (Vokal), Paul McCartney (Gitar), Ringo Star (Drum), George Harrison (Bass)",
        "Axl Rose (Vokal), Slahs (Gitar), Duff McKagan (Bass), Izzy Stradlin (Gitar), Steven Adler (Drum)",
        "Freddy Mercury (Vokal), Brian May (Gitar), John Deacon (Bass), Roger Taylor (Drum)",
        "Russel Hitchcock (Vokal), Graham Russel (Vokal / Gitar)",
        "Mick Jagger (Vokal), Keith Richards (Gitar), Brian Jones (Gitar), Ronnie Wood (Saksofon), Charlie Watts (Drum)",
        "Barry Gibb (Piano), Robin Gibb (Piaono / Vokal), Maurice Gibb (Gitar)",
        "Adam Levine (Vokal), James Valentine (Gitar), PJ Morton (Kibor), Michael Madden (Bass), Matt Flynn (Drum)",
        "Chris Martin (Vokal), Guy Berryman (Gitar), Will Champion (Piano), Phil Harvey (Bass)",
        "Thom Yorke (Vokal), Jonny Greenwood (Gitar), Ed O'Brien (Gitar), Colin Greenwood (Bass)",
    )

    private val descriptions = arrayOf(
        "Nirvana adalah nama sebuah grup band dari Kota Aberdeen, Washington, Amerika Serikat, kemudian akhirnya mereka mendapatkan kesuksesan di Kota Seattle, Amerika Serikat, yang terkenal dengan aliran musik grunge, atau yang dikenal juga dengan Seattle Sound.",
        "The Beatles adalah kelompok pemusik Inggris beraliran rock, dibentuk di Liverpool pada tahun 1960. The Beatles dipandang sebagai perwujudan ide-ide progresif, berpengaruh terhadap revolusi sosial budaya pada dekade 60-an.",
        "Guns N' Roses (GNR) adalah kelompok musik hard rock dari Amerika Serikat yang berdiri pada tahun 1984 dan resmi pada Maret tahun 1985 . Anggota pendiri GNR adalah Axl Rose yang merupakan eks vokalis Hollywood Rose dan Tracii Guns yang juga eks gitaris L.A Guns.",
        "Queen adalah grup musik rok dari Britania Raya yang dibentuk tahun 1970 di London. Karya-karya awal Queen dipengaruhi oleh progressive rock, hard rock dan heavy metal, tetapi mereka mengambil risiko secara bertahap menuju karya-karya yang lebih konvensional dan bersahabat dengan pendengar radio, seperti arena rock dan pop rock.",
        "Air Supply adalah grup soft rock asal Australia yang mengetengahkan duo Graham Russell dan Russell Hitchcock. Graham Russel (gitar, vokal) lahir sebagai Graham Cyril Russell, 11 Juni 1950 di Sherwood, Nottingham, Inggris.",
        "The Rolling Stones adalah sebuah band rock Inggris yang mulai terkenal sejak tahun 1960-an masih terkenal hingga sekarang. Apabila dianalogikan, The Rolling Stones adalah sebuah batu yang hingga kini masih menggelinding, entah sampai kapan.",
        "Bee Gees adalah grup musik yang dulunya terdiri dari tiga bersaudara: Barry, Robin, dan Maurice Gibb. Sepanjang empat puluh tahun karier mereka yang sukses di industri musik rekaman, mereka pernah mengalami dua kali puncak kejayaan.",
        "Maroon 5 adalah sebuah grup musik beraliran pop rock. Grup band ini dibentuk di California, Amerika Serikat. Grup ini awalnya terbentuk pada tahun 1997 dengan nama Kara's Flowers saat mereka masih bersekolah di Sekolah Menengah Atas.",
        "Coldplay adalah grup musik rock yang dibentuk di London, Britania Raya, pada tahun 1996. Grup musik ini terdiri dari Chris Martin sebagai vokalis utama, Jonny Buckland sebagai gitaris utama, Guy Berryman sebagai bassis, dan Will Champion sebagai drummer.",
        "Radiohead adalah sebuah grup musik rock alternatif asal Britania Raya, terbentuk pada tahun 1985. Band ini terdiri dari Thom Yorke (vokal utama, rhythm gitar, piano), Jonny Greenwood (lead gitar, keyboard, modular synthesizer, Ondes Martenot, glockenspiel, dan lain-lain), Ed O'Brien (gitar, vokal, perkusi tambahan)."
    )

    private val top_images1 = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
    )

    private val top_images2 = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
    )

    private val top_images3 = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
    )

    private val top_titles1 = arrayOf(
        "Nevermind",
        "Abbey Road",
        "Appetite for Destruction",
        "A Night at the Opera",
        "Now and Forever",
        "Sticky Fingers",
        "Saturday Night fever",
        "V",
        "Everyday Life",
        "OK Computer",
    )

    private val top_titles2 = arrayOf(
        "In Utero",
        "The Beatles",
        "Use Your Illusion I",
        "Sheer Heart Attack",
        "Lost in Love",
        "Let it Bleed",
        "One Night Only",
        "Red Pill Blues",
        "Parachutes",
        "The Bends",
    )

    private val top_titles3 = arrayOf(
        "Bleach",
        "Let it Be",
        "Chinese Democracy",
        "Innuendo",
        "Air Supply",
        "Goats Head Soup",
        "Spirits Having Flown",
        "Overexposed",
        "A Head Full of Dreams",
        "Kid A",
    )

    private val top_dates1 = arrayOf(
        "1991",
        "1969",
        "1987",
        "1975",
        "1982",
        "1971",
        "1977",
        "2014",
        "2019",
        "1997",
    )

    private val top_dates2 = arrayOf(
        "1993",
        "1968",
        "1991",
        "1974",
        "1980",
        "1969",
        "1998",
        "2017",
        "2000",
        "1995",
    )

    private val top_dates3 = arrayOf(
        "1989",
        "1970",
        "2008",
        "1991",
        "1976",
        "1973",
        "1979",
        "2012",
        "2015",
        "2000",
    )

    val listData: ArrayList<Music>
        get() {
            val list = arrayListOf<Music>()
            for (position in names.indices) {
                val music = Music()
                music.name = names[position]
                music.description = descriptions[position]
                music.img_band = img_bands[position]
                list.add(music)
            }
            return list
        }
}