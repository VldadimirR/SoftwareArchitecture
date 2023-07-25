package Lesson6.HEXArch.Domain;

/**
 * Класс запроса поиска фильма
 */

public class MovieSearchRequest {
    String request;

    /**
     * метод получения отзывов по названию фильма
     *
     * @param name - название фильма
     */
    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
