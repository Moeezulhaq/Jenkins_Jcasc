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

pipelineJob('3 pipeline') {
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

pipelineJob('4 pipeline') {
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

pipelineJob('5 pipeline') {
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

pipelineJob('6 pipeline') {
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

pipelineJob('7 pipeline') {
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