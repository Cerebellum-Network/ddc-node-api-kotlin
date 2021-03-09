package network.cere.ddc.node.api.metadata

data class NodeMetadata(
    val peerId: String,
    val httpAddr: String,
    val totalPartitions: Int,
    val reservedPartitions: Int,
    val availablePartitions: Int,
    val status: NodeStatus
)
