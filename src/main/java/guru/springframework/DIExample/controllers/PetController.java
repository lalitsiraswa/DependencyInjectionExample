package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.PetService;
import guru.springframework.DIExample.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

//    public PetController(@Qualifier("petService") PetService petService) {
//        this.petService = petService;
//    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
