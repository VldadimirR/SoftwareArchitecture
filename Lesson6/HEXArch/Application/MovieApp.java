package Lesson6.HEXArch.Application;

import Lesson6.HEXArch.Domain.MovieReview;
import Lesson6.HEXArch.Domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Основной класс логики приложения
 */

public class MovieApp implements Consumer<MovieSearchRequest> {
    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    /**
     * @param fetchMovieReviews - получение обзора фильмов
     * @param printMovieReviews - печать обзора фильмов
     */
    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    /**
     * фильтрация рандомных отзывов на фильмы
     *
     * @param movieReviewList - список отзывов
     * @return - список отзывов
     */
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    /**
     * метод приема запроса и передачи рандомных отзывов на печать в консоль
     *
     * @param movieSearchRequest - запрос на поиск фильма
     */
    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        printMovieReviews.writeMovieReviews(randomReviews);
    }
}
