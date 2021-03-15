package network.cere.ddc.node.api.metadata

data class NodeMetadata(
    val nodeId: String,
    val httpAddr: String,
    val totalPartitions: Int,
    val reservedPartitions: Int,
    val availablePartitions: Int,
    val status: NodeStatus
)
