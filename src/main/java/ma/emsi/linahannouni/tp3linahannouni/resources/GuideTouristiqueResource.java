package ma.emsi.linahannouni.tp3linahannouni.resources;


import jakarta.ws.rs.*;
import ma.emsi.linahannouni.tp3linahannouni.llm.LlmClient;


@Path("/guide")
public class GuideTouristiqueResource {

    private LlmClient llmClient = new LlmClient();

    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces("application/json")
    public String guide(@PathParam("ville_ou_pays") String lieu) {
        return llmClient.getGuide(lieu);
    }

    //@GET
    //@Path("lieu/{ville_ou_pays}")
    //@Produces("application/json")
        //public String[] guide1(@PathParam("ville_ou_pays") String lieu) {
            //return new String[]{

                    //"Visite du centre historique de " + lieu,
                    //"Découverte du musée principal de " + lieu
            //};


  // }
    //@GET
//@Path("lieu/{ville_ou_pays}")
//@Produces("application/json")
//public String guide(@PathParam("ville_ou_pays") String lieu) {
//return lieu;
//    }




    }