package br.com.teste.controller;

import br.com.teste.model.Fruta;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/frutas")
public class FrutaController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> getFrutas() {
        return Fruta.listAll();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void createFruta() {
        Fruta fruta = new Fruta();
        fruta.nome = "Maça";
        fruta.qtd = 5;
        fruta.persist();
    }
}
