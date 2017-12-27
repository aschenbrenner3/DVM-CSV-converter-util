package com.dvw.csv.converter.model;

import java.io.Serializable;

public class Touch implements Serializable {
    private int yearid;
    private int matchid;
    private int team;
    private int teamid;
    private int prgteamid;
    private int ply;
    private String plyid;
    private int plyprgid;
    private int plyteamprgid;
    private int sk;
    private int skty;
    private int skgrd;
    private int sk_grd;
    private int combo;
    private int tgt;
    private int strzn;
    private int endzn;
    private int endzn2;
    private int tysk;
    private int plys;
    private int special;
    private int custom;
    private int so_ps;
    private int rec_def;
    private int undefined1;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private String hh_mm_ss;
    private int game;
    private int hrot;
    private int arot;
    private int movie;
    private int sec;
    private int undefined2;
    private int harea1;
    private String harea1id;
    private int harea1prgid;
    private int harea1teamprgid;
    private int harea2;
    private String harea2id;
    private int harea3prgid;
    private int harea2teamprgid;
    private int harea3;
    private String harea3id;
    private int harea2prgid;
    private int harea3teamprgid;
    private int harea4;
    private String harea4id;
    private int harea4prgid;
    private int harea4teamprgid;
    private int harea5;
    private String harea5id;
    private int harea5prgid;
    private int harea5teamprgid;
    private int harea6;
    private String harea6id;
    private int harea6prgid;
    private int harea6teamprgid;
    private int aarea1;
    private String aarea1id;
    private int aarea1prgid;
    private int aarea1teamprgid;
    private int aarea2;
    private String aarea2id;
    private int aarea2prgid;
    private int aarea2teamprgid;
    private int aarea3;
    private String aarea3id;
    private int aarea3prgid;
    private int aarea3teamprgid;
    private int aarea4;
    private String aarea4id;
    private int aarea4prgid;
    private int aarea4teamprgid;
    private int aarea5;
    private String aarea5id;
    private int aarea5prgid;
    private int aarea5teamprgid;
    private int aarea6;
    private String aarea6id;
    private int aarea6prgid;
    private int aarea6teamprgid;
    private int skscore;
    private int hpts;
    private int apts;
    private int ptsdiff;
    private int hptsdiff;
    private int aptsdiff;
    private int strrot;
    private int hset;
    private String hsetid;
    private int hsetprgid;
    private int hsetteamprgid;
    private int aset;
    private String asetid;
    private int asetprgid;
    private int asetteamprgid;
    private int pos;
    private String row;
    private String hlineup;
    private String alineup;
    private String h_Lineup_libero;
    private String a_Lineup_libero;
    private int hLibero;
    private int aLibero;
    private int lineup_Team_Prg_ID;
    private int lineup_Prg_ID;
    private int wonlost;
    private int Prg_Rally_Set_ID;
    private int Prg_Rally_Match_ID;
    private int Prg_Rally_Data_ID;
    private int Play_In_Rally;

