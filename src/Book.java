public class Book {
    private String Name;
    private int[] NumberOfPages = new int[50];
    private String[] ChapterList = new String[5];
    private String category;
    private Boolean Palette;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int[] getNumberOfPages() {
        return NumberOfPages;
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


        

