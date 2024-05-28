package br.com.alura.service;

import br.com.alura.service.client.ClientHttpConfiguration;
import br.com.alura.service.service.AbrigoService;
import br.com.alura.service.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command{
    @Override
    public void execute() {

        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();

        }catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
