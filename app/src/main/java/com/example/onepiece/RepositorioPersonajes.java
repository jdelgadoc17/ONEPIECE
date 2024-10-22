package com.example.onepiece;

import java.util.ArrayList;

public class RepositorioPersonajes {

    public static ArrayList<Personaje> personajes;

    public RepositorioPersonajes(ArrayList<Personaje> lista_personajes) {
        lista_personajes = new ArrayList<Personaje>();

        // Lista de Piratas
        personajes.add(new Personaje("Monkey D. Luffy", "Pirata", 1500, "Gomu Gomu no Mi"));
        personajes.add(new Personaje("Roronoa Zoro", "Pirata", 320, "Ninguna"));
        personajes.add(new Personaje("Nami", "Pirata", 66, "Ninguna"));
        personajes.add(new Personaje("Usopp", "Pirata", 200, "Ninguna"));
        personajes.add(new Personaje("Sanji", "Pirata", 330, "Ninguna"));
        personajes.add(new Personaje("Tony Tony Chopper", "Pirata", 100, "Hito Hito no Mi"));
        personajes.add(new Personaje("Nico Robin", "Pirata", 130, "Hana Hana no Mi"));
        personajes.add(new Personaje("Franky", "Pirata", 94, "Ninguna"));
        personajes.add(new Personaje("Brook", "Pirata", 83, "Yomi Yomi no Mi"));
        personajes.add(new Personaje("Jinbe", "Pirata", 438, "Ninguna"));
        personajes.add(new Personaje("Portgas D. Ace", "Pirata", 550, "Mera Mera no Mi"));
        personajes.add(new Personaje("Shanks", "Pirata", 4000, "Ninguna"));
        personajes.add(new Personaje("Marshall D. Teach (Blackbeard)", "Pirata", 3960, "Yami Yami no Mi"));
        personajes.add(new Personaje("Edward Newgate (Whitebeard)", "Pirata", 5020, "Gura Gura no Mi"));
        personajes.add(new Personaje("Trafalgar D. Water Law", "Pirata", 500, "Ope Ope no Mi"));
        personajes.add(new Personaje("Eustass Kid", "Pirata", 470, "Ninguna"));
        personajes.add(new Personaje("Boa Hancock", "Pirata", 1659, "Mero Mero no Mi"));
        personajes.add(new Personaje("Charlotte Katakuri", "Pirata", 1057, "Mochi Mochi no Mi"));
        personajes.add(new Personaje("Charlotte Linlin (Big Mom)", "Pirata", 4388, "Soru Soru no Mi"));
        personajes.add(new Personaje("Kaido", "Pirata", 4611, "Uo Uo no Mi, Modelo: Seiryu"));
        personajes.add(new Personaje("Dracule Mihawk", "Pirata", 3200, "Ninguna"));
        personajes.add(new Personaje("Donquixote Doflamingo", "Pirata", 340, "Ito Ito no Mi"));
        personajes.add(new Personaje("Crocodile", "Pirata", 81, "Suna Suna no Mi"));
        personajes.add(new Personaje("Buggy", "Pirata", 15, "Bara Bara no Mi"));

        // Lista de Marines
        personajes.add(new Personaje("Sakazuki (Akainu)", "Marine", 2000, "Magu Magu no Mi"));
        personajes.add(new Personaje("Borsalino (Kizaru)", "Marine", 0, "Pika Pika no Mi"));
        personajes.add(new Personaje("Kuzan (Aokiji)", "Ex-Marine", 0, "Hie Hie no Mi"));
        personajes.add(new Personaje("Sengoku", "Marine", 0, "Hito Hito no Mi, Modelo: Daibutsu"));
        personajes.add(new Personaje("Monkey D. Garp", "Marine", 500, "Ninguna"));
        personajes.add(new Personaje("Smoker", "Marine", 200, "Moku Moku no Mi"));
        personajes.add(new Personaje("Tashigi", "Marine", 50, "Ninguna"));
        personajes.add(new Personaje("Fujitora", "Marine", 0, "Zushi Zushi no Mi"));
        personajes.add(new Personaje("Helmeppo", "Marine", 10, "Ninguna"));
        personajes.add(new Personaje("Coby", "Marine", 50, "Ninguna"));
        personajes.add(new Personaje("Tsuru", "Marine", 0, "Woshu Woshu no Mi"));
        personajes.add(new Personaje("Vergo", "Ex-Marine", 0, "Ninguna"));
        personajes.add(new Personaje("Kong", "Marine", 0, "Ninguna"));
        personajes.add(new Personaje("X Drake", "Ex-Marine", 222, "Ryu Ryu no Mi, Modelo: Allosaurus"));
        personajes.add(new Personaje("Sentomaru", "Marine", 0, "Ninguna"));

        // Lista de Revolucionarios
        personajes.add(new Personaje("Monkey D. Dragon", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Sabo", "Revolucionario", 602, "Mera Mera no Mi"));
        personajes.add(new Personaje("Bartholomew Kuma", "Ex-Revolucionario", 0, "Nikyu Nikyu no Mi"));
        personajes.add(new Personaje("Ivankov", "Revolucionario", 0, "Horu Horu no Mi"));
        personajes.add(new Personaje("Koala", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Belo Betty", "Revolucionario", 0, "Kobu Kobu no Mi"));
        personajes.add(new Personaje("Inazuma", "Revolucionario", 0, "Choki Choki no Mi"));
        personajes.add(new Personaje("Hack", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Karasu", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Lindbergh", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Terry Gilteo", "Revolucionario", 0, "Ninguna"));
        personajes.add(new Personaje("Morley", "Revolucionario", 0, "Pusha Pusha no Mi"));
    }


    public ArrayList<Personaje> getLista_personajes() {
        return personajes;
    }

    public void setLista_personajes(ArrayList<Personaje> lista_personajes) {
        this.personajes = lista_personajes;
    }


    @Override
    public String toString() {
        return "RepositorioPersonajes{" +
                "lista_personajes=" + personajes +
                '}';
    }
}
