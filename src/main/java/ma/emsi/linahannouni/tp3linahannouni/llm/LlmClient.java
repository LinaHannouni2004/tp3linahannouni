package ma.emsi.linahannouni.tp3linahannouni.llm;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.Dependent;

@Dependent

public class LlmClient {

    private final GuideTouristique guideTouristique;

    public LlmClient() {
        ChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("GEMINI_KEY")) 
                .modelName("gemini-2.5-flash")
                .build();

        this.guideTouristique = AiServices.builder(GuideTouristique.class)
                .chatModel(model)
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }

    public String getGuide(String lieu) {
        return guideTouristique.genererGuide(lieu);
    }
}
