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
                        github('https://github.com/Moeezulhaq/Jenkins_ECS.git')
                    }
                }
            }
            // scriptPath('declarative-examples/simple-examples/environmentInStage.groovy')
        }
    }
}