package console;

public class ConsoleOutput {
    public static void main(String[] args) {
        // println - Отправляет текст в консось и переносит строку.
        System.out.println("ОООО В консоли появилось сообщение, ЫУЫ");
        System.out.println("А это сообщение на следующей строке, ЫЫЫЫ");

        // print - Отправляет текст в консось и... всё. Если вызывать ещё раз, то всё будет записываться в одну строку.
        System.out.print("А это первая часть залупы коня, ");
        System.out.print("А это вторая часть залупы коня.");
    }
}
