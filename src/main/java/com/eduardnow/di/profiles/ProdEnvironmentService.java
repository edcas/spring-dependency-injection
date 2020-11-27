package com.eduardnow.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Prod";
    }
}
