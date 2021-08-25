import org.testng.annotations.Test;
import restConsumer.RestUtils;
import service.CasesService;
import utilBuilder.Constants;
import utilBuilder.EndPoints;
import utilBuilder.UrlBuilder;

import java.util.List;

public class GetCases {

    /**
     * if require we can read data from CSV and map to Data provider
     */

    @Test
    public void getCases_Countries(){
        CasesService casesService = new CasesService();
        List<Long> caseslist = casesService.cases_country_service();
    }
}
