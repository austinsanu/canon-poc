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
     
	   stage('Exec Maven-Build') 
     {  	steps {
                 	// rtMaven.tool = 'M2'
	     		sh "echo 'Under Maven Build stage'"
	              	// rtMaven.run pom: 'pom.xml', goals: 'clean verify build package javadoc:javadoc '
	     		sh 'mvn clean package'
	              	archiveArtifact artfacts: '**/target/*.war', fingerprint: true
	              }
     }
	  
  }         
        
}
                
