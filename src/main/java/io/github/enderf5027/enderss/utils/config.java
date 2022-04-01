package io.github.enderf5027.enderss.utils;

import io.github.enderf5027.enderss.Enderss;
import net.md_5.bungee.config.Configuration;

import java.util.List;

public class config  {
    public static Configuration cfg = Enderss.config;

    public static String ScreenShareServer;
    public static String FallbackServer;
    public static boolean LastConnectedServer;
    public static boolean FallBackStaff;
    public static String prefix;
    public static String noperm;
    public static String nocommand;
    public static String console;
    public static String noplayer;
    public static String anydesk;
    public static String discord;
    public static String teamspeak;
    public static String playeroffline;
    public static String alreadyinss;
    public static String staffinss;
    public static String alreadyssplayer;
    public static String suspectnotinss;
    public static String playerjoin;
    public static String playerquit;
    public static String cleanplayer;
    public static String playercleaned;
    public static String cantcontrolyourself;
    public static String cantcontrolstaff;
    public static List<String> staffmessage;
    public static List<String> ssmessage;
    public static String title;
    public static String subtitle;
    public static int fadein;
    public static int stay;
    public static int fadeout;
    public static boolean sendAnydesk;
    public static boolean sendDiscord;
    public static boolean sendTeamspeak;
    public static boolean clearchat;
    public static boolean sendTitle;
    public static String bhack;
    public static String badmission;
    public static String brefuse;
    public static String bquit;
    public static String bclean;
    public static String bconfirm;
    public static boolean confirmbutton;
    public static String hack;
    public static String admission;
    public static String refuse;
    public static String quit;
    public static String blatant;


    static  {
        assert cfg != null;
        ScreenShareServer = cfg.getString("ScreenShareServer");
        FallbackServer = cfg.getString("FallbackServer");
        LastConnectedServer = cfg.getBoolean("LastConnectedServer");
        FallBackStaff = cfg.getBoolean("FallBackStaff");
        prefix = cfg.getString("prefix");
        noperm = cfg.getString("noperm");
        anydesk = cfg.getString("anydesk");
        discord = cfg.getString("discord");
        teamspeak = cfg.getString("teamspeak");
        playeroffline = cfg.getString("playeroffline");
        alreadyinss = cfg.getString("alreadyinss");
        staffinss = cfg.getString("staffinss");
        alreadyssplayer = cfg.getString("alreadyssplayer");
        suspectnotinss =  cfg.getString("suspectnotinss");
        cantcontrolyourself = cfg.getString("cantcontrolyourself");
        cantcontrolstaff = cfg.getString("cantcontrolstaff");
        playerjoin = cfg.getString("playerjoin");
        playerquit = cfg.getString("playerquit");
        cleanplayer = cfg.getString("cleanplayer");
        playercleaned = cfg.getString("playercleaned");
        ssmessage = cfg.getStringList("ssmessage");
        staffmessage = cfg.getStringList("staffmessage");
        title = cfg.getString("title");
        subtitle = cfg.getString("subtitle");
        fadein = cfg.getInt("fadein");
        fadeout = cfg.getInt("fadeout");
        stay = cfg.getInt("stay");
        sendAnydesk = cfg.getBoolean("sendAnydesk");
        sendDiscord = cfg.getBoolean("sendDiscord");
        sendTeamspeak = cfg.getBoolean("sendTeamspeak");
        clearchat = cfg.getBoolean("clearChat");
        sendTitle = cfg.getBoolean("sendTitle");
        noplayer = cfg.getString("noplayer");
        noperm = cfg.getString("noperm");
        nocommand = cfg.getString("nocommand");
        console = cfg.getString("console");
        bhack = cfg.getString("buttons.hack");
        badmission = cfg.getString("buttons.admission");
        brefuse = cfg.getString("buttons.refuse");
        bclean = cfg.getString("buttons.clean");
        bquit = cfg.getString("buttons.quit");
        bconfirm = cfg.getString("buttons.confirm");
        confirmbutton = cfg.getBoolean("buttons.confirmButton");
        hack = cfg.getString("bancommand.hack");
        admission = cfg.getString("bancommand.admission");
        refuse = cfg.getString("bancommand.refuse");
        quit = cfg.getString("bancommand.quit");
        blatant = cfg.getString("bancommand.blatant");
    }
}
