package mydemo.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Json;

import java.util.List;


/**
 * Created by luxp on 2016/3/25.
 */
public class RentProcessor implements PageProcessor {
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    @Override
    public void process(Page page) {
        List<String> List = page.getHtml()
                .xpath("//*[@id=\"clist\"]")
//                .regex("<(\\S*?)[^(>|class)]*>.*?</\\1dt>(\\s*?)<dd(\\s*?)[^>].*?</\\1dd>")
                .all();
        Json json = page.getJson();
        page.putField("province", page.getJson().all());
    }

    @Override
    public Site getSite() {
        return this.site;
    }
}
