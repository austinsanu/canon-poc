#!groovy
pipeline {
 agent any
	tools {
		maven 'M2'
		//jdk 'jdk8'
	}
 stages 
 { 
     timeout(time:5, unit:'MINUTES') {	 
	 stage('Example') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob,any user,jenkins"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
	      }
            }     
            steps {
                echo "Hello, ${PERSON}, nice to meet you."
            }
        }
 }	 
	 
	   stage('Access GitHub') 
     { 		 steps {
                	sh "echo 'Accessing GitHub ...'"
	     		echo "PATH = ${PATH}"
                    	echo "M2_HOME = ${M2_HOME}"
                	git url: 'https://github.com/austinsanu/canon-poc.git', branch: '2018-November-Sprint'
	     		// git url: 'https://github.com/austinsanu/canon-poc.git', branch: 'Test'
		        }
     }
     
	   stage('Exec Maven-Build') 
     {  	steps {
                 	// rtMaven.tool = 'M2'
	     		sh "echo 'Under Maven Build stage'"
	              	// rtMaven.run pom: 'pom.xml', goals: 'clean verify build package javadoc:javadoc '
	     		// sh 'mvn clean package'
	     		sh 'mvn -Dmaven.test.failure.ignore=true install javadoc:javadoc'
	              	// archiveArtifact artfacts: '**/target/*.war', fingerprint: true
	              }
      		post {
			success {
				junit 'target/surefire-reports/**/*.xml'
			}
		}	
	      
     }
	 stage('SonarQuality-Analysis')
	 { steps {
		 sh "echo 'Inside SonarAnalysis ...'"
		 sh 'mvn  sonar:sonar -Dsonar.projectKey=austinsanu_canon-poc -Dsonar.organization=austinsanu-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=01782f6ecb3cad38557ad815638d8a4a4da11986'	
	 	}
	 }		 
	  
  }         
        
}            
