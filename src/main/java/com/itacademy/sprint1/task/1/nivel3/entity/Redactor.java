package com.itacademy.sprint1.nivel3.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Redactor extends com.itacademy.sprint1.nivel3.entity.Employed {

    private Map<String, com.itacademy.sprint1.nivel3.entity.News> news;
    public Redactor(String name, String dni) {
        super(name, dni );
        this.news = new HashMap<>();

    }

    public void agregarNoticia(com.itacademy.sprint1.nivel3.entity.News noticia) {
        news.put(noticia.getTitle(), noticia);
    }

    public void eliminarNoticia(String titulo) {
        news.remove(titulo);
    }

    public Collection<com.itacademy.sprint1.nivel3.entity.News> mostrarNoticias() {

        Collection<com.itacademy.sprint1.nivel3.entity.News> l = news.values().stream().toList();
        return l;
    }

    public com.itacademy.sprint1.nivel3.entity.News obtenerNoticia(String titulo) {
        return news.get(titulo);
    }




}
