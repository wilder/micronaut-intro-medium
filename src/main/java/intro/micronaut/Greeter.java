package intro.micronaut;

import javax.inject.Singleton;

interface Greeter {
    String greet(String name);
}

@Singleton
class SimpleGreeter implements Greeter {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }

}
