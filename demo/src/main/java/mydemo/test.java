package mydemo;

import mydemo.processor.RentProcessor;
import us.codecraft.webmagic.Spider;

/**
 * Created by luxp on 2016/3/25.
 */
public class test {
    public static void main(String[] args) {
        Spider.create(new RentProcessor())
                .addUrl("http://www.58.com/changecity.aspx?PGTID=0d100000-014d-6377-bd27-c32ef958c899&ClickID=1")
                .run();
    }
}
