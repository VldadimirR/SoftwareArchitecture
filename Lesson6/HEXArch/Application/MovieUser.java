package Lesson6.HEXArch.Application;

import Lesson6.HEXArch.Domain.MovieSearchRequest;

/**
 * Класс содержищий пользовательский ввод
 */
public class MovieUser {
    private IUserInput userInputDriverPort;

    /**
     * @param userInputDriverPort - пользовательский ввод
     */
    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    /**
     * метод получения запроса
     *
     * @param movieSearchRequest - запрос на поиск фильма
     */
    public void processInput(MovieSearchRequest movieSearchRequest) {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
