package com.example.helloandroid;

public class ThreadTest extends Thread{
    public void run(){
            try {
                Thread.sleep(2000);
                //ystem.out.println("Test Class : " + DataHandlerObject.summonerIds.getId());
                //System.out.println("Test Class : " + DataHandlerObject.leagueInfos.get(0).getTier());
                //System.out.println("Test Class : " + DataHandlerObject.leagueInfos.get(0).getRank());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
