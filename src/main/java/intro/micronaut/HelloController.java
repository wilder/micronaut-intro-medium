package intro.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {

    private Greeter greeter;

    @Inject // optional annotation
    public HelloController(final Greeter greeter) {
        this.greeter = greeter;
    }

    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(String name) {
        return greeter.greet(name);
    }

}
