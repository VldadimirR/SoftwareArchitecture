package Lesson6.HEXArch.Application;

import Lesson6.HEXArch.Domain.MovieReview;
import Lesson6.HEXArch.Domain.MovieSearchRequest;

import java.util.List;

/**
 * Интерфейс получения обзора на фильм
 */
public interface IFetchMovieReviews {
    /**
     * метод для получения обзоров на фильмы
     *
     * @param movieSearchRequest - запрос на поиск фильма
     * @return - лист с оценками
     */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
