@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('1st Stage') {
            steps {
                hellowWorld()
            }
        }
        stage('2nd Stage') {
            steps {
                mavenBuild()
            }
        }
    }
}
