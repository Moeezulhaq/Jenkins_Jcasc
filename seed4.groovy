pipelineJob('github-demo') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('Moeezulhaq/Jenkins_test')
                    }
                }
            }
        }
    }
}

pipelineJob('second pipeline') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('Moeezulhaq/Jenkins_test')
                    }
                }
            }
        }
    }
}