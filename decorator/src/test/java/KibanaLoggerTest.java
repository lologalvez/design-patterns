import Logger.DomainError;
import Logger.Kibana.KibanaClient;
import Logger.Kibana.KibanaLogger;
import Logger.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class KibanaLoggerTest {

    @Mock
    KibanaClient kibanaClient;

    @Mock
    Logger logger;

    private KibanaLogger kibanaLogger;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        kibanaLogger  = new KibanaLogger(logger, kibanaClient);
    }

    @Test
    public void should_log_an_error_to_kibana() {
        DomainError error = new DomainError("aDate", "critical", "aLine");

        kibanaLogger.log(error);

        String kibanaErrorJSON = "{\"date\": \"aDate\", \"type\": \"critical\"}";
        verify(logger).log(error);
        verify(kibanaClient).log(kibanaErrorJSON);
    }

    @Test
    public void should_not_log_an_error_to_kibana_if_error_is_not_critical() {
        DomainError error = new DomainError("aDate", "nonCritical", "aLine");

        kibanaLogger.log(error);

        verify(logger).log(error);
        verify(kibanaClient, never()).log(anyString());
    }
}



