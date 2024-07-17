package com.itacademy.sprint1.nivel3.entity;

public class FootballNews extends com.itacademy.sprint1.nivel3.entity.News {
    private String championship;
    private  String team;
    private String player;

    public FootballNews(String title, String text, Double point, Double price,
                        String championship, String team, String player) {
        super(title, text, point, price);
        this.championship = championship;
        this.team = team;
        this.player = player;
    }

    public String getChampionship() {
        return championship;
    }

    public String getTeam() {
        return team;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "FootballNews{" +
                "championship='" + championship + '\'' +
                ", team='" + team + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}
