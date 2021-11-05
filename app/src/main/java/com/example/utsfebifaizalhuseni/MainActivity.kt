package com.example.utsrizkydwisaputra
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.luhutbpandjaitan,"Mentri Koordinator Bidang Kemaritiman dan Investasi","Jenderal TNI (HOR) (Purn.) Luhut Binsar Pandjaitan, M.P.A", "Jenderal TNI (HOR) (Purn.) Luhut Binsar Pandjaitan, M.P.A. (lahir 28 September 1947) adalah Menteri Koordinator Bidang Kemaritiman Republik Indonesia Kabinet Kerja pada Juli 2016 dan dipilih kembali pada masa Kabinet Indonesia Maju pemerintahan Presiden Joko Widodo dan Wakil Presiden Ma'ruf Amin periode 2019–2024 sebagai Menteri Koordinator Bidang Kemaritiman dan Investasi Indonesia. Ia juga pernah menjabat sebagai Kepala Staf Kepresidenan Republik Indonesia sejak 31 Desember 2014 hingga 2 September 2015.[5] Pada 12 Agustus 2015, ia ditunjuk oleh Presiden Joko Widodo menjadi Menteri Koordinator Bidang Politik, Hukum, dan Keamanan menggantikan Tedjo Edhy Purdijatno. Dalam perombakan Kabinet Kerja Jilid II pada 27 Juli 2016, ia diangkat menjadi Menteri Koordinator Kemaritiman menggantikan Rizal Ramli.[6] Pada 15 Agustus 2016, Presiden Joko Widodo mengambil langkah terkait polemik kepemilikan paspor Amerika Serikat (AS) oleh Menteri Energi dan Sumber Daya Mineral (ESDM) Arcandra Tahar, sehingga Presiden memberhentikan Archandra secara terhormat dari Menteri ESDM dan menunjuk Luhut yang juga menjadi Menko Maritim untuk menjadi pejabat sementara (Plt) Menteri Energi dan Sumber Daya Mineral."))

        data?.add(DataModel(R.drawable.srimulyaniindrawati,"Mentri Keuangan","Sri Mulyani Indrawati, S.E., M.Sc., Ph.D","Sri Mulyani adalah orang Indonesia pertama yang menjabat sebagai Direktur Pelaksana Bank Dunia. Jabatan ini diembannya mulai 1 Juni 2010 hingga dia dipanggil kembali oleh Presiden Joko Widodo untuk menjabat sebagai Menteri Keuangan menggantikan Bambang Brodjonegoro, dia mulai menjabat lagi sejak 27 Juli 2016. Sebelumnya, dia menjabat Menteri Keuangan Kabinet Indonesia Bersatu. Ketika ia " +
                "menjadi Direktur Pelaksana Bank Dunia maka ia pun meninggalkan jabatannya sebagai menteri keuangan saat itu." +
                "Pada tahun 2004, dia pernah menjabat sebagai Menteri Negara Perencanaan Pembangunan Nasional/Kepala Bappenas dari Kabinet Indonesia Bersatu. Pada 5 Desember 2005, ketika Presiden Susilo Bambang Yudhoyono mengumumkan perombakan kabinet, Sri Mulyani dipindahkan menjadi Menteri Keuangan menggantikan Jusuf Anwar. Sejak tahun 2008, ia menjabat Pelaksana Tugas Menteri Koordinator Bidang Perekonomian, setelah Menko Perekonomian Dr. Boediono dilantik sebagai Gubernur Bank Indonesia"))

        data?.add(DataModel(R.drawable.erickthohir,"Mentri BUMN","Erick Thohir, B.A., M.B.A.", "Erick Thohir, B.A., M.B.A. (lahir 30 Mei 1970) adalah pengusaha dan filantropis Indonesia. Ia kini menjabat sebagai Menteri Badan Usaha Milik Negara Indonesia ke-9 Kabinet Indonesia Maju yang dilantik oleh Presiden Joko Widodo pada 23 Oktober 2019" +
                "Sejak 23 Januari 2021, Erick ditetapkan sebagai Ketua Umum Masyarakat Ekonomi Syariah periode 2021 - 2024" +
                "Sebelum menjadi menteri, Erick Thohir merupakan seorang pengusaha dan pendiri Mahaka Group yang merupakan perusahaan induk dari perusahaan yang memiliki fokus pada bisnis media dan entertainment. "))

        data?.add(DataModel(R.drawable.nadiemmakariem,"Mentri Pendidikan","Nadiem Anwar Makarim, B.A., M.B.A.", "Nadiem Anwar Makarim, B.A., M.B.A.[3] (lahir 4 Juli 1984)[4] adalah seorang pengusaha Indonesia yang saat ini menjabat sebagai Menteri Pendidikan dan Kebudayaan Indonesia pada Kabinet Indonesia Maju pemerintahan Presiden Joko Widodo-K.H Ma'ruf Amin, yang dilantik pada 23 Oktober 2019. Ia merupakan pendiri Gojek, sebuah perusahaan transportasi dan penyedia jasa berbasis daring yang beroperasi di Indonesia dan sejumlah negara Asia Tenggara seperti Singapura, Vietnam, dan Thailand.[5]Nadiem Anwar Makarim adalah putra dari pasangan Nono Anwar Makarim dan Atika Algadri. Ayahnya adalah seorang aktivis dan pengacara terkemuka yang berketurunan Minang-Arab. Sedangkan ibunya merupakan penulis lepas, putri dari Hamid Algadri, salah seorang perintis kemerdekaan Indonesia."))

        data?.add(DataModel(R.drawable.prabowottransparant,"Mentri Pertahana","Letnan Jenderal TNI (Purn.) H. Prabowo Subianto Djojohadikusumo", "lahir 17 Oktober 1951) adalah seorang politisi, pengusaha, dan perwira tinggi militer Indonesia. Ia menempuh pendidikan dan jenjang karier militer selama 28 tahun sebelum berkecimpung dalam dunia bisnis dan politik. Pada tanggal 23 Oktober 2019, Prabowo dilantik menjadi Menteri Pertahanan ke-26 Republik Indonesia dalam Kabinet Indonesia Maju untuk periode 2019 hingga 2024"+
        "Sebagai Ketua Umum Partai Gerindra, Prabowo Subianto bersama Hatta Rajasa, maju sebagai calon Presiden Indonesia ke-7 dalam pemilihan umum 2014, namun diungguli oleh pasangan Joko Widodo dan Jusuf Kalla. Ia kembali mencalonkan diri sebagai presiden pada pemilihan umum Presiden Indonesia 2019, berpasangan dengan Sandiaga Uno.+" +
                "Lahir di Jakarta, masa kecil Prabowo sebagai putra ekonom Soemitro Djojohadikoesoemo banyak dilewatkan di luar negeri bersama orang tuanya. Minatnya pada dunia militer dipengaruhi oleh pamannya, Soebianto Djojohadikusumo yang gugur dalam Pertempuran Lengkong. Selepas lulus dari Akademi Militer di Magelang pada tahun 1974 sebagai seorang letnan dua, ia menjadi salah satu komandan operasi termuda dalam sejarah Angkatan Darat saat memimpin operasi Tim Nanggala di Timor Timur."))

        data?.add(DataModel(R.drawable.sandiagauno,"Menteri Pariwisata dan Ekonomi Kreatif","Dr. H. Sandiaga Salahuddin Uno, B.B.A., M.B.A", "Dr. H. Sandiaga Salahuddin Uno, B.B.A., M.B.A. (lahir 28 Juni 1969)[5][6] adalah pengusaha dan politisi Indonesia. Ia dipercaya oleh Presiden Joko Widodo sebagai Menteri Pariwisata dan Ekonomi Kreatif dan Kepala Badan Pariwisata dan Ekonomi Kreatif pada Kabinet Indonesia Maju (2019–2024) menggantikan Wishnutama yang dilantik pada tanggal 23 Desember 2020" +
                "Ia memenangkan pemilihan umum Gubernur DKI Jakarta 2017 bersama dengan Anies Baswedan, dan memulai masa jabatannya sebagai Wakil Gubernur DKI Jakarta pada bulan Oktober 2017.[8][9] Pada bulan September 2018, ia mengundurkan diri sebagai Wagub DKI Jakarta dan maju sebagai Calon Wakil Presiden bersama Prabowo Subianto tetapi gagal dalam hasil hitungan suara di Pemilihan Umum Presiden Indonesia 2019" +
                "Sandiaga Uno memulai usahanya setelah sempat menjadi seorang pengangguran ketika perusahaan yang mempekerjakannya bangkrut.[10] Ia banting setir untuk bangkit dari nol, menjalani awal kariernya menjadi seorang pengusaha.[11] Bersama rekannya, ia mendirikan sebuah perusahaan di bidang keuangan, PT Saratoga Advisor.[10] Usaha tersebut terbukti sukses dan telah mengambil alih beberapa perusahaan lain.[10] Pada tahun 2009, ia tercatat sebagai orang terkaya urutan ke-29 di Indonesia menurut majalah Forbes.[12] Tahun 2011, Forbes kembali merilis daftar orang terkaya di Indonesia. Ia menduduki peringkat ke-37 dengan total kekayaan US $ 660 juta  "))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.poster)
                intent.putExtra("nama", item?.mentri)
                intent.putExtra("harga", item?.nama)
                intent.putExtra("keterangan", item?.biodata)
                startActivity(intent)
            }

        })


    }
}