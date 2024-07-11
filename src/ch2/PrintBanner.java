package ch2;

import ch2.Print;

//public class PrintBanner extends Banner implements Print {
//    public PrintBanner(String string)
//    {
//        super(string);
//    }
//
//    @Override
//    public void printWeak()
//    {
//        showWithParen();
//    }
//
//    @Override
//    public void printStrong()
//    {
//        showWithAster();
//    }
//}

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }
}