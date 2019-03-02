package com.awesome2048.score;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.web.client.RestTemplate;

@JsonSerialize(using = ScoreSerializer.class)
@Entity
@Table(name = "scores")
public class Score {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "score", nullable = false)
    private int score;

    @Column(name = "ip", nullable = false)
    private String ip;

    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Score() {}

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountryCode() {
        String endpoint = "http://api.ipinfodb.com/v3/ip-country/?key=62ee2a10303261af0cf55d6eb2c807c8db5e6fa539fe5ba843c341f4062bfaea&ip= " + this.getIp();
        RestTemplate restTemplate = new RestTemplate();
        String countryCode = restTemplate.getForObject(endpoint, String.class).split(";")[3];
        return countryCode;
    }
}
