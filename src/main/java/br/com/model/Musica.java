package br.com.model;

import br.com.interfaces.IMusica;

public class Musica implements IMusica {
    private String titulo;
    private String artista;
    private String genero;

    public Musica(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getArtista() {
        return artista;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }
}
