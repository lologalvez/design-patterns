import Logger.DomainError;
import Logger.Logger;
import Logger.Redis.RedisClient;
import Logger.Redis.RedisLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class RedisLoggerTest {

    @Mock
    RedisClient redisClient;

    @Mock
    Logger logger;

    private RedisLogger redisLogger;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        redisLogger = new RedisLogger(logger, redisClient);
    }

    @Test
    public void should_log_error_increment_to_redis() {
        DomainError error = new DomainError("aDate", "slack", "aLine");

        redisLogger.log(error);

        verify(logger).log(error);
        verify(redisClient).put(1);
    }
}



