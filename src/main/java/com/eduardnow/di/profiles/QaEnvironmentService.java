package com.eduardnow.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Qa";
    }
}
