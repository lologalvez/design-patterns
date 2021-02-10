import Logger.DomainError;
import Logger.Sentry.SentryClient;
import Logger.Sentry.SentryLogger;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class SentryLoggerTest {


    @Mock
    SentryClient sentryClient;

    @Test
    public void should_log_an_error_to_sentry() {
        MockitoAnnotations.initMocks(this);
        SentryLogger sentryLogger  = new SentryLogger(sentryClient);
        DomainError error = new DomainError("aDate", "aType", "aLine");

        sentryLogger.log(error);

        String sentryErrorJSON = "{\"date\": \"aDate\", \"type\": \"aType\", \"line\": \"aLine\"}";
        verify(sentryClient).log(sentryErrorJSON);
    }


}



