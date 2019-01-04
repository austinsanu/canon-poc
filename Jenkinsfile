pipeline {
 agent any
 // def rtMaven.tool = 'M2'
 stages 
 { 
	   stage('Access GitHub') 
     { 		 steps {
                	sh "echo 'Accessing GitHub ...'"
                	git url: 'https://github.com/austinsanu/canon-poc.git', branch: '2018-November-Sprint'
	     		// git url: 'https://github.com/austinsanu/canon-poc.git', branch: 'Test'
		        }
     }
     /* 
	   stage('Exec Maven-Build') 
     {  	steps {
                 	// rtMaven.tool = 'M2'
	     		sh "echo 'Under Maven Build stage'"
	              	// rtMaven.run pom: 'pom.xml', goals: 'clean verify build package javadoc:javadoc '
	     		sh 'mvn clean package'
	              	archiveArtifact artfacts: '**/target/*.war', fingerprint: true
	              }
     }
	   stage('Test')
     {          steps {
	     		 sh "echo 'Under Test Stage'"
		         sh 'make check || true'
		         junit '**/target/*.xml'
	 	       }
     }
		 
	 stage('SonarQuality Analsis')
	 {
           	// rtMaven.run pom: 'pom.xml', goals: 'sonar:sonar -Dsonar.projectKey=austinsanu_canon-poc -Dsonar.organization=austinsanu-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=01782f6ecb3cad38557ad815638d8a4a4da11986'
		 steps {
		 	sh "echo 'SonarCloud Analysing...'"
           		// def sonarqube -Dsonar.host.url='https://sonarcloud.io'
          		withSonarQubeEnv('SonarCloud') {
              		// rtMaven.run pom: 'pom.xml', goals: 'clean package sonar:sonar -Dsonar.projectKey=austinsanu_canon-poc -Dsonar.organization=austinsanu-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=01782f6ecb3cad38557ad815638d8a4a4da11986'
              		// rtMaven.run pom: 'pom.xml', goals: 'sonar:sonar -Dsonar.projectKey=austinsanu_canon-poc -Dsonar.organization=austinsanu-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=01782f6ecb3cad38557ad815638d8a4a4da11986'
			sh 'mvn goals: sonar:sonar -Dsonar.projectKey=austinsanu_canon-poc -Dsonar.organization=austinsanu-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=01782f6ecb3cad38557ad815638d8a4a4da11986'	
	  				} 
		  	}
	  }	
	  */
  }         
        
}
                
