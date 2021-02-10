import Logger.DomainError;
import Logger.Logger;
import Logger.Slack.SlackClient;
import Logger.Slack.SlackLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class SlackLoggerTest {

    @Mock
    SlackClient slackClient;

    @Mock
    Logger logger;

    private SlackLogger slackLogger;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        slackLogger  = new SlackLogger(logger, slackClient);
    }

    @Test
    public void should_log_an_error_to_slack_if_type_is_slack() {
        DomainError error = new DomainError("aDate", "slack", "aLine");

        slackLogger.log(error);

        String slackErrorMessage = "There was an error";
        verify(logger).log(error);
        verify(slackClient).send(slackErrorMessage);
    }

    @Test
    void should_not_log_an_error_to_slack_if_type_is_not_slack() {
        DomainError error = new DomainError("aDate", "anythingButSlack", "aLine");

        slackLogger.log(error);

        verify(logger).log(error);
        verify(slackClient, never()).send(anyString());
    }
}



