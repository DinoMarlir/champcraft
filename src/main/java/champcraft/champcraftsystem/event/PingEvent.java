package champcraft.champcraftsystem.event;

import org.betterspigot.bspigot.operating.BRandom;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PingEvent implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent event) {
        String[] s = {"Deine Muddi hat Angst vor Schweinen", "Ich bin nie schlecht gelaunt, wenn ich allein bin, also liegt es nicht an mir!", "LOOL", "LMAOOOO", "DerDino_Marlir fell from a high place", "Die Zukunft", "§1Just another BungeeCord", "craftattack 8", "48GM, 16 Kerne ABFAHRT", "GANG GANG GANG GANG GANG",
        "Team Labor for the Win", "A: wan haben sie geburtztag B: 15 Juni A: Welches Jahr B: Jedes jahr", "Homie", "bin twitch-mod bei norisk", "HGLabor.de", "§e§lChampCraft §62 §7— §eDie Zukunft", "Ihr jungster Sohn , der 25 Jährige. Wie alt ist der?", "Waren sie anwesend als das bild von ihnen gemacht worden ist?",
        "OG wer bei ChampCraft 1 dabei war", "nid so OP wie letztes mal ahahhahaha", "NoCheating", "introducing AntiXray (spaß hackt rein)", "hört doch", "folgt doch", "xd", "XD", "reist das?", "A: Alle deine antworten solen mündlich sein. Auf welcher schule gehst du B: Mündlich", "folgt doch", "Nur NoRisk darf Schemetica nutzen!",
        "Kennst du den Witz wo alle Idioten nein sagen?", "NoRiskClient 1.16 Pflicht", "jk", "<3", "alles gute Hugo", "wisstiger", "thehehehhehehehe", "Ugo Hugo Bugo", "alles gute", "MELONENGOLEM", "GELOMENMELONEN", "https://open.spotify.com/playlist/4jxTeiljKrO76xZ2gVAMYv?si=IF4WfQRHTKqzdsoZ4dy8Hg"};
        event.setMaxPlayers(new Random().nextInt(Bukkit.getOnlinePlayers().size()+1000));
        event.setMotd(s[new Random().nextInt(s.length)]);
    }

}
