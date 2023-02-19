package HomeTask7;

public class Logger {

    public enum LogLevel {
        INFO("\u001B[36m"), // Cyan
        DEBUG("\u001B[35m"), // Purple
        WARN("\u001B[33m"), // Yellow
        ERROR("\u001B[31m"); // Red

        private final String colorCode;

        LogLevel(String colorCode) {
            this.colorCode = colorCode;
        }

        public String getColorCode() {
            return colorCode;
        }
    }

    private LogLevel level;

    public Logger(LogLevel level) {
        this.level = level;
    }

    public void log(String message) {
        System.out.println(level.getColorCode() + "[" + level.name() + "] " + message + "\u001B[0m"); // Reset color
    }
}



