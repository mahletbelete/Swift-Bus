package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AIChatbotTest {

    private AIChatbot chatbot;

    @BeforeEach
    void setUp() {
        chatbot = new AIChatbot(1, "SwiftBot", "English", "Active");
    }

    @Test
    void testRespondToQuery() {
        assertEquals("Response to: Hello", chatbot.respondToQuery("Hello"));
    }

    @Test
    void testProvideHelp() {
        assertEquals("Help information provided", chatbot.provideHelp());
    }

    @Test
    void testSuggestRoutes() {
        assertEquals("Suggested routes displayed", chatbot.suggestRoutes());
    }

    @Test
    void testEndChat() {
        assertEquals("Chat ended successfully", chatbot.endChat());
    }

    @Test
    void testChatbotId() {
        assertEquals(1, chatbot.getChatbotId());
    }
}
