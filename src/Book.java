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

    }

//    public static String[] ChapterList = new String[]{"Введение, Основы военного дела, Военные стратегии, Виды боевых машин, Сражение на воде"};


        

