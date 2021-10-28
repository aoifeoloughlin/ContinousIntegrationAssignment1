pipeline {
   agent any
   stages {
    stage('Clone Github Repo') {
      steps {
        script {
           echo 'Create New Branch'
           //create new branch

           withCredentials([gitUsernamePassword(credentialsId: 'a8f79aa4-6d55-42a2-bfe2-cfd108534b41', gitToolName: 'Default')]) {
             sh 'git fetch --all'

             sh "git branch -a"
           }

            echo 'Clone Github repo to new branch'

            echo 'Checkout to the new branch'

         }
       }
    }
    stage('Build and Compile new Project'){
        steps{
          script{
             echo 'Compile and Build Project'
            }
        }
    }
    stage('Running JUnit Test'){
        steps{
            scripts{
                echo 'Running JUnit Testing'
            }
        }
    }

    stage('Deploy War File'){
        steps{
            scripts{
                echo 'Deploying War File'
            }
        }
    }
  }
}