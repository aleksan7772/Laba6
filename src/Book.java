public class Book {
    public static int numberPages;
    private String name;
    private int[] numberOfPages = new int[1];
    private String[] chapterList = new String[1];
    private String category;
    private Boolean palette;

    {
        // By Default
        chapterList[0] = "Черновик";
        numberOfPages();
    }

    private void numberOfPages() {
        for (int i = 0; i < numberOfPages.length; i++) {
            numberOfPages[i] = i;
        }
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








        