    public Touch(int yearid, int	matchid, int team, int teamid, int prgteamid, int ply, String plyid, int plyprgid, int	plyteamprgid, int sk, int skty, int	skgrd, int sk_grd, int combo, int	tgt, int strzn, int	endzn, int endzn2, int tysk, int plys, int special, int	custom, int	so_ps, int rec_def, int	undefined1, int	x1, int	y1, int x2, int y2, int x3, int y3, String hh_mm_ss, int game, int hrot,	int arot, int movie, int sec, int undefined2, int harea1, String harea1id, int harea1prgid, int	harea1teamprgid, int harea2, String harea2id, int	harea2prgid, int harea2teamprgid, int harea3, String harea3id, int harea3prgid, int harea3teamprgid, int harea4, String harea4id, int harea4prgid, int	harea4teamprgid, int harea5, String harea5id, int harea5prgid, int harea5teamprgid, int harea6, String harea6id, int harea6prgid, int	harea6teamprgid, int aarea1, String aarea1id, int	aarea1prgid, int aarea1teamprgid, int aarea2, String aarea2id, int	aarea2prgid, int aarea2teamprgid, int aarea3, String aarea3id, int aarea3prgid, int aarea3teamprgid, int aarea4, String aarea4id, int aarea4prgid, int aarea4teamprgid, int aarea5, String aarea5id, int aarea5prgid, int aarea5teamprgid, int aarea6, String aarea6id, int aarea6prgid, int aarea6teamprgid, int skscore, int hpts, int apts, int ptsdiff, int hptsdiff, int aptsdiff, int strrot,	 int hset, String hsetid, int hsetprgid, int hsetteamprgid, int aset, String asetid, int asetprgid, int asetteamprgid, int pos, String row, String hlineup, String alineup, String 	h_Lineup_libero, String a_Lineup_libero, int hLibero, int aLibero, int lineup_Team_Prg_ID, int lineup_Prg_ID, int wonlost, int Prg_Rally_Set_ID, int Prg_Rally_Match_ID,	int Prg_Rally_Data_ID, int Play_In_Rally) {

        super();
        this.yearid = yearid;
        this.matchid = matchid;
        this.team = team;
        this.teamid = teamid;
        this.prgteamid = prgteamid;
        this.ply = ply;
        this.plyid = plyid;
        this.plyprgid = plyprgid;
        this.plyteamprgid = plyteamprgid;
        this.sk = sk;
        this.skty = skty;
        this.skgrd = skgrd;
        this.sk_grd = sk_grd;
        this.combo = combo;
        this.tgt = tgt;
        this.strzn = strzn;
        this.endzn = endzn;
        this.endzn2 = endzn2;
        this.tysk = tysk;
        this.plys = plys;
        this.special = special;
        this.custom = custom;
        this.so_ps = so_ps;
        this.rec_def = rec_def;
        this.undefined1 = undefined1;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.hh_mm_ss = hh_mm_ss;
        this.game = game;
        this. hrot = hrot;
        this.arot = arot;
        this.movie = movie;
        this.sec = sec;
        this.undefined2 = undefined2;
        this.harea1 = harea1;
        this.harea1id = harea1id;
        this.harea1prgid = harea1prgid;
        this.harea1teamprgid = harea1teamprgid;
        this.harea2 = harea2;
        this.harea2id = harea2id;
        this.harea2prgid = harea2prgid;
        this.harea2teamprgid = harea2teamprgid;
        this.harea3 = harea3;
        this.harea3id = harea3id;
        this.harea3prgid = harea3prgid;
        this.harea3teamprgid = harea3teamprgid;
        this.harea4 = harea4;
        this.harea4id = harea4id;
        this.harea4prgid =harea4prgid;
        this.harea4teamprgid = harea4teamprgid;
        this.harea5 = harea5;
        this.harea5id = harea5id;
        this.harea5prgid = harea5prgid;
        this.harea5teamprgid = harea5teamprgid;
        this.harea6 = harea6;
        this.harea6id = harea6id;
        this.harea6prgid = harea6prgid;
        this.harea6teamprgid = harea6teamprgid;
        this.aarea1 = aarea1;
        this.aarea1id = aarea1id;
        this.aarea1prgid = aarea1prgid;
        this.aarea1teamprgid = aarea1teamprgid;
        this.aarea2 = aarea2;
        this.aarea2id = aarea2id;
        this.aarea2prgid = aarea2prgid;
        this.aarea2teamprgid = aarea2teamprgid;
        this.aarea3 = aarea3;
        this.aarea3id = aarea3id;
        this.aarea3prgid = aarea3prgid;
        this.aarea3teamprgid = aarea3teamprgid;
        this.aarea4 = aarea4;
        this.aarea4id = aarea4id;
        this.aarea4prgid = aarea4prgid;
        this.aarea4teamprgid = aarea4teamprgid;
        this.aarea5 = aarea5;
        this.aarea5id = aarea5id;
        this.aarea5prgid = aarea5prgid;
        this.aarea5teamprgid = aarea5teamprgid;
        this.aarea6 = aarea6;
        this.aarea6id = aarea6id;
        this.aarea6prgid = aarea6prgid;
        this.aarea6teamprgid = aarea6teamprgid;
        this.skscore = skscore;
        this.hpts = hpts;
        this.apts = apts;
        this.ptsdiff = ptsdiff;
        this.hptsdiff = hptsdiff;
        this.aptsdiff = aptsdiff;
        this.strrot = strrot;
        this.hset = hset;
        this.hsetid = hsetid;
        this.hsetprgid = hsetprgid;
        this.hsetteamprgid = hsetteamprgid;
        this.aset = aset;
        this.asetid = asetid;
        this.asetprgid = asetprgid;
        this.asetteamprgid = asetteamprgid;
        this.pos = pos;
        this.row = row;
        this.hlineup = hlineup;
        this.alineup = alineup;
        this.h_Lineup_libero = h_Lineup_libero;
        this.a_Lineup_libero = a_Lineup_libero;
        this.hLibero = hLibero;
        this.aLibero = aLibero;
        this.lineup_Team_Prg_ID = lineup_Team_Prg_ID;
        this.lineup_Prg_ID = lineup_Prg_ID;
        this.wonlost = wonlost;
        this.Prg_Rally_Set_ID = Prg_Rally_Set_ID;
        this.Prg_Rally_Match_ID = Prg_Rally_Match_ID;
        this.Prg_Rally_Data_ID = Prg_Rally_Data_ID;
        this.Play_In_Rally = Play_In_Rally;
    }

