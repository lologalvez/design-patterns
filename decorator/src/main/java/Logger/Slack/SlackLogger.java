package Logger.Slack;

import Logger.DomainError;
import Logger.Logger;

import java.util.Map;

public class SlackLogger {
    private final Logger logger;
    private final SlackClient slackClient;

    public SlackLogger(Logger logger, SlackClient slackClient) {

        this.logger = logger;
        this.slackClient = slackClient;
    }

    public void log(DomainError error) {
        Map serializedError = error.serialize();

        if (serializedError.get("type").equals("slack")) {
            this.slackClient.send("There was an error");
        }
        this.logger.log(error);
    }
}
