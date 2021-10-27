pipeline {
   agent any
   stages {
    stage('Clone Github Repo') {
      steps {
        script {
           // The below will clone your repo and will be checked out to master branch by default.
           git(credentialsId:'a8f79aa4-6d55-42a2-bfe2-cfd108534b41', url:'ssh://aoifeoloughlin@github.com/ContinousIntegrationAssignment1.git')
            echo 'Make the output directory'

          }
       }
    }
  }
}