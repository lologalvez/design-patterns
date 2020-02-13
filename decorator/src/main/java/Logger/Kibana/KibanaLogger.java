package Logger.Kibana;

import Logger.DomainError;
import Logger.Logger;

import java.util.Map;

public class KibanaLogger implements Logger {
    private final Logger logger;
    private final KibanaClient kibanaClient;

    public KibanaLogger(Logger logger, KibanaClient kibanaClient) {
        this.logger = logger;
        this.kibanaClient = kibanaClient;
    }

    public void log(DomainError error) {
        this.logger.log(error);

        Map serializedError = error.serialize();
        if (serializedError.get("type").equals("critical")) {
            String kibanaErrorJSON = String.format("{\"date\": \"%s\", \"type\": \"%s\"}",
                serializedError.get("date"),
                serializedError.get("type")
            );

            this.kibanaClient.log(kibanaErrorJSON);
        }
    }
}
