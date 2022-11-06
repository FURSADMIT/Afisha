package ru.netology.afisha;

public class FilmsManager {
    private String[] films = new String[0];
    private int maxLimit;

    public FilmsManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public FilmsManager() {
        this.maxLimit = 10;
    }

    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        String[] allFilms = findAll();

        int resultLength;
        if (maxLimit > allFilms.length) {
            resultLength = allFilms.length;
        } else {
            resultLength = maxLimit;
        }

        String[] reverseFilms = new String[resultLength];
        for (int i = 0; i < reverseFilms.length; i++) {
            reverseFilms[i] = allFilms[allFilms.length - 1 - i];
        }
        return reverseFilms;
    }



}