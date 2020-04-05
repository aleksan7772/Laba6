public class Book {
    public static int numberPages;
    private String name;
    private int[] numberOfPages = new int[50];
    private String[] chapterList = new String[5];
    private String category;
    private Boolean palette;

    {
        chapterList[0] = "Введение";
        chapterList[1] = "Основы военного дела";
        chapterList[2] = "Военные стратегии";
        chapterList[3] = "Виды боевых машин";
        chapterList[4] = "Сражение на воде";

    }

    public int numberOfPages() {
        for (int i = 0; i < numberOfPages.length; i++) {
            int numberOfPage = numberOfPages[i];

        }
        return this.numberOfPages();
    }

    public static void main(String[] args) {
        System.out.println(Book.getNumberPages());
    }
    public static int getNumberPages() {
        return numberPages;
    }

    public static void setNumberPages(int numberPages) {
        Book.numberPages = numberPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int[] numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String[] getChapterList() {
        return chapterList;
    }

    public void setChapterList(String[] chapterList) {
        this.chapterList = chapterList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPalette() {
        return palette;
    }

    public void setPalette(Boolean palette) {
        this.palette = palette;
    }
}








        

