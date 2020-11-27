package com.eduardnow.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Dev";
    }
}
