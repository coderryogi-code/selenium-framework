pipeline {


agent any

tools {

    maven 'Maven'
}

parameters {

     choice(
        name: 'BROWSER',
        choices: ['chrome', 'edge', 'firefox'],
        description: 'Select Browser'
    )

}

stages {

    stage('Git Checkout') {

        steps {

            echo "Fetching latest code from GitHub"

            git branch: 'main',
            url: 'https://github.com/coderryogi-code/selenium-framework.git'
        }
    }

    stage('Clean Project') {

        steps {

            echo "Cleaning project"

            sh 'mvn clean'
        }
    }

    stage('Build Project') {

        steps {

            echo "Building project"

            sh 'mvn compile'
        }
    }

    stage('Execute Tests') {

        steps {

            echo "Executing automation tests"

            sh "mvn test -Dbrowser=${params.BROWSER}"
        }
    }
}

post {

    always {

        cucumber buildStatus: 'UNSTABLE',
fileIncludePattern: '**/target/output.json',
            sortingMethod: 'ALPHABETICAL'
    }

    success {

        echo 'Execution completed successfully'
    }

    failure {

        echo 'Execution failed'
    }
}


}
