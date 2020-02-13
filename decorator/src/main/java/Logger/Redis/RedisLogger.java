package Logger.Redis;

import Logger.Logger;
import Logger.DomainError;

public class RedisLogger {
    private final Logger logger;
    private final RedisClient redisClient;

    public RedisLogger(Logger logger, RedisClient redisClient) {

        this.logger = logger;
        this.redisClient = redisClient;
    }

    public void log(DomainError error) {
        this.redisClient.put(1);
        this.logger.log(error);
    }
}
