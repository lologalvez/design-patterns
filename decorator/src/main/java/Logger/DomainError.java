package Logger;

import java.util.HashMap;
import java.util.Map;

public class DomainError {
    private final String date;
    private final String type;
    private final String line;

    public DomainError(String date, String type, String line) {

        this.date = date;
        this.type = type;
        this.line = line;
    }

    public Map serialize() {
        return new HashMap<String, String>() {{
            put("date", date);
            put("type", type);
            put("line", line);
        }};
    }
}
