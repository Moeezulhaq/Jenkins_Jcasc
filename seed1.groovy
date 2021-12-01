job('demo') {
    steps {
        shell('echo Hello World!')
    }
}

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
            // scriptPath('declarative-examples/simple-examples/environmentInStage.groovy')
        }
    }
}