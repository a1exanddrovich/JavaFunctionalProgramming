package com.stepik.course.tasks.t4_4;

import java.util.Optional;

public class Rocket {

    private final NavigationModule navigationModule;

    public Rocket(NavigationModule navigationModule) {
        this.navigationModule = navigationModule;
    }

    public Optional<NavigationModule> getNavigationModule() {
        return Optional.ofNullable(navigationModule);
    }

}
