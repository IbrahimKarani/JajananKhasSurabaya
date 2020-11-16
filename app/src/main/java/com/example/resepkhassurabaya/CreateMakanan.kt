package com.example.resepkhassurabaya

fun CreateMakanan(): List<DataMakanan> {
    val partListFac = ArrayList<DataMakanan>()
    partListFac.add(
        DataMakanan(
            "Bebek Djangkep",
            "Normalnya, hidangan bebek atau ayam goreng bukanlah makanan yang tahan lama. Kalau tidak disantap di restoran, ya dibawa pulang untuk segera dimakan. Namun Bebek Djangkep menawarkan sesuatu yang sepenuhnya berbeda. Kamu bisa membawa pulang bebek yang telah dibumbui tapi tahan selama dua bulan. Bebek Djangkep mengolah ayam dan bebek dengan cara diungkep dengan bumbu-bumbu pilihan dan kemudian dikemas dalam plastik kedap udara.",
            "Jl. Tidar No. 20 B, Sawahan, Surabaya",
            R.drawable.bebek,
            "Mulai dari 80,0000 IDR."
        )
    )
    partListFac.add(
        DataMakanan(
            "Abon Sapi Padmosusastro",
            "Patmosusastro sebenarnya bukanlah merek dari abon sapi khas Surabaya ini. Patmosusastro adalah nama jalan di mana sentra pembuatan abon berada. Pelopor sekaligus pemilik merek abon paling terkenal di kampung ini adalah Bu Sarti. Ia memulai usaha pembuatan abon sejak 1995. Lantaran kesuksesannya, para tetangga dan bekas pegawainya ikut membuat usaha yang sama.",
            "Jl. Patmosusastro No.86, Darmo, Kecamatan Wonokromo, Surabaya.",
            R.drawable.abon,
            "30,000 IDR per 100 gram."
        )
    )
    partListFac.add(
        DataMakanan(
            "Kerupuk Ikan Kenjeran",
            "Surabaya dan area sekitarnya memiliki kekayaan hasil laut yang melimpah. Kamu pun bisa memilih banyak sekali olahan hasil laut di sini. Salah satu yang paling terkenal di Surabaya adalah kerupuk ikan Kenjeran. Warga sekitar Pantai Kenjeran memiliki keahlian mengolah hasil laut menjadi kerupuk yang gurih dan nikmat. Bukan cuma ikan, kamu juga bisa menemukan kerupuk cumi, udang, kerang, dan bahkan kerupuk rumput laut.",
            "Jl. Raya Pantai Lama, Kenjeran, Bulak, Surabaya",
            R.drawable.kerupuk,
            "Bervariasi."
        )
    )
    partListFac.add(
        DataMakanan(
            "Olahan Mangrove",
            "Siapa sangka buah dan pohon bakau bisa menghasilkan jajanan dan minuman yang nikmat. Selama ini mangrove atau bakau lebih dikenal sebagai tumbuhan penting yang berperang menangkal abrasi. Namun di tangan kreatif kelompok petani di Rungkut, bakau dijadikan sebagai sumber makanan dan minuman yang lezat.",
            "Jl. Sonnetaria, Rungkut, Surabaya",
            R.drawable.mangrove,
            "Mulai dari 35,000 IDR."
        )
    )
    partListFac.add(
        DataMakanan(
            "Bikang Peneleh",
            "Ada banyak varian kue bikang dari seluruh Indonesia. Setiap varian memiliki kekhasan masing-masing dengan citarasa yang sesuai dengan lidah masyarakatnya. Di Surabaya, sentra produksi bikang ada di daerah Peneleh. Karena itu pula, bikang khas Surabaya sering juga disebut sebagai Bikang Peneleh. Bentuknya tidak jauh berbeda dengan bikang dari daerah lain, bulat dengan bagian atas yang ‘meledak’.",
            "Jl. Peneleh No.32-34, Peneleh, Kecamatan Genteng, Surabaya.",
            R.drawable.bikang,
            "Mulai dari 7,000 IDR per biji."
        )
    )
    partListFac.add(
        DataMakanan(
            "Kue Spikoe",
            "Ejaan lawas yang dipakai di merek makanan ini bukan sekadar pajangan, lho! Spikoe Resep Kuno memproduksi kue spiku (kue lapis khas Eropa) berdasarkan resep peninggalan zaman Belanda. Kue ini sebenarnya tidak sepenuhnya mencontek resep Eropa, tapi disesuaikan dengan bahan yang ada di Indonesia kala itu. Karena itu, rasanya juga enak dan unik, lembut dan manis seperti bolu.",
            "Jl. Rungkut Madya 41 Surabaya.",
            R.drawable.spikoe,
            "Mulai dari 80,000 IDR."
        )
    )
    return partListFac
}