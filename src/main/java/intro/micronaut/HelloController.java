package intro.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class PessoaController {

    @Get
    public Pessoa getPessoa() {
        return new Pessoa();
    }

}
