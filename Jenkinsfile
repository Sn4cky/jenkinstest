pipeline {
    agent any
    stages {
        stage("build-product") {
            when {
                changeset "**/Jenkinsfile"
            }
            steps {
                script {
                    sh "echo building product with changes"
                    sh "echo setting new project displayname"
                    currentBuild.rawBuild.project.displayName("pipeline-test-2")
                }
            }
        }
        stage("build-project") {
            steps {
                sh "echo building project"
            }
        }
        stage("deploy") {
            steps {
                sh "echo deploying project..."
            }
        }
    }
}
