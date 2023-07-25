package Lesson6.HEXArch.Domain;

import Lesson6.HEXArch.Application.MovieApp;

/**
 * класс модели приложения
 */

public class Model {

    private MovieApp movieApp;

    /**
     * @param movieApp - приложение для фильмов
     */
    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
     * метод для запуска основной логики приложения
     *
     * @param movieSearchRequest - запрос на поиск фильма
     */
    public void Run(MovieSearchRequest movieSearchRequest) {
        movieApp.accept(movieSearchRequest);
    }

}