    public int getYearid() {
        return yearid;
    }

    public void setYearid(int yearid) {
        this.yearid = yearid;
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getPrgteamid() {
        return prgteamid;
    }

    public void setPrgteamid(int prgteamid) {
        this.prgteamid = prgteamid;
    }

    public int getPly() {
        return ply;
    }

    public void setPly(int ply) {
        this.ply = ply;
    }

    public String getPlyid() {
        return plyid;
    }

    public void setPlyid(String plyid) {
        this.plyid = plyid;
    }

    public int getPlyprgid() {
        return plyprgid;
    }

    public void setPlyprgid(int plyprgid) {
        this.plyprgid = plyprgid;
    }

    public int getPlyteamprgid() {
        return plyteamprgid;
    }

    public void setPlyteamprgid(int plyteamprgid) {
        this.plyteamprgid = plyteamprgid;
    }

    public int getSk() {
        return sk;
    }

    public void setSk(int sk) {
        this.sk = sk;
    }

    public int getSkty() {
        return skty;
    }

    public void setSkty(int skty) {
        this.skty = skty;
    }

    public int getSkgrd() {
        return skgrd;
    }

    public void setSkgrd(int skgrd) {
        this.skgrd = skgrd;
    }

    public int getSk_grd() {
        return sk_grd;
    }

    public void setSk_grd(int sk_grd) {
        this.sk_grd = sk_grd;
    }

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }

    public int getTgt() {
        return tgt;
    }

    public void setTgt(int tgt) {
        this.tgt = tgt;
    }

    public int getStrzn() {
        return strzn;
    }

    public void setStrzn(int strzn) {
        this.strzn = strzn;
    }

    public int getEndzn() {
        return endzn;
    }

    public void setEndzn(int endzn) {
        this.endzn = endzn;
    }

    public int getEndzn2() {
        return endzn2;
    }

    public void setEndzn2(int endzn2) {
        this.endzn2 = endzn2;
    }

    public int getTysk() {
        return tysk;
    }

    public void setTysk(int tysk) {
        this.tysk = tysk;
    }

    public int getPlys() {
        return plys;
    }

