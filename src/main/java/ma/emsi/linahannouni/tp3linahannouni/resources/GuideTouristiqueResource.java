package ma.emsi.linahannouni.tp3linahannouni.resources;


import jakarta.ws.rs.*;


@Path("/guide")
public class GuideTouristiqueResource {


    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces("application/json")
        public String[] guide(@PathParam("ville_ou_pays") String lieu) {
            return new String[]{

                    "Visite du centre historique de " + lieu,
                    "Découverte du musée principal de " + lieu
            };
   }




    }