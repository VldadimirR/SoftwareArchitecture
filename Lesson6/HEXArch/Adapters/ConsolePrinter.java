package Lesson6.HEXArch.Adapters;

import Lesson6.HEXArch.Application.IPrintMovieReviews;
import Lesson6.HEXArch.Domain.MovieReview;

import java.util.List;

/**
 * Класс для вывода результатов запроса
 */
public class ConsolePrinter implements IPrintMovieReviews {
    /**
     * метод печати результата в консоль
     *
     * @param movieReviewList - список с отзывами фильмов
     */
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}