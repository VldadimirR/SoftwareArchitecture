package Lesson6.HEXArch.Adapters;

import Lesson6.HEXArch.Application.IFetchMovieReviews;
import Lesson6.HEXArch.Application.IPrintMovieReviews;
import Lesson6.HEXArch.Application.IUserInput;
import Lesson6.HEXArch.Application.MovieApp;
import Lesson6.HEXArch.Domain.Model;
import Lesson6.HEXArch.Domain.MovieSearchRequest;

/**
 * Класс запроса пользовательского ввода
 */

public class UserCommand implements IUserInput {
    private Model model;

    /**
     * в конструкторе создается новый объект приложения для фильмов
     *
     * @param fetchMovieReviews
     * @param printMovieReviews
     */
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    /**
     * обрабатывание пользовательского ввода
     *
     * @param userCommand - команда пользователя
     */
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest) userCommand);
    }
}