package com.example.helloandroid.search;

import androidx.annotation.NonNull;

import java.util.Arrays;

/**
 * 검색 화면을 구성하는데 필요한 DataObject
 *
 * @author 고동현
 * @since 2021-11-20
 */
public class SearchItemObject {
    /**
     * 승패 여부
     */
    private boolean win;
    /**
     * 챔피언 URL 필요함
     */
    private String champion;

    /**
     * 게임시간 단순 텍스트
     */
    private String gameTime;
    /**
     * 스펠 이미지 URL 필요함
     */
    private String[] spell = new String[2];
    /**
     * 룬 이미지 URL 필요함
     */
    private String[] runes = new String[2];
    /**
     * kda 단순 텍스트
     */
    private String kda;
    /**
     * 아이템 이미지 URL 필요함
     */
    private String[] item = new String[6];
    /**
     * 장신구 이미지 URL 필요함
     */
    private String totem;

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public String[] getSpell() {
        return spell;
    }

    public void setSpell(String[] spell) {
        this.spell = spell;
    }

    public String[] getRunes() {
        return runes;
    }

    public void setRunes(String[] runes) {
        this.runes = runes;
    }

    public String getKda() {
        return kda;
    }

    public void setKda(String kda) {
        this.kda = kda;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    public String getTotem() {
        return totem;
    }

    public void setTotem(String totem) {
        this.totem = totem;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getChampion() {
        return champion;
    }

    @NonNull
    @Override
    public String toString() {
        return "SearchItemObject{" +
                "win='" + win + '\'' +
                ", champion='" + champion + '\'' +
                ", gameTime='" + gameTime + '\'' +
                ", spell=" + Arrays.toString(spell) +
                ", runes=" + Arrays.toString(runes) +
                ", kda='" + kda + '\'' +
                ", item=" + Arrays.toString(item) +
                ", totem='" + totem + '\'' +
                '}';
    }
}
