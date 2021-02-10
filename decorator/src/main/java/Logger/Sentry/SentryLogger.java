package Logger.Sentry;

import Logger.DomainError;
import Logger.Logger;

import java.util.Map;

public class SentryLogger implements Logger {
    private SentryClient sentryClient;

    public SentryLogger(SentryClient sentryClient) {
        this.sentryClient = sentryClient;
    }

    public void log(DomainError error) {
        Map serializedError = error.serialize();
        String sentryErrorJSON = String.format("{\"date\": \"%s\", \"type\": \"%s\", \"line\": \"%s\"}",
                serializedError.get("date"),
                serializedError.get("type"),
                serializedError.get("line"));

        this.sentryClient.log(sentryErrorJSON);
    }
}
