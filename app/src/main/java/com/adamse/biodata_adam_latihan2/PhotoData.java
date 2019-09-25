package com.adamse.biodata_adam_latihan2;

import java.util.ArrayList;

public class PhotoData {
    private static String[] photoName = {
            "Abbey Roads",
            "Rolling Stones",
            "Cris John",
            "Tin Tin",
            "Oasis",
            "Queen",
            "Bohemian Rhapsody",
            "StarLord",
            "Boba Fett",
            "Darth Vader"

    };

    private  static String[] photoDetail = {
            "Album The Beatles yang mengambil latar belakang zebracross di jalan Abbey Roads. Foto ini penuh konspirasi bahwa dirumorkan Paul McCartney meninggal dunia.",
            "Band asal Inggris yang sangat eksis hingga masa kini. hingga kini hanya tinggal 3 personil asli yaitu : Mick Jagger, Keith Richards, dan Charlie Watts. Sekarang ditambah personel baru Ronnie Wood, Karena Brian Jones dan Bill Wayman Hengkang. ",
            "Atlet tinju yang berhasil membawa indonesia ke kancah internasional. legenda tinju kini sudah pensiun dari dunianya dan mendirikan asosiasi tinju indonesia.",
            "Petualang dengan rambut pirang khasnya berkelana menyusuri misteri duna. ",
            "Band asal Manchaster dengan Liam Gallagher sebagai vokalis dan Noel Gallagher sebagai gitaris utama. kedua adik kakak ini sering berseteru yang karenanya juga band ini bubar.",
            "Band Rock asal London Inggris ini sangat terkenal. Siapa yang tidak tahu soal pelantun 'Bohemian Rhapsody' yang satu ini. Freddie Mercury sang vokalis bersuara cantik nan melengking, Brian May gitaris jenius, si muka lucu John Deacon, dan drummer favorit Roger Taylor",
            "Film besutan studio FOX ini merupakan film biopik yang menceritakan Freddie Mercury dan Queen. Diberi judul Bohemian Rhapsody yang sama dengan lagunya karena dianggap sangat queen dan sangat Freddie Mercury",
            "Anak Meredith Quill pada frainchise marvel yang diculik oleh alien dan diadopsi menjadi 'Star Lord'. ia lalu menjadi pemimpin Guardian Of The Galaxy",
            "Ada di film Star Wars.",
            "Ini juga ada cuman udah meninggal.",


    };
    private static int[] photos = {
            R.drawable.abbeyroads,
            R.drawable.rollingstone,
            R.drawable.krisjon,
            R.drawable.tintin,
            R.drawable.oasis,
            R.drawable.queen2,
            R.drawable.filemqueen,
            R.drawable.quill,
            R.drawable.bobapet,
            R.drawable.dartpader

    };

    static ArrayList<Photo> getListData() {
        ArrayList<Photo> list = new ArrayList<>();
        for (int posisi = 0; posisi < photoName.length; posisi++){
            Photo photo = new Photo();
            photo.setName(photoName[posisi]);
            photo.setDetail(photoDetail[posisi]);
            photo.setPhoto(photos[posisi]);
            list.add(photo);
        }
        return list;
    }
}
