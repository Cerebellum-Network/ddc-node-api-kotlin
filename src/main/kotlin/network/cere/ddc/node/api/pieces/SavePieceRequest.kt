package network.cere.ddc.node.api.pieces

import java.time.Instant

data class SavePieceRequest(
    val id: String,
    val appPubKey: String,
    val userPubKey: String,
    val timestamp: Instant,
    val data: String,
    val signature: String
)
