package ru.netology.films;

public class ListOfFilms {
    private String[] films = new String[0];
    private int limit;

    public ListOfFilms() {
        this.limit = 5;
    }

    public ListOfFilms(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findall() {
        return films;
    }

    public String[] findLast() {
        int totalFilms;

        if (films.length < limit) {
            totalFilms = films.length;
        } else {
            totalFilms = limit;
        }

        String[] tmp = new String[totalFilms];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
