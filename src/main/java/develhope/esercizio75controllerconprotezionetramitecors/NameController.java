package develhope.esercizio75controllerconprotezionetramitecors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class NameController {

    @GetMapping(path = "/getName")
    public String getName(@RequestParam(value = "nome", required = true) String nome) {
        return nome;
    }

    @PostMapping(path = "/getReverseName")
    public String reverseName(@RequestParam(value = "nome", required = true) String nome) {
        return new StringBuilder(nome).reverse().toString();
    }
}