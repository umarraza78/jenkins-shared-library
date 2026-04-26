package org.umarteam

class DockerHelper implements Serializable {
    def script
    DockerHelper(script) { this.script = script }

    def buildImage(String name, String tag) {
        script.echo "Building Docker image: ${name}:${tag}"
        script.sh "docker build -t ${name}:${tag} ."
    }

    def pushImage(String name, String tag) {
        script.echo "Pushing Docker image: ${name}:${tag}"
        script.sh "docker push ${name}:${tag}"
    }
}
