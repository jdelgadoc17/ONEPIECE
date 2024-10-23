package com.example.onepiece;

import java.util.ArrayList;

public class RepositorioPersonajes {

    public static ArrayList<Personaje> lista_piratas = new ArrayList<Personaje>();
    public static ArrayList<Personaje> lista_marines = new ArrayList<Personaje>();
    public static ArrayList<Personaje> lista_revolucionarios = new ArrayList<Personaje>();



    public RepositorioPersonajes() {

        if(lista_piratas.isEmpty() || lista_marines.isEmpty() || lista_revolucionarios.isEmpty()){
            // Lista de Piratas
            lista_piratas.add(new Personaje("Monkey D. Luffy", "Pirata", 1500, "Gomu Gomu no Mi"));
            lista_piratas.add(new Personaje("Roronoa Zoro", "Pirata", 320, "Ninguna"));
            lista_piratas.add(new Personaje("Nami", "Pirata", 66, "Ninguna"));
            lista_piratas.add(new Personaje("Usopp", "Pirata", 200, "Ninguna"));
            lista_piratas.add(new Personaje("Sanji", "Pirata", 330, "Ninguna"));
            lista_piratas.add(new Personaje("Tony Tony Chopper", "Pirata", 100, "Hito Hito no Mi"));
            lista_piratas.add(new Personaje("Nico Robin", "Pirata", 130, "Hana Hana no Mi"));
            lista_piratas.add(new Personaje("Franky", "Pirata", 94, "Ninguna"));
            lista_piratas.add(new Personaje("Brook", "Pirata", 83, "Yomi Yomi no Mi"));
            lista_piratas.add(new Personaje("Jinbe", "Pirata", 438, "Ninguna"));
            lista_piratas.add(new Personaje("Portgas D. Ace", "Pirata", 550, "Mera Mera no Mi"));
            lista_piratas.add(new Personaje("Shanks", "Pirata", 4000, "Ninguna"));
            lista_piratas.add(new Personaje("Marshall D. Teach (Blackbeard)", "Pirata", 3960, "Yami Yami no Mi"));
            lista_piratas.add(new Personaje("Edward Newgate (Whitebeard)", "Pirata", 5020, "Gura Gura no Mi"));
            lista_piratas.add(new Personaje("Trafalgar D. Water Law", "Pirata", 500, "Ope Ope no Mi"));
            lista_piratas.add(new Personaje("Eustass Kid", "Pirata", 470, "Ninguna"));
            lista_piratas.add(new Personaje("Boa Hancock", "Pirata", 1659, "Mero Mero no Mi"));
            lista_piratas.add(new Personaje("Charlotte Katakuri", "Pirata", 1057, "Mochi Mochi no Mi"));
            lista_piratas.add(new Personaje("Charlotte Linlin (Big Mom)", "Pirata", 4388, "Soru Soru no Mi"));
            lista_piratas.add(new Personaje("Kaido", "Pirata", 4611, "Uo Uo no Mi, Modelo: Seiryu"));
            lista_piratas.add(new Personaje("Dracule Mihawk", "Pirata", 3200, "Ninguna"));
            lista_piratas.add(new Personaje("Donquixote Doflamingo", "Pirata", 340, "Ito Ito no Mi"));
            lista_piratas.add(new Personaje("Crocodile", "Pirata", 81, "Suna Suna no Mi"));
            lista_piratas.add(new Personaje("Buggy", "Pirata", 15, "Bara Bara no Mi"));

            // Lista de Marines
            lista_marines.add(new Personaje("Sakazuki (Akainu)", "Marine", 2000, "Magu Magu no Mi"));
            lista_marines.add(new Personaje("Borsalino (Kizaru)", "Marine", 0, "Pika Pika no Mi"));
            lista_marines.add(new Personaje("Kuzan (Aokiji)", "Ex-Marine", 0, "Hie Hie no Mi"));
            lista_marines.add(new Personaje("Sengoku", "Marine", 0, "Hito Hito no Mi, Modelo: Daibutsu"));
            lista_marines.add(new Personaje("Monkey D. Garp", "Marine", 500, "Ninguna"));
            lista_marines.add(new Personaje("Smoker", "Marine", 200, "Moku Moku no Mi"));
            lista_marines.add(new Personaje("Tashigi", "Marine", 50, "Ninguna"));
            lista_marines.add(new Personaje("Fujitora", "Marine", 0, "Zushi Zushi no Mi"));
            lista_marines.add(new Personaje("Helmeppo", "Marine", 10, "Ninguna"));
            lista_marines.add(new Personaje("Coby", "Marine", 50, "Ninguna"));
            lista_marines.add(new Personaje("Tsuru", "Marine", 0, "Woshu Woshu no Mi"));
            lista_marines.add(new Personaje("Vergo", "Ex-Marine", 0, "Ninguna"));
            lista_marines.add(new Personaje("Kong", "Marine", 0, "Ninguna"));
            lista_marines.add(new Personaje("X Drake", "Ex-Marine", 222, "Ryu Ryu no Mi, Modelo: Allosaurus"));
            lista_marines.add(new Personaje("Sentomaru", "Marine", 0, "Ninguna"));

            // Lista de Revolucionarios
            lista_revolucionarios.add(new Personaje("Monkey D. Dragon", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Sabo", "Revolucionario", 602, "Mera Mera no Mi"));
            lista_revolucionarios.add(new Personaje("Bartholomew Kuma", "Ex-Revolucionario", 0, "Nikyu Nikyu no Mi"));
            lista_revolucionarios.add(new Personaje("Ivankov", "Revolucionario", 0, "Horu Horu no Mi"));
            lista_revolucionarios.add(new Personaje("Koala", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Belo Betty", "Revolucionario", 0, "Kobu Kobu no Mi"));
            lista_revolucionarios.add(new Personaje("Inazuma", "Revolucionario", 0, "Choki Choki no Mi"));
            lista_revolucionarios.add(new Personaje("Hack", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Karasu", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Lindbergh", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Terry Gilteo", "Revolucionario", 0, "Ninguna"));
            lista_revolucionarios.add(new Personaje("Morley", "Revolucionario", 0, "Pusha Pusha no Mi"));

        }

    }

    public static ArrayList<Personaje> getLista_piratas() {
        return lista_piratas;
    }

    public static void setLista_piratas(ArrayList<Personaje> lista_piratas) {
        RepositorioPersonajes.lista_piratas = lista_piratas;
    }

    public static ArrayList<Personaje> getLista_marines() {
        return lista_marines;
    }

    public static void setLista_marines(ArrayList<Personaje> lista_marines) {
        RepositorioPersonajes.lista_marines = lista_marines;
    }

    public static ArrayList<Personaje> getLista_revolucionarios() {
        return lista_revolucionarios;
    }

    public static void setLista_revolucionarios(ArrayList<Personaje> lista_revolucionarios) {
        RepositorioPersonajes.lista_revolucionarios = lista_revolucionarios;
    }





}

