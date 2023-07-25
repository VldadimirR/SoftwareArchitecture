package Lesson6.HEXArch.Adapters;

import Lesson6.HEXArch.Application.IFetchMovieReviews;
import Lesson6.HEXArch.Domain.MovieReview;
import Lesson6.HEXArch.Domain.MovieSearchRequest;

import java.util.*;

/**
 * Репозиторий для хранения обзоров фильма
 */
public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    /**
     * в конструкторе происходит инициализция фильмов
     */
    public MovieReviewsRepo() {
        initialize();
    }

    /**
     * метод для получения обзоров на фильмы
     *
     * @param movieSearchRequest - запрос на поиск фильма
     * @return - лист с оценками
     */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    /**
     * метод инициализации фильмов
     */
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
