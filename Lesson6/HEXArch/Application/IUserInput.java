package Lesson6.HEXArch.Application;

/**
 * Интерфейс пользовательского ввода
 */

public interface IUserInput {
    /**
     * обрабатывание пользовательского ввода
     *
     * @param userCommand - команда пользователя
     */
    public void handleUserInput(Object userCommand);
}