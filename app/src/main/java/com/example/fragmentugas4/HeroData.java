package com.example.fragmentugas4;

import java.util.ArrayList;

public class HeroData {private static String[] nama = new String[] {"Antasari","Abdul Haris Nasution","Adnan Kapau Gani","Agus Salim","Sutomo"};
    private static int[]thunail = new int[] {R.drawable.a,R.drawable.ahn,R.drawable.akg,R.drawable.as,R.drawable.bt};
    private static String[]preview = new String[] {
            "Pangeran Antasari (lahir di Kayu Tangi, Kesultanan Banjar, 1797 atau 1809 – meninggal di Bayan Begok, Hindia Belanda, 11 Oktober 1862 pada umur 53 tahun) adalah seorang Pahlawan Nasional Indonesia.",
            "Jenderal Besar TNI (Purn.) Dr. (H.C.) Abdul Haris Nasution (lahir di Kotanopan, Sumatra Utara, 3 Desember 1918 – meninggal di Jakarta, 6 September 2000 pada umur 81 tahun) adalah seorang pahlawan nasional Indonesia yang merupakan salah satu tokoh TNI AD yang menjadi sasaran dalam peristiwa Gerakan 30 September. Selamat dari upaya penculikan tersebut namun Nasution harus kehilangan putrinya Ade Irma Suryani Nasution beserta ajudannya, Lettu Pierre Tendean.",
            "Mayjen TNI (Purn) dr. Adnan Kapau Gani atau biasa disingkat A.K. Gani (lahir di Palembayan, Agam, Hindia Belanda, 16 September 1905 – meninggal di Palembang, Sumatra Selatan, Indonesia, 23 Desember 1968 pada umur 63 tahun) adalah seorang dokter, politisi, dan tokoh militer Indonesia. Ia pernah menjabat sebagai Wakil Perdana Menteri pada Kabinet Amir Sjarifuddin I dan Kabinet Amir Sjarifuddin II.",
            "H. Agus Salim (lahir dengan nama Masyhudul Haq (berarti \"pembela kebenaran\"); lahir di Koto Gadang, Agam, Sumatra Barat, Hindia Belanda, 8 Oktober 1884 – meninggal di Jakarta, Indonesia, 4 November 1954 pada umur 70 tahun) adalah seorang pejuang kemerdekaan Indonesia. Haji Agus Salim ditetapkan sebagai salah satu Pahlawan Nasional Indonesia pada tanggal 27 Desember 1961 melalui Keppres nomor 657 tahun 1961",
            "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan."
    };
    public static ArrayList<HeroModel> getListData(){
        HeroModel heroModel = null;
        ArrayList<HeroModel> list = new ArrayList<>();
        for (int i =0; i<nama.length; i++){
            heroModel = new HeroModel();
            heroModel.setNamaHero(nama[i]);
            heroModel.setLogoHero(thunail[i]);
            heroModel.setPrivew(preview[i]);
            list.add(heroModel);
        }
        return list;
    }
}
