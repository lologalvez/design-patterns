package Logger.Sentry;

public interface SentryClient {

    void log(String sentryErrorJSON);
}
