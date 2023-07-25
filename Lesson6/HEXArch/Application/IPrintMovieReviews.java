package Lesson6.HEXArch.Application;

import Lesson6.HEXArch.Domain.MovieReview;

import java.util.List;

/**
 * Интерфейс для вывода результатов запроса
 */
public interface IPrintMovieReviews {
    /**
     * метод печати результата в консоль
     *
     * @param movieReviewList - список с отзывами фильмов
     */
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}