def call(String repoUrl){
pipeline{
       agent any
       stages{
           stage('Tools-initialization'){
               steps{
                   sh 'ls'
                   sh 'java -version'
               }
           }
           stage('Checkout-Code'){
               steps{
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage('to-test-code'){
               steps{
                   sh 'lsblk'
               }
           }
       }
    }
}