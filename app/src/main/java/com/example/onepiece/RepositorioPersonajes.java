package com.example.onepiece;

import java.util.ArrayList;

public class RepositorioPersonajes {

    public static ArrayList<Personaje> lista_piratas = new ArrayList<Personaje>();
    public static ArrayList<Personaje> lista_marines = new ArrayList<Personaje>();
    public static ArrayList<Personaje> lista_revolucionarios = new ArrayList<Personaje>();

    public RepositorioPersonajes() {

        if(lista_piratas.isEmpty() || lista_marines.isEmpty() || lista_revolucionarios.isEmpty()){
            // Lista de Piratas
            lista_piratas.add(new Personaje("Monkey D. Luffy", "Pirata", 1500, "Gomu Gomu no Mi", "Capitán de los Piratas de Sombrero de Paja."));
            lista_piratas.add(new Personaje("Roronoa Zoro", "Pirata", 320, "Ninguna", "Espadachín y primer compañero de Luffy."));
            lista_piratas.add(new Personaje("Nami", "Pirata", 66, "Ninguna", "Navegante del barco, experta en clima."));
            lista_piratas.add(new Personaje("Usopp", "Pirata", 200, "Ninguna", "Francotirador y contador de historias."));
            lista_piratas.add(new Personaje("Sanji", "Pirata", 330, "Ninguna", "Cocinero y maestro del combate con piernas."));
            lista_piratas.add(new Personaje("Tony Tony Chopper", "Pirata", 100, "Hito Hito no Mi", "Médico del grupo y reno humano."));
            lista_piratas.add(new Personaje("Nico Robin", "Pirata", 130, "Hana Hana no Mi", "Antropóloga y experta en historia antigua."));
            lista_piratas.add(new Personaje("Franky", "Pirata", 94, "Ninguna", "Carpintero cibernético del barco."));
            lista_piratas.add(new Personaje("Brook", "Pirata", 83, "Yomi Yomi no Mi", "Músico y espadachín esquelético."));
            lista_piratas.add(new Personaje("Jinbe", "Pirata", 438, "Ninguna", "Timón del barco y experto en artes marciales del mar."));
            lista_piratas.add(new Personaje("Portgas D. Ace", "Pirata", 550, "Mera Mera no Mi", "Hermano de Luffy y capitán de la segunda división de los Piratas de Barbablanca."));
            lista_piratas.add(new Personaje("Shanks", "Pirata", 4000, "Ninguna", "Capitán de los Piratas de Shanks y exmiembro de los Piratas de Roger."));
            lista_piratas.add(new Personaje("Marshall D. Teach (Blackbeard)", "Pirata", 3960, "Yami Yami no Mi", "Capitán de los Piratas de Barbanegra, enemigo de Luffy."));
            lista_piratas.add(new Personaje("Edward Newgate (Whitebeard)", "Pirata", 5020, "Gura Gura no Mi", "Uno de los piratas más poderosos, conocido como el 'hombre más fuerte del mundo'."));
            lista_piratas.add(new Personaje("Trafalgar D. Water Law", "Pirata", 500, "Ope Ope no Mi", "Capitán de los Piratas Heart y médico estratégico."));
            lista_piratas.add(new Personaje("Eustass Kid", "Pirata", 470, "Ninguna", "Un pirata con un gran sentido de rivalidad."));
            lista_piratas.add(new Personaje("Boa Hancock", "Pirata", 1659, "Mero Mero no Mi", "Reina de Amazon Lily y miembro de los Shichibukai."));
            lista_piratas.add(new Personaje("Charlotte Katakuri", "Pirata", 1057, "Mochi Mochi no Mi", "Comandante de la Flota de Big Mom, conocido por su habilidad en el futuro."));
            lista_piratas.add(new Personaje("Charlotte Linlin (Big Mom)", "Pirata", 4388, "Soru Soru no Mi", "Capitana de los Piratas de Big Mom y una de las Cuatro Emperatrices."));
            lista_piratas.add(new Personaje("Kaido", "Pirata", 4611, "Uo Uo no Mi, Modelo: Seiryu", "Capitán de los Piratas de las Bestias, busca crear la guerra definitiva."));
            lista_piratas.add(new Personaje("Dracule Mihawk", "Pirata", 3200, "Ninguna", "El mejor espadachín del mundo, conocido como el 'Cazador de Piratas'."));
            lista_piratas.add(new Personaje("Donquixote Doflamingo", "Pirata", 340, "Ito Ito no Mi", "Exmiembro de los Shichibukai y jefe del crimen en Dressrosa."));
            lista_piratas.add(new Personaje("Crocodile", "Pirata", 81, "Suna Suna no Mi", "Exmiembro de los Shichibukai y líder de Baroque Works."));
            lista_piratas.add(new Personaje("Buggy", "Pirata", 15, "Bara Bara no Mi", "Comediante y rival de Luffy, con habilidades de desmembramiento."));

            // Lista de Marines
            lista_marines.add(new Personaje("Sakazuki (Akainu)", "Marine", 2000, "Magu Magu no Mi", "Almirante de la Marina, conocido por su justicia absoluta."));
            lista_marines.add(new Personaje("Borsalino (Kizaru)", "Marine", 0, "Pika Pika no Mi", "Almirante de la Marina, rápido y poderoso."));
            lista_marines.add(new Personaje("Kuzan (Aokiji)", "Ex-Marine", 0, "Hie Hie no Mi", "Exalcalde de la Marina, conocido por su sentido de la justicia."));
            lista_marines.add(new Personaje("Sengoku", "Marine", 0, "Hito Hito no Mi, Modelo: Daibutsu", "Excomandante de la Marina, conocido por su sabiduría."));
            lista_marines.add(new Personaje("Monkey D. Garp", "Marine", 500, "Ninguna", "Héroe de la Marina, conocido por su fuerza y vínculos con los piratas."));
            lista_marines.add(new Personaje("Smoker", "Marine", 200, "Moku Moku no Mi", "Comandante de la Marina, persigue a los piratas con determinación."));
            lista_marines.add(new Personaje("Tashigi", "Marine", 50, "Ninguna", "Espadachín y teniente de la Marina, lucha por la justicia."));
            lista_marines.add(new Personaje("Fujitora", "Marine", 0, "Zushi Zushi no Mi", "Almirante ciego con poder sobre la gravedad."));
            lista_marines.add(new Personaje("Helmeppo", "Marine", 10, "Ninguna", "Teniente de la Marina, aprendiz de Smoker."));
            lista_marines.add(new Personaje("Coby", "Marine", 50, "Ninguna", "Un joven marine que busca convertirse en un gran guerrero."));
            lista_marines.add(new Personaje("Tsuru", "Marine", 0, "Woshu Woshu no Mi", "Almirante de la Marina, conocida por su inteligencia."));
            lista_marines.add(new Personaje("Vergo", "Ex-Marine", 0, "Ninguna", "Exmarine y comandante de la familia Donquixote."));
            lista_marines.add(new Personaje("Kong", "Marine", 0, "Ninguna", "Excomandante de la Marina, figura influyente en el gobierno."));
            lista_marines.add(new Personaje("X Drake", "Ex-Marine", 222, "Ryu Ryu no Mi, Modelo: Allosaurus", "Exmarine y capitán de los Piratas de las Bestias."));
            lista_marines.add(new Personaje("Sentomaru", "Marine", 0, "Ninguna", "Comandante de los Pacifistas y asistente de Kuma."));

            // Lista de Revolucionarios
            lista_revolucionarios.add(new Personaje("Monkey D. Dragon", "Revolucionario", 0, "Ninguna", "Líder de los Revolucionarios y padre de Luffy."));
            lista_revolucionarios.add(new Personaje("Sabo", "Revolucionario", 602, "Mera Mera no Mi", "Hermano de Luffy y segundo al mando de los Revolucionarios."));
            lista_revolucionarios.add(new Personaje("Bartholomew Kuma", "Ex-Revolucionario", 0, "Nikyu Nikyu no Mi", "Exmiembro de los Revolucionarios, ahora un Pacifista."));
            lista_revolucionarios.add(new Personaje("Ivankov", "Revolucionario", 0, "Horu Horu no Mi", "Líder de la isla Kamabakka y experto en hormonas."));
            lista_revolucionarios.add(new Personaje("Koala", "Revolucionario", 0, "Ninguna", "Combatiente de los Revolucionarios, exesclava de la familia Donquixote."));
            lista_revolucionarios.add(new Personaje("Belo Betty", "Revolucionario", 0, "Kobu Kobu no Mi", "Miembro de los Revolucionarios que inspira a la gente a luchar."));
            lista_revolucionarios.add(new Personaje("Inazuma", "Revolucionario", 0, "Choki Choki no Mi", "Miembro de los Revolucionarios con habilidades únicas."));
            lista_revolucionarios.add(new Personaje("Hack", "Revolucionario", 0, "Ninguna", "Líder de los revolucionarios que defiende a los seres marinos."));
            lista_revolucionarios.add(new Personaje("Karasu", "Revolucionario", 0, "Ninguna", "Experto en el uso de pájaros para espionaje."));
            lista_revolucionarios.add(new Personaje("Lindbergh", "Revolucionario", 0, "Ninguna", "Científico de los Revolucionarios, experto en tecnología."));
            lista_revolucionarios.add(new Personaje("Terry Gilteo", "Revolucionario", 0, "Ninguna", "Miembro que apoya las acciones de los Revolucionarios."));
            lista_revolucionarios.add(new Personaje("Morley", "Revolucionario", 0, "Pusha Pusha no Mi", "Gigante y defensor de los derechos de los seres humanos."));

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
