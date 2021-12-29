# jenkins-demo

## commands
1. 'gradle docker'
2. 'gradle dockerRun'
    * open jenkins http://localhost:8080
    * create job: seed
    * add git repository
3. 'docker ps'
   * 'docker cp 85d:/var/jenkins_home/jobs/seed/config.xml seedjob.xml'
   * {85d} - first three characters of container ID
