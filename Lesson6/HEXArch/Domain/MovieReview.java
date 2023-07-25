package Lesson6.HEXArch.Domain;

/**
 * Класс  описания структуры обзора фильма
 */

public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    /**
     * Конструктор обзоа фильма
     *
     * @param s         - название фильма
     * @param v         - оценка фильма
     * @param excellent - примечание
     */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    @Override
    public String toString() {
        return " " + movieScore + " " + remark;
    }
}
