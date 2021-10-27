pipeline {
   agent any
   stages {
    stage('Clone Github Repo') {
      steps {
        script {
           // The below will clone your repo and will be checked out to master branch by default.
           git branch:'master' url:'https://github.com/aoifeoloughlin/ContinuousIntegrationAssignment1.git'
            echo 'Make the output directory'

          }
       }
    }
  }
}