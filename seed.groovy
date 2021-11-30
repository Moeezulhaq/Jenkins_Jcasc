job("seed") {
    if (binding.hasVariable('RUN_AFTER_BOOT')) { // Only true when creating a new jenkins instance or reloading config
        triggers {
            cron("H/2 * * * *")
        }
    }
    ......
}
