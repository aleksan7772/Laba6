import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Военное дело");
        book.setPalette(true);
        // Use by default
        System.out.println(Arrays.toString(book.getChapterList()));
        System.out.println(Arrays.toString(book.getNumberOfPages()));

        // Use manual values
        String[] chapterList = new String[5];
        chapterList[0] = "Введение";
        chapterList[1] = "Основы военного дела";
        chapterList[2] = "Военные стратегии";
        chapterList[3] = "Виды боевых машин";
        chapterList[4] = "Сражение на воде";
        book.setChapterList(chapterList);
        int[] numberOfPages = new int[1000];
        for (int i = 0; i < numberOfPages.length; i++) {
            numberOfPages[i] = i;
        }
        book.setNumberOfPages(numberOfPages);
        System.out.println(Arrays.toString(book.getChapterList()));
        System.out.println(Arrays.toString(book.getNumberOfPages()));
    }
}
