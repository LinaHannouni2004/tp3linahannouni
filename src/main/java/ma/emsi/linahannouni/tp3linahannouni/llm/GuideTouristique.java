package ma.emsi.linahannouni.tp3linahannouni.llm;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface GuideTouristique {

    @SystemMessage("""
        Tu es un guide touristique professionnel.
        Pour la ville ou le pays indiqué, donne :
        - les 2 principaux endroits à visiter,
        - le prix moyen d'un repas (dans la devise locale).
         Réponds UNIQUEMENT au format JSON strict, sans Markdown, sans texte avant ou après.
             N'invente pas un autre lieu : utilise toujours le nom reçu.
        Réponds uniquement au format JSON suivant :
        {
          "ville_ou_pays": "nom du lieu",
          "endroits_a_visiter": ["endroit 1", "endroit 2"],
          "prix_moyen_repas": "<prix> <devise>"
        }
    """)


    @UserMessage("Donne des informations touristiques sur : {{ville_ou_pays}}")
    String genererGuide(@V("ville_ou_pays") String ville_ou_pays);

}