    public void setPlys(int plys) {
        this.plys = plys;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getCustom() {
        return custom;
    }

    public void setCustom(int custom) {
        this.custom = custom;
    }

    public int getSo_ps() {
        return so_ps;
    }

    public void setSo_ps(int so_ps) {
        this.so_ps = so_ps;
    }

    public int getRec_def() {
        return rec_def;
    }

    public void setRec_def(int rec_def) {
        this.rec_def = rec_def;
    }

    public int getUndefined1() {
        return undefined1;
    }

    public void setUndefined1(int undefined1) {
        this.undefined1 = undefined1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public String getHh_mm_ss() {
        return hh_mm_ss;
    }

    public void setHh_mm_ss(String hh_mm_ss) {
        this.hh_mm_ss = hh_mm_ss;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getHrot() {
        return hrot;
    }

    public void setHrot(int hrot) {
        this.hrot = hrot;
    }

    public int getArot() {
        return arot;
    }

    public void setArot(int arot) {
        this.arot = arot;
    }

    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getUndefined2() {
        return undefined2;
    }

    public void setUndefined2(int undefined2) {
        this.undefined2 = undefined2;
    }

    public int getHarea1() {
        return harea1;
    }

    public void setHarea1(int harea1) {
        this.harea1 = harea1;
    }

    public String getHarea1id() {
        return harea1id;
    }

    public void setHarea1id(String harea1id) {
        this.harea1id = harea1id;
    }

    public int getHarea1prgid() {
        return harea1prgid;
    }

    public void setHarea1prgid(int harea1prgid) {
        this.harea1prgid = harea1prgid;
    }

    public int getHarea1teamprgid() {
        return harea1teamprgid;
    }

    public void setHarea1teamprgid(int harea1teamprgid) {
        this.harea1teamprgid = harea1teamprgid;
    }

    public int getHarea2() {
        return harea2;
    }

    public void setHarea2(int harea2) {
        this.harea2 = harea2;
    }

    public String getHarea2id() {
        return harea2id;
    }

    public void setHarea2id(String harea2id) {
        this.harea2id = harea2id;
    }

    public int getHarea3prgid() {
        return harea3prgid;
    }

    public void setHarea3prgid(int harea3prgid) {
        this.harea3prgid = harea3prgid;
    }

    public int getHarea2teamprgid() {
        return harea2teamprgid;
    }

    public void setHarea2teamprgid(int harea2teamprgid) {
        this.harea2teamprgid = harea2teamprgid;
    }

    public int getHarea3() {
        return harea3;
    }

    public void setHarea3(int harea3) {
        this.harea3 = harea3;
    }

    public String getHarea3id() {
        return harea3id;
    }

    public void setHarea3id(String harea3id) {
        this.harea3id = harea3id;
    }

    public int getHarea2prgid() {
        return harea2prgid;
    }

    public void setHarea2prgid(int harea2prgid) {
        this.harea2prgid = harea2prgid;
    }

    public int getHarea3teamprgid() {
        return harea3teamprgid;
    }

    public void setHarea3teamprgid(int harea3teamprgid) {
        this.harea3teamprgid = harea3teamprgid;
    }

    public int getHarea4() {
        return harea4;
    }

    public void setHarea4(int harea4) {
        this.harea4 = harea4;
    }

    public String getHarea4id() {
        return harea4id;
    }

    public void setHarea4id(String harea4id) {
        this.harea4id = harea4id;
    }

    public int getHarea4prgid() {
        return harea4prgid;
    }

    public void setHarea4prgid(int harea4prgid) {
        this.harea4prgid = harea4prgid;
    }

    public int getHarea4teamprgid() {
        return harea4teamprgid;
    }

    public void setHarea4teamprgid(int harea4teamprgid) {
        this.harea4teamprgid = harea4teamprgid;
    }

    public int getHarea5() {
        return harea5;
    }

    public void setHarea5(int harea5) {
        this.harea5 = harea5;
    }

    public String getHarea5id() {
        return harea5id;
    }

    public void setHarea5id(String harea5id) {
        this.harea5id = harea5id;
    }

    public int getHarea5prgid() {
        return harea5prgid;
    }

    public void setHarea5prgid(int harea5prgid) {
        this.harea5prgid = harea5prgid;
    }

    public int getHarea5teamprgid() {
        return harea5teamprgid;
    }

    public void setHarea5teamprgid(int harea5teamprgid) {
        this.harea5teamprgid = harea5teamprgid;
    }

    public int getHarea6() {
        return harea6;
    }

    public void setHarea6(int harea6) {
        this.harea6 = harea6;
    }

    public String getHarea6id() {
        return harea6id;
    }

    public void setHarea6id(String harea6id) {
        this.harea6id = harea6id;
    }

    public int getHarea6prgid() {
        return harea6prgid;
    }

    public void setHarea6prgid(int harea6prgid) {
        this.harea6prgid = harea6prgid;
    }

    public int getHarea6teamprgid() {
        return harea6teamprgid;
    }

    public void setHarea6teamprgid(int harea6teamprgid) {
        this.harea6teamprgid = harea6teamprgid;
    }

    public int getAarea1() {
        return aarea1;
    }

    public void setAarea1(int aarea1) {
        this.aarea1 = aarea1;
    }

    public String getAarea1id() {
        return aarea1id;
    }

    public void setAarea1id(String aarea1id) {
        this.aarea1id = aarea1id;
    }

    public int getAarea1prgid() {
        return aarea1prgid;
    }

    public void setAarea1prgid(int aarea1prgid) {
        this.aarea1prgid = aarea1prgid;
    }

    public int getAarea1teamprgid() {
        return aarea1teamprgid;
    }

    public void setAarea1teamprgid(int aarea1teamprgid) {
        this.aarea1teamprgid = aarea1teamprgid;
    }

    public int getAarea2() {
        return aarea2;
    }

    public void setAarea2(int aarea2) {
        this.aarea2 = aarea2;
    }

    public String getAarea2id() {
        return aarea2id;
    }

    public void setAarea2id(String aarea2id) {
        this.aarea2id = aarea2id;
    }

    public int getAarea2prgid() {
        return aarea2prgid;
    }

    public void setAarea2prgid(int aarea2prgid) {
        this.aarea2prgid = aarea2prgid;
    }

    public int getAarea2teamprgid() {
        return aarea2teamprgid;
    }

    public void setAarea2teamprgid(int aarea2teamprgid) {
        this.aarea2teamprgid = aarea2teamprgid;
    }

    public int getAarea3() {
        return aarea3;
    }

    public void setAarea3(int aarea3) {
        this.aarea3 = aarea3;
    }

    public String getAarea3id() {
        return aarea3id;
    }

    public void setAarea3id(String aarea3id) {
        this.aarea3id = aarea3id;
    }

    public int getAarea3prgid() {
        return aarea3prgid;
    }

    public void setAarea3prgid(int aarea3prgid) {
        this.aarea3prgid = aarea3prgid;
    }

    public int getAarea3teamprgid() {
        return aarea3teamprgid;
    }

    public void setAarea3teamprgid(int aarea3teamprgid) {
        this.aarea3teamprgid = aarea3teamprgid;
    }

    public int getAarea4() {
        return aarea4;
    }

    public void setAarea4(int aarea4) {
        this.aarea4 = aarea4;
    }

    public String getAarea4id() {
        return aarea4id;
    }

    public void setAarea4id(String aarea4id) {
        this.aarea4id = aarea4id;
    }

    public int getAarea4prgid() {
        return aarea4prgid;
    }

    public void setAarea4prgid(int aarea4prgid) {
        this.aarea4prgid = aarea4prgid;
    }

    public int getAarea4teamprgid() {
        return aarea4teamprgid;
    }

    public void setAarea4teamprgid(int aarea4teamprgid) {
        this.aarea4teamprgid = aarea4teamprgid;
    }

    public int getAarea5() {
        return aarea5;
    }

    public void setAarea5(int aarea5) {
        this.aarea5 = aarea5;
    }

    public String getAarea5id() {
        return aarea5id;
    }

    public void setAarea5id(String aarea5id) {
        this.aarea5id = aarea5id;
    }

    public int getAarea5prgid() {
        return aarea5prgid;
    }

    public void setAarea5prgid(int aarea5prgid) {
        this.aarea5prgid = aarea5prgid;
    }

    public int getAarea5teamprgid() {
        return aarea5teamprgid;
    }

    public void setAarea5teamprgid(int aarea5teamprgid) {
        this.aarea5teamprgid = aarea5teamprgid;
    }

    public int getAarea6() {
        return aarea6;
    }

    public void setAarea6(int aarea6) {
        this.aarea6 = aarea6;
    }

    public String getAarea6id() {
        return aarea6id;
    }

    public void setAarea6id(String aarea6id) {
        this.aarea6id = aarea6id;
    }

    public int getAarea6prgid() {
        return aarea6prgid;
    }

    public void setAarea6prgid(int aarea6prgid) {
        this.aarea6prgid = aarea6prgid;
    }

    public int getAarea6teamprgid() {
        return aarea6teamprgid;
    }

    public void setAarea6teamprgid(int aarea6teamprgid) {
        this.aarea6teamprgid = aarea6teamprgid;
    }

    public int getSkscore() {
        return skscore;
    }

    public void setSkscore(int skscore) {
        this.skscore = skscore;
    }

    public int getHpts() {
        return hpts;
    }

    public void setHpts(int hpts) {
        this.hpts = hpts;
    }

    public int getApts() {
        return apts;
    }

    public void setApts(int apts) {
        this.apts = apts;
    }

    public int getPtsdiff() {
        return ptsdiff;
    }

    public void setPtsdiff(int ptsdiff) {
        this.ptsdiff = ptsdiff;
    }

    public int getHptsdiff() {
        return hptsdiff;
    }

    public void setHptsdiff(int hptsdiff) {
        this.hptsdiff = hptsdiff;
    }

    public int getAptsdiff() {
        return aptsdiff;
    }

    public void setAptsdiff(int aptsdiff) {
        this.aptsdiff = aptsdiff;
    }

    public int getStrrot() {
        return strrot;
    }

    public void setStrrot(int strrot) {
        this.strrot = strrot;
    }

    public int getHset() {
        return hset;
    }

    public void setHset(int hset) {
        this.hset = hset;
    }

    public String getHsetid() {
        return hsetid;
    }

    public void setHsetid(String hsetid) {
        this.hsetid = hsetid;
    }

    public int getHsetprgid() {
        return hsetprgid;
    }

    public void setHsetprgid(int hsetprgid) {
        this.hsetprgid = hsetprgid;
    }

    public int getHsetteamprgid() {
        return hsetteamprgid;
    }

    public void setHsetteamprgid(int hsetteamprgid) {
        this.hsetteamprgid = hsetteamprgid;
    }

    public int getAset() {
        return aset;
    }

    public void setAset(int aset) {
        this.aset = aset;
    }

    public String getAsetid() {
        return asetid;
    }

    public void setAsetid(String asetid) {
        this.asetid = asetid;
    }

    public int getAsetprgid() {
        return asetprgid;
    }

    public void setAsetprgid(int asetprgid) {
        this.asetprgid = asetprgid;
    }

    public int getAsetteamprgid() {
        return asetteamprgid;
    }

    public void setAsetteamprgid(int asetteamprgid) {
        this.asetteamprgid = asetteamprgid;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getHlineup() {
        return hlineup;
    }

    public void setHlineup(String hlineup) {
        this.hlineup = hlineup;
    }

    public String getAlineup() {
        return alineup;
    }

    public void setAlineup(String alineup) {
        this.alineup = alineup;
    }

    public String getH_Lineup_libero() {
        return h_Lineup_libero;
    }

    public void setH_Lineup_libero(String h_Lineup_libero) {
        this.h_Lineup_libero = h_Lineup_libero;
    }

    public String getA_Lineup_libero() {
        return a_Lineup_libero;
    }

    public void setA_Lineup_libero(String a_Lineup_libero) {
        this.a_Lineup_libero = a_Lineup_libero;
    }

    public int gethLibero() {
        return hLibero;
    }

    public void sethLibero(int hLibero) {
        this.hLibero = hLibero;
    }

    public int getaLibero() {
        return aLibero;
    }

    public void setaLibero(int aLibero) {
        this.aLibero = aLibero;
    }

    public int getLineup_Team_Prg_ID() {
        return lineup_Team_Prg_ID;
    }

    public void setLineup_Team_Prg_ID(int lineup_Team_Prg_ID) {
        this.lineup_Team_Prg_ID = lineup_Team_Prg_ID;
    }

    public int getLineup_Prg_ID() {
        return lineup_Prg_ID;
    }

    public void setLineup_Prg_ID(int lineup_Prg_ID) {
        this.lineup_Prg_ID = lineup_Prg_ID;
    }

    public int getWonlost() {
        return wonlost;
    }

    public void setWonlost(int wonlost) {
        this.wonlost = wonlost;
    }

    public int getPrg_Rally_Set_ID() {
        return Prg_Rally_Set_ID;
    }

    public void setPrg_Rally_Set_ID(int prg_Rally_Set_ID) {
        Prg_Rally_Set_ID = prg_Rally_Set_ID;
    }

    public int getPrg_Rally_Match_ID() {
        return Prg_Rally_Match_ID;
    }

    public void setPrg_Rally_Match_ID(int prg_Rally_Match_ID) {
        Prg_Rally_Match_ID = prg_Rally_Match_ID;
    }

    public int getPrg_Rally_Data_ID() {
        return Prg_Rally_Data_ID;
    }

    public void setPrg_Rally_Data_ID(int prg_Rally_Data_ID) {
        Prg_Rally_Data_ID = prg_Rally_Data_ID;
    }

    public int getPlay_In_Rally() {
        return Play_In_Rally;
    }

    public void setPlay_In_Rally(int play_In_Rally) {
        Play_In_Rally = play_In_Rally;
    }

    @Override
    public String toString() {
        return "Touch [yearid=" + yearid + ", matchid=" + matchid
                + ", team=" + team + ", teamid=" + teamid + ", prgteamid="
                + prgteamid + ", ply=" + ply + ", plyid=" + plyid + ", plyprgid=" + plyprgid + ", plyteamprgid=" + plyteamprgid + ", sk=" + sk + ", skty=" + skty + ", skgrd=" + skgrd + ", sk_grd=" + sk_grd + ", combo=" + combo + ", tgt=" + tgt + ", strzn=" + strzn + ", endzn=" + endzn + ", endzn2=" + endzn2 + ", tysk=" + tysk + ", plys=" + plys + ", special=" + special + ", custom=" + custom + ", so_ps=" + so_ps + ", rec_def=" + rec_def + ", undefined1=" + undefined1 + ", x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3 + ", y3=" + y3 + ", hh_mm_ss=" + hh_mm_ss + ", game=" + game + ", hrot=" + hrot + ", arot=" + arot + ", movie=" + movie + ", sec=" + sec + ", undefined2=" + undefined2 + ", harea1=" + harea1 + ", harea1id=" + harea1id + ", harea1prgid=" + harea1prgid + ", harea1teamprgid=" + harea1teamprgid + ", harea2=" + harea2 + ", harea2id=" + harea2id + ", harea2prgid=" + harea2prgid + ", harea2teamprgid=" + harea2teamprgid + ", harea3=" + harea3 + ", harea3id=" + harea3id + ", harea3prgid=" + harea3prgid + ", harea3teamprgid=" + harea3teamprgid + ", harea4=" + harea4 + ", harea4id=" + harea4id + ", harea4prgid=" + harea4prgid + ", harea4teamprgid=" + harea4teamprgid + ", harea5=" + harea5 + ", harea5id=" + harea5id + ", harea5prgid=" + harea5prgid + ", harea5teamprgid=" + harea5teamprgid + ", harea6=" + harea6 + ", harea6id=" + harea6id + ", harea6prgid=" + harea6prgid + ", harea6teamprgid=" + harea6teamprgid + ", aarea1=" + aarea1 + ", aarea1id=" + aarea1id + ", aarea1prgid=" + aarea1prgid + ", aarea1teamprgid=" + aarea1teamprgid + ", aarea2=" + aarea2 + ", aarea2id=" + aarea2id + ", aarea2prgid=" + aarea2prgid + ", aarea2teamprgid=" + aarea2teamprgid + ", aarea3=" + aarea3 + ", aarea3id=" + aarea3id + ", aarea3prgid=" + aarea3prgid + ", aarea3teamprgid=" + aarea3teamprgid + ", aarea4=" + aarea4 + ", aarea4id=" + aarea4id + ", aarea4prgid=" + aarea4prgid + ", aarea4teamprgid=" + aarea4teamprgid + ", aarea5=" + aarea5 + ", aarea5id=" + aarea5id + ", aarea5prgid=" + aarea5prgid + ", aarea5teamprgid=" + aarea5teamprgid + ", aarea6=" + aarea6 + ", aarea6id=" + aarea6id + ", aarea6prgid=" + aarea6prgid + ", aarea6teamprgid=" + aarea6teamprgid + ", skscore=" + skscore + ", hpts=" + hpts + ", apts=" + apts + ", ptsdiff=" + ptsdiff + ", hptsdiff=" + hptsdiff + ", aptsdiff=" + aptsdiff + ", strrot=" + strrot + ", hset=" + hset + ", hsetid=" + hsetid + ", hsetprgid=" + hsetprgid + ", hsetteamprgid=" + hsetteamprgid + ", aset=" + aset + ", asetid=" + asetid + ", asetprgid=" + asetprgid + ", asetteamprgid=" + asetteamprgid + ", pos=" + pos + ", row=" + row + ", hlineup=" + hlineup + ", alineup=" + alineup + ", h_Lineup_libero=" + h_Lineup_libero + ", a_Lineup_libero=" + a_Lineup_libero + ", hLibero=" + hLibero + ", aLibero=" + aLibero + ", lineup_Team_Prg_ID=" + lineup_Team_Prg_ID + ", lineup_Prg_ID=" + lineup_Prg_ID + ", wonlost=" + wonlost + ", Prg_Rally_Set_ID=" + Prg_Rally_Set_ID + ", Prg_Rally_Match_ID=" + Prg_Rally_Match_ID + ", Prg_Rally_Data_ID=" + Prg_Rally_Data_ID + ", Play_In_Rally=" + Play_In_Rally + "]";
    }
}
