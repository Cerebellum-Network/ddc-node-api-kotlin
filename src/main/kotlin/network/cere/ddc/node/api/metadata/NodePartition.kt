package network.cere.ddc.node.api.metadata

data class NodePartition(
    val id: String,
    val appPubKey: String,
    val status: NodePartitionStatus,
    val isMaster: Boolean,
    val ringToken: Long
)
