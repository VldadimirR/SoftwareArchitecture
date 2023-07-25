package Lesson6.HEXArch;

import Lesson6.HEXArch.Adapters.ConsolePrinter;
import Lesson6.HEXArch.Adapters.MovieReviewsRepo;
import Lesson6.HEXArch.Adapters.UserCommand;
import Lesson6.HEXArch.Application.IFetchMovieReviews;
import Lesson6.HEXArch.Application.IPrintMovieReviews;
import Lesson6.HEXArch.Application.IUserInput;
import Lesson6.HEXArch.Application.MovieUser;
import Lesson6.HEXArch.Domain.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {
        /**
         * Создание 3 объектов адаптеров ( Репозиторий, принтер, команда )
         */
        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);
        /**
         * порт на который будет оправлен запрос
         */
        MovieUser movieUser = new MovieUser(userCommand);
        /**
         * 2 объекта запроса поиска отзывов по имени
         */
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}
