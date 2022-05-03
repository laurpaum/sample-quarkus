package fr.upshift.demo;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingService {

    @ConfigProperty(name = "greeting.message")
    String message;

    @ConfigProperty(name = "greeting.name")
    Optional<String> name;

    @ConfigProperty(name = "greeting.suffix", defaultValue = "!")
    String suffix;

    public String getGreeting() {
        return message + " " + name.orElse("world") + suffix;
    }
}
