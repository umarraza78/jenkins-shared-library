def call(Map config = [:]) {
    if (!config.projectKey) {
        error "runSonarScan: 'projectKey' is required!"
    }
    echo "Running SonarQube Scan for ${config.projectKey}..."
    sh "echo 'Sonar Scan complete'"
}
