public class Book {
    private String Name;
    private int[] NumberOfPages;
    private String[] ChapterList;
    private String category;
    private Boolean Palette;

    public Book(String военное_дело, int i, String s, String техника, boolean palette) {
    }

    public Book(String name, int[] numberOfPages, String[] chapterList, String category, Boolean palette) {
        Name = name;
        NumberOfPages = numberOfPages;
        ChapterList = chapterList;
        this.category = category;
        Palette = palette;
    }

    public int[] getNumberOfPages() {

        for (int i = 0; i < NumberOfPages.length; i++) {
            int numberOfPage = NumberOfPages[i];
            return NumberOfPages;

        }

        return new int[0];
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumberOfPages(int[] numberOfPages) {
        NumberOfPages = numberOfPages;
    }

    public String[] getChapterList() {
        return ChapterList;
    }

    public void setChapterList(String[] chapterList) {
        ChapterList = chapterList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPalette() {
        return Palette;
    }

    public void setPalette(Boolean palette) {
        Palette = palette;
    }
}

//    public static String[] ChapterList = new String[]{"Введение, Основы военного дела, Военные стратегии, Виды боевых машин, Сражение на воде"};


        

