pipelineJob('pipelineJob') {
    definition {
        cps {
            script (readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/3d3n/spring-boot-api-example.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}