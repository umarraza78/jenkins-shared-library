def call(Map config = [:]) {
    // Validation
    if (!config.message) {
        error "notifySlack: 'message' parameter is required!"
    }
    
    // Call the class logic
    def notify = new org.umarteam.NotificationService(this)
    notify.sendSlack(config.message, config.credentialId ?: 'slack-webhook-id')
}
