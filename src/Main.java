import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Военное дело");
        book.setPalette(true);
        book.setCategory("Техника");
        String[] chapterList = new String[5];
        chapterList[0] = "Введение";
        chapterList[1] = "Основы военного дела";
        chapterList[2] = "Военные стратегии";
        chapterList[3] = "Виды боевых машин";
        chapterList[4] = "Сражение на воде";
        book.setChapterList(chapterList);
        int[] numberPages = new int[100];
        for (int i = 0; i < numberPages.length; i++) {
            numberPages[i] = (i + 1);
            book.setNumberOfPages(numberPages);
        }

        System.out.println("Название Книги " + book.getName());
        System.out.println("Категория " + book.getCategory());
        System.out.println("Главы " + Arrays.toString(book.getChapterList()));
        System.out.println("Количество страниц " + Arrays.toString(book.getNumberOfPages()));
    }
}
