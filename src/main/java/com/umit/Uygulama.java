package com.umit;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uygulama {
    static List<Film> filmler;
    Scanner scanner=new Scanner(System.in);
    public void baslangicVerisiOlustur() {
        Yonetmen yonetmen1 = new Yonetmen("Miyazaki", "Japonya");
        Film film1 = new Film("Ruhların Kaçışı", LocalDate.of(2001, 10, 10), 5000000, ETur.ANIME, yonetmen1, 9.5);
        Film film2 = new Film("Rüzgarlı Vadi", LocalDate.of(1984, 06, 8), 1000000, ETur.ANIME, yonetmen1, 9.1);
        Film film3 = new Film("Prenses Mononoke", LocalDate.of(1997, 10, 10), 30000000, ETur.ANIME, yonetmen1, 9.6);
        Film film4 = new Film("Yürüyen Sato", LocalDate.of(2004, 10, 10), 1000000, ETur.ANIME, yonetmen1, 8.7);

        Yonetmen yonetmen2 = new Yonetmen("Reha Erdem", "Türkiye");
        Film film5 = new Film("Kaç Para Kaç", LocalDate.of(1999, 10, 10), 100000, ETur.DRAMA, yonetmen2, 7.5);
        Film film6 = new Film("Korkuyorum Anne", LocalDate.of(2004, 06, 8), 300000, ETur.KARAMIZAH, yonetmen2, 8.1);
        Film film7 = new Film("Kosmos", LocalDate.of(2009, 12, 12), 500000, ETur.DRAMA, yonetmen2, 8.6);
        Film film8 = new Film("Seni Buldum Ya", LocalDate.of(2021, 12, 12), 400000, ETur.KARAMIZAH, yonetmen2, 7.2);

        Yonetmen yonetmen3 = new Yonetmen("David Fincher", "Amerika");
        Film film9 = new Film("Seven", LocalDate.of(1995, 10, 10), 2500000, ETur.DRAMA, yonetmen3, 8.8);
        Film film10 = new Film("Dövüş Kulübü", LocalDate.of(1999, 06, 8), 2500000, ETur.AKSIYON, yonetmen3, 9.4);
        Film film11 = new Film("Zodiac", LocalDate.of(2007, 11, 20), 800000, ETur.GERILIM, yonetmen3, 7.8);
        Film film12 = new Film("Gone Girl", LocalDate.of(2014, 10, 10), 1500000, ETur.DRAMA, yonetmen3, 8.2);
        Film film13 = new Film("Mank", LocalDate.of(2020, 12, 12), 2000000, ETur.DRAMA, yonetmen3, 8.4);

        Yonetmen yonetmen4 = new Yonetmen("Cohens", "Amerika");
        Film film14 = new Film("Barton Fink", LocalDate.of(1991, 12, 12), 500000, ETur.GERILIM, yonetmen4, 8.5);
        Film film15 = new Film("Fargo", LocalDate.of(1996, 12, 12), 800000, ETur.GERILIM, yonetmen4, 8.1);
        Film film16 = new Film("Big Lebowski", LocalDate.of(1998, 12, 12), 1100000, ETur.KARAMIZAH, yonetmen4, 9.2);
        Film film17 = new Film("Nerdesin Be Birader", LocalDate.of(2000, 02, 2), 1500000, ETur.KARAMIZAH, yonetmen4, 7.8);
        Film film18 = new Film("Orada Olmayan Adam", LocalDate.of(2001, 7, 17), 500000, ETur.GERILIM, yonetmen4, 8.3);
        Film film19 = new Film("İhtiyarlara Yer Yok", LocalDate.of(2007, 7, 17), 1700000, ETur.DRAMA, yonetmen4, 9.3);
        Film film20 = new Film("Ciddi Bir Adam", LocalDate.of(2009, 7, 17), 500000, ETur.KARAMIZAH, yonetmen4, 8.0);

        Yonetmen yonetmen5 = new Yonetmen("Emin Alper", "Türkiye");
        Film film21 = new Film("Tepenin Ardı", LocalDate.of(2012, 7, 17), 50000, ETur.DRAMA, yonetmen5, 7.7);
        Film film22 = new Film("Kız Kardeşler", LocalDate.of(2019, 7, 17), 400000, ETur.DRAMA, yonetmen5, 8.5);
        Film film23 = new Film("Kurak Günler", LocalDate.of(2022, 7, 17), 600000, ETur.DRAMA, yonetmen5, 8.4);

        Yonetmen yonetmen6 = new Yonetmen("Wes Anderson", "Amerika");
        Film film24 = new Film("Yaman Tilki", LocalDate.of(2009, 7, 17), 900000, ETur.ANIMASYON, yonetmen6, 7.8);
        Film film25 = new Film("Moonrise Kingdom", LocalDate.of(2012, 7, 17), 8500000, ETur.FANTASTIK, yonetmen6, 8.6);
        Film film26 = new Film("Büyük Budapeşte Oteli", LocalDate.of(2014, 7, 17), 1200000, ETur.FANTASTIK, yonetmen6, 9.0);
        Film film27 = new Film("Köpek Adası", LocalDate.of(2018, 7, 17), 1500000, ETur.ANIMASYON, yonetmen6, 9.2);
        filmler =new ArrayList<>( List.of(
                film1, film2, film3, film4, film5, film6, film7, film8, film9, film10,
                film11, film12, film13, film14, film15, film16, film17, film18, film19, film20,
                film21, film22, film23, film24, film25, film26, film27
        ));
    }
    /*
        soru1- method tanimlayip filmleri puana gore siralayalim ve ilk 5 filmi yazdiralim
     */
    public void siraliFilmListesi(List<Film> filmler) {
        Collections.sort(filmler, (film1, film2)-> Double.compare(film2.getPuan(),film1.getPuan()));

        System.out.println("***** En İyi 5 Film *****");
        for (int i = 0; i < Math.min(filmler.size(), 5); i++) {
            Film film = filmler.get(i);
            System.out.println((i + 1) + ". " + film.getIsim() + " - Puan: " + film.getPuan());
        }
    }

    /*
        soru2- method tanimlayip klavyeden girilen turun filmleri ortalamasini bulalim
     */
    public void girilenTurunOrtalamaPuani(ETur tur){
        double sonuc= filmler.stream().filter(t->t.getTur().equals(tur)).mapToDouble(p->p.getPuan()).average().getAsDouble();
        System.out.println("Girdiginiz "+tur+" turunden olusan filmlerin ortalama puani=  "+sonuc);

    }
    /*
        soru3- filmlerin turunu liste icinde yazdirma
    */
    public void turuneGoreFilmleriListele() {
        List<ETur> list = filmler.stream().map(Film::getTur).sorted().collect(Collectors.toList());
        System.out.println(list);
    }
    /*
        soru4- belli hasilat araliginda ki filmleri bulma
     */
    public void filmleriBelirliAraliktakiHasilataGore(long baslangic,long bitis){
        filmler.stream().filter(f->(f.getHasilat()<bitis &&f.getHasilat()>baslangic)).forEach(System.out::println);
    }

    /*
        soru5- yonetmenlerin isimlerini ve ulkelerini eslestiren method
     */
    public void yonetmenUlkeEslestirme() {
        Map<String, String> yonetmenUlkeMap = new HashMap<>();

        for (Film film : filmler) {
            Yonetmen yonetmen = film.getYonetmen();
            if (yonetmen != null) {
                yonetmenUlkeMap.put(yonetmen.getIsim(), yonetmen.getUlke());
            }
        }
        for (Map.Entry<String, String>entry : yonetmenUlkeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    /*
        soru6- bir ulkede en cok film yapan yonetmen
     */

    public void enCokFilmYapanYonetmen(String ulke) {
        Map<String, Integer> yonetmenFilmSayisi = new HashMap<>();
        for (Film film : filmler) {
            Yonetmen yonetmen = film.getYonetmen();
            if (yonetmen != null && yonetmen.getUlke().equals(ulke)) {
                String yonetmenIsim = yonetmen.getIsim();
                if (yonetmenFilmSayisi.containsKey(yonetmenIsim)) {
                    yonetmenFilmSayisi.put(yonetmenIsim, yonetmenFilmSayisi.get(yonetmenIsim) + 1);
                } else {
                    yonetmenFilmSayisi.put(yonetmenIsim, 1);
                }
            }
        }
        int maxFilmSayisi = 0;
        String enCokFilmYapanYonetmen = null;

        for (Map.Entry<String, Integer> entry : yonetmenFilmSayisi.entrySet()) {
            if (entry.getValue() > maxFilmSayisi) {
                maxFilmSayisi = entry.getValue();
                enCokFilmYapanYonetmen = entry.getKey();
            }
        }

        if (enCokFilmYapanYonetmen != null) {
            System.out.println(ulke + " ulkesinde en cok film yapan yonetmen: " + enCokFilmYapanYonetmen);
        } else {
            System.out.println("Belirtilen ulkede yonetmen bulunamadi.");
        }
    }

    /*
        soru7- animasyon turunde ki filmlerin hasilati toplami
     */
    public void animelerinToplamHasilati(){
        double x = filmler.stream().filter(f -> f.getTur().equals(ETur.ANIMASYON)).mapToDouble(f -> f.getHasilat()).sum();
        System.out.println(x);
    }

    /*
        soru8- yonetmenin film sayisini bulma
     */
    public void yonetmeninFilmSayisi1(String yonetmen){
        List<String> sonuc = filmler.stream().filter(x->x.getYonetmen().getIsim().equalsIgnoreCase(yonetmen)).map(y->y.getIsim()).collect(Collectors.toList());
        System.out.println("yonetmenin film sayısı= "+sonuc.size());
    }


    /*
        soru9- belirli bir ülkeden gelen yonetmenlerin film sayilarini yonetmen ismine gore mapleme
     */



    /*
        soru10- toplam hasilati en yuksek olan belirli bir ulkede ki yonetmenin ismini bulmak icin stream ifadesi
     */
    public void enYuksekHasilatYapanYonetmen(String ulke) {
        Optional<String> enYuksekHasilatYapanYonetmen = filmler.stream()
                .filter(film -> film.getYonetmen() != null && film.getYonetmen().getUlke().equals(ulke))
                .collect(Collectors.groupingBy(Film::getYonetmen, Collectors.summingDouble(Film::getHasilat)))
                .entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(entry -> entry.getKey().getIsim());

        enYuksekHasilatYapanYonetmen.ifPresentOrElse(
                isim -> System.out.println(ulke + " uulkesinde toplam hasilati en yuksek olan yonetmen: " + isim),
                () -> System.out.println("Belirtilen ulkede film bulunamadi.")
        );
    }

    /*
        soru11- yonetmenlerin filmlerinin puan ortalamasi yonetmen e karsilik puan gelecek.
     */
    public Map<String, Double> yonetmenPuanOrtalama() {
        return filmler.stream()
                .filter(film -> film.getYonetmen() != null)
                .collect(Collectors.groupingBy(
                        film -> film.getYonetmen().getIsim(),
                        Collectors.averagingDouble(Film::getPuan)
                ));
    }

    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
        uygulama.baslangicVerisiOlustur();
        //uygulama.siraliFilmListesi(filmler);                           //SORU1 Cevabi
        //uygulama.girilenTurunOrtalamaPuani(ETur.DRAMA);                //SORU2 Cevabi
        //uygulama.turuneGoreFilmleriListele();                          //SORU3 Cevabi
        //uygulama.filmleriBelirliAraliktakiHasilataGore(1000l,350000l); //SORU4 Cevabi
        //uygulama.yonetmenUlkeEslestirme();                             //SORU5 Cevabi
        //uygulama.enCokFilmYapanYonetmen("Amerika");                    //SORU6 Cevabi
        //uygulama.animelerinToplamHasilati();                           //SORU7 Cevabi
        //uygulama.yonetmeninFilmSayisi1("Miyazaki");                    //SORU8 Cevabi

        //uygulama.enYuksekHasilatYapanYonetmen("Amerika");              //SORU10 Cevabi

        //Map<String, Double> yonetmenPuanOrtalama = uygulama.yonetmenPuanOrtalama();  //SORU11 Cevabi
        //yonetmenPuanOrtalama.forEach((yonetmen, ortalamaPuan) ->
         //       System.out.println(yonetmen + " - Ortalama Puan: " + ortalamaPuan)
        //);

    }

}
