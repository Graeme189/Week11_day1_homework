public class Printer {
    private int sheets;
    private int copies;
    private int pages;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public boolean printIfEnoughSheets(int copies, int pages) {
         if (sheets >= (copies * pages)) {
             return true;
        } else {
            return false;
         }
    }
}

