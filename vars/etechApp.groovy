def call(String repoUrl){
pipeline{
	agent any 
	stages{
		stage('Checkout'){
			steps{
				checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'appBankcreds', url: 'https://github.com/Etech-Team-007/team7-multibuildjob.git']])
			}
		}
		stage('Code Deploy To feature'){
			parallel{
				stage('1-Ida'){
					steps{
						echo "Ida Nzengung"
					}
				}
				stage('2-Allon'){
					steps{
						echo "Allon Jose"
					}
				}
			}
        }
		stage('Design'){
			parallel{
				stage('3-Terence'){
					steps{
						echo "Terence-Fomenky"
					}
				}
				stage('4-Desmond'){
					steps{
						echo "Desmond Asaha"
					}
				}
			}
		}
		stage('Testing/Deployment'){
			parallel{
				stage('5-Therese'){
					steps{
						echo "Therese Meylam"
					}
				}
				stage('6-Jarvis'){
					steps{
						echo "Jarvis Esele"
					}
				}
                stage('security_check'){
                    steps{
                        sh 'bash -x /var/lib/jenkins/workspace/sys_stats.sh'
                    }
                }
			}
		}
		
	}
}
}