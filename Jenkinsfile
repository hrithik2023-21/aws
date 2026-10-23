
pipeline {
    agent any

    environment {
        APP_NAME = 'MyJavaApp'
        ENVIRONMENT = 'DEV'
    }
     parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'QA', 'PROD'],
            description: 'Select deployment environment'
        )
    }

    stages {
        stage('Get the source code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/hrithik2023-21/aws.git'
            }
        }

        stage('Compile the code') {
            steps {
                echo " Build the application: ${APP_NAME}"
                echo " Environment: ${ENVIRONMENT}"
                bat 'mvn clean package'
            }
        }
    }
}
