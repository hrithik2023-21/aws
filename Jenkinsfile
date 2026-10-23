
pipeline {
    agent any

    stages {
        stage('Get the source code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/hrithik2023-21/aws.git'
            }
        }

        stage('Compile the code') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}
