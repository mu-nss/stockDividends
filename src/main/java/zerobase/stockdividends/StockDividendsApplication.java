package zerobase.stockdividends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockDividendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockDividendsApplication.class, args);

//        Scraper scraper = new YahooFinanceScraper();
//        var result = scraper.scrap(Company.builder().ticker("O").build());
//        var result = scraper.scrapCompanyByTicker("MMM");
//        System.out.println(result);
    }
}