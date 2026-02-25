package com.curso.gameapi.models;

import jakarta.persistence.*;

import java.time.Year;

@Entity //Responsável por levar uma classe como uma entidade para o Banco de Dados (DB)
public class game {

    //Propriedades
    @Id //Indica chave primária - PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica o campo auto-gerado
    private Integer id;

    @Column //Indica um campo/coluna em uma identidade
    private String title;

    @Column
    private String publisher;

    @Column
    private String gender;

    @Column
    private Year releaseyear;

    //Construtores
    public game(Year year, String gender, String publisher, String title) {
        this.releaseyear = year;
        this.gender = gender;
        this.publisher = publisher;
        this.title = title;
    }


    //Getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGender() {
        return gender;
    }

    public Year getYear() {
        return releaseyear;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(Year releaseyear) {
        this.releaseyear = releaseyear;
    }


    //Métodos sobrescritos
    @Override
    public String toString() {
        return "game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + releaseyear +
                '}';
    }
}
