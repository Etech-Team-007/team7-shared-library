def call(String repoUrl){
    pipeline{
        agent any
        stages{
            stage("Tools Initialization"){
                 steps{
                    sh 'ls'
                    sh 'java -version'
                 }
            }
            stage("Checkout Code"){
                steps{
                    git branch: 'main'
                    url: "${repoUrl}"
                }
            }
            stage("To-test-Code"){
                steps{
                    sh 'lsblk'
                }
            }
        }
    }
}