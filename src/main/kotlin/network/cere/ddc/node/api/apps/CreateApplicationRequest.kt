package network.cere.ddc.node.api.apps

data class CreateApplicationRequest(
    val appPubKey: String,
    val tierId: String,
    val signature: String
)
