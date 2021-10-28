pipeline {
   agent any
   stages {
    stage('Build and Compile new Project'){
        steps{
            sh './gradlew clean'
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