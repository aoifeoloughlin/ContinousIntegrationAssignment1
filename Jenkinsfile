pipeline {
   agent any
   stages {
    stage('Clone Github Repo') {
      steps {
        script {
           // The below will clone your repo and will be checked out to master branch by default.
           git url: 'https://github.com/aoifeoloughlin/ContinuousIntegrationAssignment1.git'
            echo 'Make the output directory'
           //sh "ls -lart ./*"
           // List all branches in your repo.
           sh "git branch -a"
           // Checkout to a specific branch in your repo.
           //sh "git clone master"
          }
       }
    }
  }
}