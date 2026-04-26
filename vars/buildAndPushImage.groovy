def call(Map config = [:]) {
    if (!config.name || !config.tag) {
        error "buildAndPushImage: 'name' and 'tag' are required!"
    }
    def docker = new org.umarteam.DockerHelper(this)
    docker.buildImage(config.name, config.tag)
    docker.pushImage(config.name, config.tag)
}
