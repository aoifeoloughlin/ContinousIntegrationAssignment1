pipeline {
   agent any
   stages {
    stage('Clone Github Repo') {
      steps {
        script {
           // The below will clone your repo and will be checked out to master branch by default.
           git credentialsId:'54445cc0-a970-4485-8165-16c05635d4b5', branch:'master', url:'https://github.com/aoifeoloughlin/ContinuousIntegrationAssignment1.git'
            echo 'Make the output directory'

          }
       }
    }
  }
}