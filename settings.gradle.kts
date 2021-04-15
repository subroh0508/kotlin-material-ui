pluginManagement {
    resolutionStrategy {
        plugins {
            kotlin("js") version "1.4.30"
        }
    }
}


include(
    "core",
    "lab",
    "pickers",
    "pickers:date-io",
    "pickers:date-io:date-fns",
    "pickers:date-io:dayjs",
    "pickers:date-io:luxon",
    "pickers:date-io:moment",
    "sample"
)
