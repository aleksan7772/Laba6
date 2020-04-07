import java.util.Arrays;

public class Book {
    private String name;
    private int[] numberOfPages = new int[100];
    private String[] chapterList = new String[1];
    private String category;
    private Boolean palette;

    {
        // By Default
        chapterList[0] = "Черновик";
        numberOfPages();
    }

    public static void generateChapter() {

    }

    private void numberOfPages() {
        for (int i = 0; i < numberOfPages.length; i++) {
            numberOfPages[i] = i;
        }
    }
    public static int[][] generateChapter(int[] numberOfPages, int chapterCount) {
        int size = numberOfPages.length / chapterCount;
        int[][] chapters = new int[chapterCount][];
        for (int i = 0; i < size; i++) {
            if (size * i - i >= 0) System.arraycopy(numberOfPages, i, chapters[i], i, size * i - i);
        }
        return chapters;
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println();
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








        

