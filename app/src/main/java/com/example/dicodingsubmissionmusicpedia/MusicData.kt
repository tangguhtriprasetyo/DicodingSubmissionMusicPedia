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
            "https://i.pinimg.com/236x/83/9b/0b/839b0b68854cecc48237c3eac09dcaaa.jpg",
            "https://i.pinimg.com/236x/d1/71/2e/d1712e5449b37b9b415c7a96c7a04424.jpg",
            "https://i.pinimg.com/236x/ad/ac/63/adac638c627cfd32f14a00eb766b1d92.jpg",
            "https://i.pinimg.com/236x/30/25/72/302572fbcc92a6334283ca4bd3391ffc.jpg",
            "https://i.pinimg.com/236x/4b/ff/ca/4bffcae0181801770ac0e6c5edc1d88b.jpg",
            "https://i.pinimg.com/236x/21/4f/22/214f22e7ea2348d475f0e6b1f234a187.jpg",
            "https://i.pinimg.com/236x/56/01/56/56015686c00d4bdd1b21e6353f26ab74.jpg",
            "https://i.pinimg.com/236x/d8/04/9c/d8049cdba362ce228998786e990061c9.jpg",
            "https://i.pinimg.com/236x/d5/47/2a/d5472a15af7b7c6f2a0c3e61c6e30fc5.jpg",
            "https://i.pinimg.com/236x/87/ef/f2/87eff2a926de89c768ec63e353c8048f.jpg",
    )

    private val top_images2 = arrayOf(
            "https://i.pinimg.com/236x/e3/bd/37/e3bd375fbb4e6bf584da57148b63415d.jpg",
            "https://i.pinimg.com/236x/bf/45/49/bf4549fb303061a9a952d1ceb89ec076.jpg",
            "https://i.pinimg.com/236x/31/63/d2/3163d2792bcd4fb53ad02d6fb9fd1a76.jpg",
            "https://i.pinimg.com/236x/8b/df/19/8bdf19021d83cabfd72501198506bb6e.jpg",
            "https://i.pinimg.com/236x/a5/eb/6b/a5eb6b4ccd83ae126e242cd059101fce.jpg",
            "https://i.pinimg.com/236x/cf/ab/d2/cfabd2c59c0166d6a2fbe2794d5f1a9c.jpg",
            "https://i.pinimg.com/236x/c8/c1/a9/c8c1a9b91f1915dd665d165b501f79e1.jpg",
            "https://i.pinimg.com/236x/64/48/9a/64489a44c47f50c7e0019d62b98ed3bd.jpg",
            "https://i.pinimg.com/236x/16/57/9d/16579d5adaa1b3710ac854a3e799e828.jpg",
            "https://i.pinimg.com/236x/d9/63/25/d9632510fd5859428a0a2a1f076baa71.jpg",
    )

    private val top_images3 = arrayOf(
            "https://i.pinimg.com/236x/81/c2/30/81c23079465b93f5c6ebf14f67544c43.jpg",
            "https://i.pinimg.com/236x/c6/28/47/c628471794984dacadcfc618cd41e7d8.jpg",
            "https://i.pinimg.com/236x/c3/00/59/c300597a52db63b7cf7a1fac02384f9c.jpg",
            "https://i.pinimg.com/236x/88/07/61/88076123d561f632fb7ceca23023ce18.jpg",
            "https://i.pinimg.com/236x/53/9e/8c/539e8cee379a30eed3b17edbac8b9ea1.jpg",
            "https://i.pinimg.com/236x/df/fc/2b/dffc2baca2ff1113900106deaee34607.jpg",
            "https://i.pinimg.com/236x/84/ae/1a/84ae1a35dbe986268cf03ccef280ab8f.jpg",
            "https://i.pinimg.com/236x/b2/89/03/b289031f1f5a34db1582c5d50a38bb75.jpg",
            "https://i.pinimg.com/236x/51/9c/56/519c565752cc5eb63ac00d51b72f1322.jpg",
            "https://i.pinimg.com/236x/9b/06/7a/9b067a0465e89f92b0f3e5c78f03d47d.jpg",
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
            "How Deep is Your Love",
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
            "Stayin' Alive",
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

    private val linkWebsites = arrayOf(
            "https://www.nirvana.com/",
            "https://www.thebeatles.com/",
            "https://www.gunsnroses.com/",
            "https://www.queenonline.com/",
            "https://www.airsupplymusic.com/",
            "https://rollingstones.com/",
            "https://www.beegees.com/",
            "https://www.maroon5.com/",
            "https://www.coldplay.com/",
            "https://www.radiohead.com/",
    )

    val listData: ArrayList<Music>
        get() {
            val list = arrayListOf<Music>()
            for (position in names.indices) {
                val music = Music()
                music.name = names[position]
                music.description = descriptions[position]
                music.date = dates[position]
                music.member = members[position]
                music.img_band = img_bands[position]
                music.top_title1 = top_titles1[position]
                music.top_date1 = top_dates1[position]
                music.top_img1 = top_images1[position]
                music.top_title2 = top_titles2[position]
                music.top_date2 = top_dates2[position]
                music.top_img2 = top_images2[position]
                music.top_title3 = top_titles3[position]
                music.top_date3 = top_dates3[position]
                music.top_img3 = top_images3[position]
                music.linkWebsite = linkWebsites[position]
                list.add(music)
            }
            return list
        }
}