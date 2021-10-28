pipeline {
 agent any
   stages {
    stage('Set Up Project'){
        steps{
            bat 'gradlew.bat clean'
        }
    }
    stage('Build Project'){
        steps{
            bat 'gradlew.bat build'
        }
    }

    stage('Test Project'){
        steps{
           bat 'gradlew.bat test'
        }
    }
  }
}