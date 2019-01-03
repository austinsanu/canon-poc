Pipeline {
 agent any
 
 stages 
 { 
	   stage('Access GitHub') 
     { 		 steps {
                	echo 'Accessing GitHub ...'
                	git url: 'https://github.com/austinsanu/canon-poc.git', branch: '2018-November-Sprint'
		        }
     }
      
	   stage('Exec Maven-Build') 
     {  	steps {
                 	rtMaven.tool = 'M2'
	              	rtMaven.run pom: 'pom.xml', goals: 'clean verify build package javadoc:javadoc '
	              	archiveArtifact artfacts: '**/target/*.war', fingerprint: true
	              }
     }
	   stage('Test')
     {          steps {
		        sh 'make check || true'
		         junit '**/target/*.xml'
	 	       }
     }
		 
			 
  }         
        
}
                
