package org.umarteam

class NotificationService implements Serializable {
    def script

    NotificationService(script) {
        this.script = script
    }

    def sendSlack(String message, String credentialId) {
        script.slackSend(
            color: 'good',
            message: message,
            tokenCredentialId: credentialId
        )
    }
}
