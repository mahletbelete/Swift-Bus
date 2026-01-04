package Swiftbus;

/**
 * @author hp
 * @version 1.0
 * @created 31-Dec-2025 2:53:16 PM
 */
public class AIChatbot {

    private int chatbotId;
    private String botName;
    private String language;
    private String status;

    // Default constructor
    public AIChatbot() {
    }

    // Parameterized constructor (used in JUnit tests)
    public AIChatbot(int chatbotId, String botName, String language, String status) {
        this.chatbotId = chatbotId;
        this.botName = botName;
        this.language = language;
        this.status = status;
    }

    public int getChatbotId() {
        return chatbotId;
    }

    public String respondToQuery(String message) {
        return "Response to: " + message;
    }

    public String provideHelp() {
        return "Help information provided";
    }

    public String suggestRoutes() {
        return "Suggested routes displayed";
    }

    public String endChat() {
        return "Chat ended successfully";
    }
}
