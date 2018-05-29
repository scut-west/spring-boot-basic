pipeline {
    agent any

    environment {
        NameSpace='team11'
        WebServer='172.31.12.139'
        port='8110'
    }

    stages {
        stage ('Pull Git Code') {
            steps {
                step([$class: 'WsCleanup'])
                git branch: 'master', url: 'https://github.com/zhousk/spring-boot-basic.git'
            }
        }

        stage('Sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}